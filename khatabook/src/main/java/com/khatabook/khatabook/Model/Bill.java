package com.khatabook.khatabook.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Entity(name = "bill")
@Getter
@Setter
public class Bill extends BaseModel{
    @ManyToOne
    Party party;
    @ManyToOne(cascade = CascadeType.ALL)
    Business business;
    double amount;
    Date date;
    @Enumerated(EnumType.ORDINAL)
    PaymentType paymentType;
    @Enumerated(EnumType.ORDINAL)
    BillType billType;
    HashMap<BillProduct,Integer> products = new HashMap<>();
    HashMap<BillService,Integer> services = new HashMap<>();
}
