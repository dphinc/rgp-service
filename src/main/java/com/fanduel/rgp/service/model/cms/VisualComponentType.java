package com.fanduel.rgp.service.model.cms;

import lombok.Getter;

public enum VisualComponentType {
    IMAGE("IMAGE"),
    VIDEO("VIDEO");

    @Getter private String value;

    private VisualComponentType(String value) {
        this.value = value;
    }
}
