package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "billService")
@Getter
@Setter
public class BillService extends BaseModel {
    String name;
    double salePrice;
    int monthlySales;
    int totalSales;
}
