package com.khatabook.khatabook.Model;




import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity(name = "party")
@Getter
@Setter
public class Party extends BaseModel{

    String name;
    String mobile;
    String image;
    @Enumerated(EnumType.ORDINAL)
    PartyType partyType;
    Date dueDate;
    @OneToMany
    List<PartyTransaction> transactionList;
    @ManyToOne
    Business business;
}
