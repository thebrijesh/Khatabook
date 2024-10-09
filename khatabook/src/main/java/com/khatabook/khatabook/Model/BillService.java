package com.khatabook.khatabook.Model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "billService")
@Getter
@Setter
public class BillService extends BaseModel {
    String name;
    double salePrice;
    int monthlySales;
    int totalSales;
    @OneToMany(cascade = CascadeType.MERGE)
    List<ServiceTransaction> serviceTransactionList;
}
