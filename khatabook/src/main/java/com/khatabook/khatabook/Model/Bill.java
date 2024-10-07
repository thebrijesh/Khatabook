package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity(name = "bill")
@Getter
@Setter
public class Bill extends BaseModel{
    Party party;
    List<BillProduct> products;
    List<BillService> services;
    double amount;
    Date date;
    PaymentType paymentType;
    BillType billType;
}
