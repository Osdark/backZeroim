package com.zeroim.product.data;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Product")
public class ProductData {
    @Id
    private String id;
    @NonNull
    private String name;
    @NonNull
    private BigDecimal price;
    @NonNull
    private BigInteger sku;
}
