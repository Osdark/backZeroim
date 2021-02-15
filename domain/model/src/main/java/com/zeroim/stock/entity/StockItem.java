package com.zeroim.stock.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockItem {
    private String id;
    private String productId;
    private Integer quantity;
}
