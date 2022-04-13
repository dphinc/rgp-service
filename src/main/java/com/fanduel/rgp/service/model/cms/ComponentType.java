package com.fanduel.rgp.service.model.cms;

import lombok.Getter;

public enum ComponentType {
    TEXT("TEXT"),
    DATA("DATA"),
    URL("URL");

    @Getter private String value;

    private ComponentType(String value) {
        this.value = value;
    }
}
