package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
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

    List<StaffMember> staffList;
    List<Party> parties;
    List<Bill> bills;
    List<Expanses> expansesList;
    List<BillProduct> products;
    List<Service> services;

    double totalCredit;
    double totalDebit;
}
