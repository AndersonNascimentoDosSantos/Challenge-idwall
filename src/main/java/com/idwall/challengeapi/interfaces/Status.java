package com.idwall.challengeapi.interfaces;

import java.util.HashMap;
import java.util.Map;

public enum Status {
//     na, captured, recovered, located, surrendered, deceased
    NA("na"),
    CAPTURED("captured"),
    LOCATED("located"),
    SURRENDED("surrendered"),
    DECEASED("deceased"),
    RECOVERED("recovered");

    private final String value;
    private static final Map<String, Status> VALUE_MAP = new HashMap<>();

    static {
        for (Status sortDate : Status.values()) {
            VALUE_MAP.put(sortDate.getValue(), sortDate);
        }
    }
    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public static Status getByValue(String value) {
        return VALUE_MAP.get(value);
    }
}

