package com.zeroim.configuration;

import com.zeroim.bill.BillUseCase;
import com.zeroim.bill.gateway.BillRepo;
import com.zeroim.client.BuyerUseCase;
import com.zeroim.client.gateway.BuyerRepo;
import com.zeroim.product.ProductUseCase;
import com.zeroim.product.gateway.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfiguration {

    @Bean
    public ProductUseCase productUseCase(ProductRepository productRepository) {
        return new ProductUseCase(productRepository);
    }

    @Bean
    public BillUseCase billUseCase(BillRepo billRepo) {
        return new BillUseCase(billRepo);
    }

    @Bean
    public BuyerUseCase buyerUseCase(BuyerRepo buyerRepo) {
        return new BuyerUseCase(buyerRepo);
    }
}
