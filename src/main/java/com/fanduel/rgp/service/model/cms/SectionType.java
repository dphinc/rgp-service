package com.fanduel.rgp.service.model.cms;

import lombok.Getter;

public enum SectionType {
    PARENTAL_CONTROLS("Parental Controls"),
    TIMEOUT("Timjeout"),
    HELP("Help"),
    LIMITATIONS("Limitatiopns"),
    LIMITATIONS_ACCORDIAN("Limitations - Accordian");

    @Getter private String value;

    private SectionType(String value) {
        this.value = value;
    }

    }
