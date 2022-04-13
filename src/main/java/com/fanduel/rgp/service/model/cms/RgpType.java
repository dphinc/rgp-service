package com.fanduel.rgp.service.model.cms;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
@ToString
public enum RgpType {
    SPORTS_BOOK("Sports Book"),
    HORSE_RACING("Horse Racing"),
    CASINO("Casino"),
    FANTASY("Fantasy Sports");

    private String value;

    RgpType(String s) {
    }
}
