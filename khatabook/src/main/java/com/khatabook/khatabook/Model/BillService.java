package com.khatabook.khatabook.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
    @ManyToOne(cascade = CascadeType.MERGE)
            @JsonIgnore
    Business business;
}
