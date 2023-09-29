package com.idwall.challengeapi.interfaces;

import java.util.HashMap;
import java.util.Map;

public enum SortDate {
    PUBLICATION("publication"),
    MODIFIED("modified");

    private final String value;
    private static final Map<String, SortDate> VALUE_MAP = new HashMap<>();

    static {
        for (SortDate sortDate : SortDate.values()) {
            VALUE_MAP.put(sortDate.getValue(), sortDate);
        }
    }
    SortDate(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    // Método estático para obter o enum com base no valor da chave
    public static SortDate getByValue(String value) {
        return VALUE_MAP.get(value);
    }
}

