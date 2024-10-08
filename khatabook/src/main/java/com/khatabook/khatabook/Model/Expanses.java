package com.khatabook.khatabook.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity(name = "expanse")
@Getter
@Setter
public class Expanses extends BaseModel{

    String name;
    Date date;
    @OneToOne
    ExpansesCategory expansesCategory;
    double amount;
    @OneToMany
    List<ExpansesItem> expansesItems;
    @ManyToOne(cascade = CascadeType.MERGE)
    Business business;
}
