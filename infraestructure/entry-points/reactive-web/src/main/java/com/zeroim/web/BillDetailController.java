package com.zeroim.web;

import com.zeroim.bill.BillDetailUseCase;
import com.zeroim.bill.entity.BillDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(value = "*")
public class BillDetailController {
    @Autowired
    private BillDetailUseCase billDetailUseCase;

    @PostMapping(value = "/billDetail")
    public Mono<BillDetail> create(@RequestBody BillDetail billDetail) {
        return billDetailUseCase.create(billDetail);
    }

    @GetMapping(value = "/billDetail/{id}")
    public Mono<BillDetail> getById(@PathVariable String id) {
        return billDetailUseCase.getById(id);
    }

    @DeleteMapping(value = "/billDetail/delete/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return billDetailUseCase.delete(id);
    }

    @GetMapping(value = "/billDetail/getAll")
    public Flux<BillDetail> getAll() {
        return billDetailUseCase.getAll();
    }
}
