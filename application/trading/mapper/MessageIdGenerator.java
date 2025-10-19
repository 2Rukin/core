package ru.application.trading.mapper;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.time.Clock;
import java.util.Arrays;

/**
 * Генерирует ULID-совместимые идентификаторы сообщений.
 * <p>
 * Реализация адаптирована для минимальной зависимости от сторонних библиотек и поддерживает
 * монотонность в пределах одного миллисекундного таймстемпа.
 * </p>
 */
@Component
public class MessageIdGenerator {

    private static final char[] ENCODING = "0123456789ABCDEFGHJKMNPQRSTVWXYZ".toCharArray();
    private static final int RANDOM_BYTES = 10;

    private final SecureRandom random = new SecureRandom();
    private final Clock clock;

    private long lastTimestamp = -1L;
    private byte[] lastRandom = new byte[RANDOM_BYTES];

    public MessageIdGenerator(Clock clock) {
        this.clock = clock;
    }

    /**
     * Возвращает новый ULID-идентификатор.
     *
     * @return строка длиной 26 символов, состоящая из Crockford Base32
     */
    public synchronized String next() {
        long timestamp = clock.millis();
        byte[] randomness;
        if (timestamp == lastTimestamp) {
            randomness = Arrays.copyOf(lastRandom, RANDOM_BYTES);
            if (!increment(randomness)) {
                // Переполнение — перегенерируем случайные байты
                randomness = randomBytes();
            }
        } else {
            randomness = randomBytes();
            lastTimestamp = timestamp;
        }
        lastRandom = Arrays.copyOf(randomness, RANDOM_BYTES);
        return encode(timestamp, randomness);
    }

    private byte[] randomBytes() {
        byte[] data = new byte[RANDOM_BYTES];
        random.nextBytes(data);
        return data;
    }

    private boolean increment(byte[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            int value = (data[i] & 0xFF) + 1;
            data[i] = (byte) value;
            if (value <= 0xFF) {
                return true;
            }
        }
        return false;
    }

    private String encode(long timestamp, byte[] randomness) {
        char[] buffer = new char[26];
        long value = timestamp;
        for (int i = 9; i >= 0; i--) {
            buffer[i] = ENCODING[(int) (value & 0x1F)];
            value >>>= 5;
        }
        int index = 10;
        int bitBuffer = 0;
        int bitCount = 0;
        for (byte b : randomness) {
            bitBuffer = (bitBuffer << 8) | (b & 0xFF);
            bitCount += 8;
            while (bitCount >= 5) {
                bitCount -= 5;
                buffer[index++] = ENCODING[(bitBuffer >> bitCount) & 0x1F];
            }
        }
        if (bitCount > 0) {
            buffer[index] = ENCODING[(bitBuffer << (5 - bitCount)) & 0x1F];
        }
        return new String(buffer);
    }
}
