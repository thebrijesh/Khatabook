package com.khatabook.khatabook.Model;



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
    StockTransactionType stockTransactionType;
    double amount;
    int unit;
    String description;
}
