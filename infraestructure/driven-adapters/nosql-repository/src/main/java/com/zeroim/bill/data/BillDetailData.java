package com.zeroim.bill.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "BillDetail")
public class BillDetailData {
    @Id
    private String id;
    private String productId;
    private Integer quantity;
    private BigDecimal value;
}
