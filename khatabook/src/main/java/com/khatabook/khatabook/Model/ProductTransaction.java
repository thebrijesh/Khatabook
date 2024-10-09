package com.khatabook.khatabook.Model;



import jakarta.persistence.*;
import lombok.Setter;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity(name = "ProductTransaction")
@Getter
@Setter
public class ProductTransaction extends BaseModel{

    Date date;
    @Enumerated(EnumType.ORDINAL)
    StockTransactionType stockTransactionType;
    double amount;
    int unit;
    String description;
    @ManyToOne(cascade = CascadeType.MERGE)
    BillProduct billProduct;
}
