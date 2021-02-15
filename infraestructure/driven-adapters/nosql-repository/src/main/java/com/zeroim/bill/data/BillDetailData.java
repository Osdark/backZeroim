package com.zeroim.bill.data;

import com.mongodb.lang.NonNull;
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
    @NonNull
    private String billNumber;
    @NonNull
    private String productId;
    @NonNull
    private Integer quantity;
    @NonNull
    private BigDecimal value;
}
