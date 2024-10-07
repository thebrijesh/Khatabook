package com.khatabook.khatabook.Model;




import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Entity(name = "party")
@Getter
@Setter
public class Party extends BaseModel{

    String name;
    String mobile;
    String image;
    PartyType partyType;
    Date dueDate;
    List<PartyTransaction> transactionList;
}
