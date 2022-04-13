package com.fanduel.rgp.service.model.cms;

import lombok.Getter;

public enum ProductType {
    DFS("FanDuel Fantasy Sports"),
    CASINO("FanDuel Casino"),
    SBK("FanDuel Sprots Book");

    @Getter private String value;

    private ProductType(String value) {
        this.value = value;
    }
}
