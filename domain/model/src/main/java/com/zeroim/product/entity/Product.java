package com.zeroim.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private String id;
    private String name;
    private BigDecimal price;
    private BigInteger sku;
}
