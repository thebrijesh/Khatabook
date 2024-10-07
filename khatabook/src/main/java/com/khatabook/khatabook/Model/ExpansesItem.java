package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "ExpansesItem")
@Getter
@Setter
public class ExpansesItem extends BaseModel {
    String name;
    double price;
}
