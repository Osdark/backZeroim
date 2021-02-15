package com.zeroim.client.gateway;

import com.zeroim.client.entity.IdType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IdTypeRepo {
    Mono<IdType> create(IdType idType);
    Mono<IdType> getById(String id);
    Mono<Void> delete(String id);

    Flux<IdType> getAll();
}
