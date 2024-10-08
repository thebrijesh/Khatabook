package com.khatabook.khatabook.Model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity(name = "bill")
@Getter
@Setter
public class Bill extends BaseModel{
    @OneToOne
    Party party;
    @OneToMany
    List<BillProduct> products;
    @OneToMany
    List<BillService> services;
    double amount;
    Date date;
    @Enumerated(EnumType.ORDINAL)
    PaymentType paymentType;
    @Enumerated(EnumType.ORDINAL)
    BillType billType;
}
