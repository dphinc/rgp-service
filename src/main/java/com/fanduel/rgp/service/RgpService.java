package com.fanduel.rgp.service;

import com.fanduel.rgp.service.model.GUID;
import com.fanduel.rgp.service.model.cms.Rgp;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RgpService {
    void create(Rgp rgp);
    Mono<Rgp> findById(GUID id);
    Flux<Rgp> findAll();
    Mono<Rgp> update(Rgp rgp);
    Mono<Void> delete(GUID id);
}
