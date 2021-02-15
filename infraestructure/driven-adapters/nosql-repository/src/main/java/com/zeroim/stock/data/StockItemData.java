package com.zeroim.stock.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Stock")
public class StockItemData {
    private String id;
    private String productId;
    private Integer quantity;
}
