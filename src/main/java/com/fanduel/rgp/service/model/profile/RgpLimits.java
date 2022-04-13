package com.fanduel.rgp.service.model.profile;

import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Data
public class RgpLimits {
    private double daily;
    private double weekly;
    private double monthly;
}
