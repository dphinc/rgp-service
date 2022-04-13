package com.fanduel.rgp.service.model.cms;

import com.fanduel.rgp.service.model.GUID;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Rgp {
    private GUID guid;
    private ComponentBase component;
}
