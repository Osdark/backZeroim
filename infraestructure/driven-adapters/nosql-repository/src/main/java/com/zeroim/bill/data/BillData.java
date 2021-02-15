package com.zeroim.bill.data;

import com.mongodb.lang.NonNull;
import com.zeroim.bill.entity.BillDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
    private Date date = new Date();
    @NonNull
    private String clientId;
    @NonNull
    private List<BillDetail> billDetail;
    private BigDecimal total;

    public List<BillDetail> getBillDetail() {
        return billDetail;
    }

    public void setBillDetail(List<BillDetail> billDetail) {
        this.billDetail = billDetail;
    }
}
