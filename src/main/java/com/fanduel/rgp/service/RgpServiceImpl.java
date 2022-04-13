package com.fanduel.rgp.service;

import com.fanduel.rgp.service.model.GUID;
import com.fanduel.rgp.service.model.cms.Rgp;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RgpServiceImpl implements RgpService {

    public void create(Rgp rgp) {
    }

    @Override
    public Mono<Rgp> findById(GUID id) {
        return null;
    }

    @Override
    public Flux<Rgp> findAll() {
        return null;
    }

    @Override
    public Mono<Rgp> update(Rgp rgp) {
        return null;
    }

    @Override
    public Mono<Void> delete(GUID id) {
        return null;
    }
}
