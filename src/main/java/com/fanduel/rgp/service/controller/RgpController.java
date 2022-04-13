package com.fanduel.rgp.service.controller;

import com.fanduel.rgp.service.RgpServiceImpl;
import com.fanduel.rgp.service.model.GUID;
import com.fanduel.rgp.service.model.cms.Rgp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class RgpController {
    @Autowired
    private RgpServiceImpl rgpServiceImpl;

    @RequestMapping(value = {"/create", "/"}, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Rgp rgp) {
        rgpServiceImpl.create(rgp);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Mono<Rgp>> findById(@PathVariable("id") GUID id) {
        Mono<Rgp> e = rgpServiceImpl.findById(id);
        HttpStatus status = e != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<Mono<Rgp>>(e, status);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Rgp> findAll() {
        return rgpServiceImpl.findAll();
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public Mono<Rgp> update(@RequestBody Rgp rgp) {
        return rgpServiceImpl.update(rgp);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") GUID id) {
        rgpServiceImpl.delete(id).subscribe();
    }
}



