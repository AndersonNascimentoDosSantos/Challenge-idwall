package com.idwall.challengeapi.interfaces;

import java.util.HashMap;
import java.util.Map;

public enum SortOrder {
    ASC("asc"),
    DESC("desc");

    private final String value;
    private static final Map<String, SortOrder> VALUE_MAP = new HashMap<>();

    static {
        for (SortOrder sortDate : SortOrder.values()) {
            VALUE_MAP.put(sortDate.getValue(), sortDate);
        }
    }
    SortOrder(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public static SortOrder getByValue(String value) {
        return VALUE_MAP.get(value);
    }
}

