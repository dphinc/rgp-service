package com.fanduel.rgp.service.model.profile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.util.List;

@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
@ToString
public class RgpDepositLimits {
    @Getter @Setter private List<RgpLimits> proposed;
    @Getter @Setter private List<RgpLimits> accepted;
}
