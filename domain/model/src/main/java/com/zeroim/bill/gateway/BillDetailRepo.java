package com.zeroim.bill.gateway;

import com.zeroim.bill.entity.BillDetail;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BillDetailRepo {
    Mono<BillDetail> create(BillDetail billDetail);
    Mono<BillDetail> getById(String id);
    Mono<Void> delete(String id);

    Flux<BillDetail> getAll();
}
