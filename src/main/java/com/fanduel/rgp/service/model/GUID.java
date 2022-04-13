package com.fanduel.rgp.service.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.util.UUID;

@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Slf4j
public class GUID {
    @Getter @Setter private UUID uuid;
}
