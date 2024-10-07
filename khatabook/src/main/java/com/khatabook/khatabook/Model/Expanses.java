package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
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
    ExpansesCategory expansesCatrgory;
    double amount;
    List<ExpansesItem> expansesItems;
}
