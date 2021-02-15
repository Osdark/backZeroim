package com.zeroim.stock.gateway;

import com.zeroim.stock.entity.StockItem;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StockItemRepo {
    Mono<StockItem> create(StockItem stockItem);
    Mono<StockItem> getById(String id);
    Mono<Void> delete(String id);

    Flux<StockItem> getAll();
}
