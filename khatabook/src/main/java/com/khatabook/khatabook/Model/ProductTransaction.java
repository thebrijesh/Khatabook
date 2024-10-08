package com.khatabook.khatabook.Model;



import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Setter;

import jakarta.persistence.Entity;
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
}
