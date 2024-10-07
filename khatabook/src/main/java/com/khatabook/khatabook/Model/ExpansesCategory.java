package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "ExpansesCategory")
@Getter
@Setter
public class ExpansesCategory extends BaseModel{
    String name;
}
