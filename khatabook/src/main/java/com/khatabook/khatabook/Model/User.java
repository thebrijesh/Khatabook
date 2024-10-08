package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "user")
@Getter
@Setter
public class User extends BaseModel {

     String name;
     String mobileNumber;
     String email;
     String password;

     @OneToMany
     List<Business> businessList;
}
