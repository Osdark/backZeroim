package com.zeroim.bill;

import com.zeroim.bill.entity.Bill;
import com.zeroim.bill.entity.BillDetail;
import com.zeroim.bill.gateway.BillRepo;
import com.zeroim.product.entity.Product;
import com.zeroim.product.gateway.ProductRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.List;

public class BillUseCase {
    private final BillRepo billRepo;
    private final ProductRepository productRepository;

    public BillUseCase(BillRepo billRepo, ProductRepository productRepository) {
        this.billRepo = billRepo;
        this.productRepository = productRepository;
    }

    public Mono<Bill> create(Bill bill) {
        BigDecimal totalValue = BigDecimal.ZERO;

        List<BillDetail> billDetailList = bill.getBillDetail();



        for (BillDetail billDetail : billDetailList) {
            BigDecimal detailValue = billDetail.getUnitValue()
                    .multiply(BigDecimal.valueOf(billDetail.getQuantity()));
            billDetail.setTotalValue(billDetail.getTotalValue().add(detailValue));

            Product product = productRepository.getProductById(billDetail.getProductId()).toProcessor().block();
            billDetail.setProductName(product.getName());
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
