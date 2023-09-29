package com.idwall.challengeapi.interfaces;

import java.util.HashMap;
import java.util.Map;

public enum PosterClassification {
    CRIMES_AGAINST_CHILDREN("crimes-against-children", "Crimes Against Children"),
    DEFAULT("default","Wanted: Violent, Cyber, White Collar, Criminal Enterprise, etc"),
    ECAP("ecap","ECAP"),
    INFORMATION("information","Seeking Information"),
    KIDNAPPING("kidnapping","Kidnapping"),
    LAW_ENFORCEMENT_ASSISTANCE("law-enforcement-assistance","Law Enforcement Assistance"),
    MISSING("missing-persons","Missing Persons"),
    MOST("most-wanted","Most Wanted"),
    TEN("ten-most-wanted","Ten Most Wanted"),
    TERRORIST("terrorist","Terrorist");


    private final String value;
    private final String description;

    // Mapeamento para pesquisa eficiente com base no valor da chave
    private static final Map<String, PosterClassification> VALUE_MAP = new HashMap<>();

    static {
        for (PosterClassification classification : PosterClassification.values()) {
            VALUE_MAP.put(classification.getValue(), classification);
        }
    }

    PosterClassification(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    // Método estático para obter o enum com base no valor da chave
    public static PosterClassification getByValue(String value) {
        return VALUE_MAP.get(value);
    }
}

