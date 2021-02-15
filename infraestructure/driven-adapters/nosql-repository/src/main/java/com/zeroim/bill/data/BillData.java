package com.zeroim.bill.data;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "Bill")
public class BillData {
    @Id
    private String id;
    @NonNull
    private String BillNumber;
    @NonNull
    private Date date;
    @NonNull
    private String clientId;
    @NonNull
    private String[] billDetail;
    @NonNull
    private BigDecimal total;
}
