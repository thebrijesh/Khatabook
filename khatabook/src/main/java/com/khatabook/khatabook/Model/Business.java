package com.khatabook.khatabook.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.Service;

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
    @OneToMany
    List<StaffMember> staffList;
    @OneToMany
    List<Party> parties;
    @OneToMany(cascade = CascadeType.ALL)
    List<Bill> bills;
    @OneToMany
    List<Expanses> expansesList;
    @OneToMany
    List<BillProduct> products;
    @OneToMany
    List<BillService> services;

    double totalCredit;
    double totalDebit;
}
