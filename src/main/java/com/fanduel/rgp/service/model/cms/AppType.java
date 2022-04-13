package com.fanduel.rgp.service.model.cms;

import lombok.Getter;

public enum AppType {
    DFS("FanDule SportsBook"),
    DYNAMIC_AW("Dynamic AW"),
    SB_AW("SprotsBook AW"),
    CASINO_AW("Casino AW"),
    BETFAIR_CASINO("Betfair Casino"),
    STARDUST_CASINO("Stardust  Casino");

    @Getter
    private String value;

    private AppType(String value) {
        this.value = value;
    }

}
