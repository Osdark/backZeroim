package com.zeroim.bill.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bill {
    private String id;
    private Date date;
    private String clientId;
    private String[] billDetail;
    private BigDecimal total;
}
