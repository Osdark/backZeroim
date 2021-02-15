package com.zeroim.client.gateway;

import com.zeroim.client.entity.Buyer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BuyerRepo {
    Mono<Buyer> create(Buyer buyer);
    Mono<Buyer> getById(String buyerId);
    Mono<Void> delete(String buyerId);

    Flux<Buyer> getAll();
}
