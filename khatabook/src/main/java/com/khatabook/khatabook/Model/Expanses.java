package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
    ExpansesCategory expansesCatrgory;
    double amount;
    @OneToMany
    List<ExpansesItem> expansesItems;
}
