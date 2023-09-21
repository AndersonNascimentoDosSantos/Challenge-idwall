package com.idwall.challengeapi.entities.FBI;

import org.springframework.stereotype.Component;

@Component
public class FBIResponse {
    private int total;
    private Item[] items;

    public int getTotal() {
        return total;
    }

    public Item[] getItems() {
        return items;
    }
}
