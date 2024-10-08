package com.khatabook.khatabook.Model;

import jakarta.persistence.*;
import jakarta.transaction.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity(name = "PartyTransaction")
@Getter
@Setter
public class PartyTransaction  extends BaseModel{
    @OneToOne(cascade = CascadeType.MERGE)
    Party party;
    double amount;
    Date date;
    @Enumerated(EnumType.ORDINAL)
    TransactionType transactionType;
}
