package com.khatabook.khatabook.Model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "ExpansesCategory")
@Getter
@Setter
public class ExpansesCategory extends BaseModel{
    String name;
    @ManyToOne(cascade = CascadeType.MERGE)
    Business business;
}
