package com.khatabook.khatabook.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity(name = "business")
public class Business extends BaseModel {
    String name;
    String mobile;
    String address;
    @ManyToOne(cascade = CascadeType.MERGE)
    private User user;
    @OneToMany(cascade = CascadeType.MERGE)
    @JsonIgnore
    List<StaffMember> staffList;
    @OneToMany
    List<Party> parties;
    @OneToMany(cascade = CascadeType.MERGE)
    @JsonIgnore
    List<Bill> bills = new ArrayList<>();
    @OneToMany(cascade = CascadeType.MERGE)
    @JsonIgnore
    List<Expanses> expansesList;
    @OneToMany(cascade = CascadeType.MERGE)
    @JsonIgnore
    List<BillProduct> products;
    @OneToMany(cascade = CascadeType.MERGE)
    @JsonIgnore
    List<BillService> services;

    double totalCredit;
    double totalDebit;
}

