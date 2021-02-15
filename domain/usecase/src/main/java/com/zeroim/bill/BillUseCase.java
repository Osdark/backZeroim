package com.zeroim.bill;

import com.zeroim.bill.entity.Bill;
import com.zeroim.bill.entity.BillDetail;
import com.zeroim.bill.gateway.BillRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.List;

public class BillUseCase {
    private final BillRepo billRepo;

    public BillUseCase(BillRepo billRepo) {
        this.billRepo = billRepo;
    }

    public Mono<Bill> create(Bill bill) {
        BigDecimal totalValue = BigDecimal.ZERO;

        List<BillDetail> billDetailList = bill.getBillDetail();
        for (BillDetail billDetail : billDetailList) {
            BigDecimal detailValue = billDetail.getUnitValue()
                    .multiply(BigDecimal.valueOf(billDetail.getQuantity()));
            billDetail.setTotalValue(billDetail.getTotalValue().add(detailValue));
            totalValue = totalValue.add(detailValue);
        }

        bill.setTotal(totalValue);
        return billRepo.create(bill);
    }

    public Mono<Bill> getById(String id) {
        return billRepo.getById(id);
    }

    public Mono<Void> delete(String id) {
        return billRepo.delete(id);
    }

    public Flux<Bill> getAll() {
        return billRepo.getAll();
    }
}
