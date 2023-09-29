package com.idwall.challengeapi.interfaces;

import java.util.HashMap;
import java.util.Map;

public enum PersonClassification {
    MAIN("Main"),
    VICTMIM("Victim"),
    ACCOMPLICE("Accomplice");

    private final String value;
    private static final Map<String, PersonClassification> VALUE_MAP = new HashMap<>();

    static {
        for (PersonClassification personClassification : PersonClassification.values()) {
            VALUE_MAP.put(personClassification.getValue(), personClassification);
        }
    }
    PersonClassification(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // Método estático para obter o enum com base no valor da chave
    public static PersonClassification getByValue(String value) {
        return VALUE_MAP.get(value);
    }
}

