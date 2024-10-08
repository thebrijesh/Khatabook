package com.khatabook.khatabook.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "billproduct")
@Getter
@Setter
public class BillProduct extends BaseModel {

    String name;
    double salePrice;
    double purchasePrice;

    int stockQuontity;
    int lowStock;

    @Enumerated(EnumType.ORDINAL)
    UnitType unitType;
    @OneToMany(cascade = CascadeType.ALL)
    List<ProductTransaction> productTransactions;
}
