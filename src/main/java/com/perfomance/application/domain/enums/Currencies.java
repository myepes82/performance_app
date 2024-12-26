package com.perfomance.application.domain.enums;

import java.util.Arrays;

public enum Currencies {
    COP,
    USD;

    public static Currencies getFromValue(String value) {
        return Arrays.stream(Currencies.values())
                .filter(currency -> currency.name().equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid currency: " + value));
    }
}
