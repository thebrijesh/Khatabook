package com.khatabook.khatabook.Model;

import jakarta.persistence.Entity;
import jakarta.transaction.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity(name = "PartyTransaction")
@Getter
@Setter
public class PartyTransaction  extends BaseModel{
    Party party;
    double amount;
    Date date;
    TransactionType transactionType;
}
