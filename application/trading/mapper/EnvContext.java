package ru.application.trading.mapper;

import lombok.Builder;
import lombok.Value;

/** Общий контекст для сборки Envelope и ключей. */
@Value
@Builder
public class EnvContext {
    String tenant;
    String environment;  // dev/stage/prod
    String board;        // MISX/TQBR ...
    String code;         // SBER / RU000A103976
    String symbol;       // CODE@BOARD
    String instrumentId; // из справочника Finam
    String producerId;   // имя/версия продьюсера
    String source;       // "finam.quote" / "finam.trade" / ...
    String correlationId;
    String traceId;
}
