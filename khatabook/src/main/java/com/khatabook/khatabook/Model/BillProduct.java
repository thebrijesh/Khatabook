package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
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
    @OneToMany
    List<ProductTransaction> productTransactions;
}
