package com.khatabook.khatabook.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.plaf.basic.BasicEditorPaneUI;
import java.util.Date;

@Entity(name = "ServiceTransaction")
@Getter
@Setter
public class ServiceTransaction extends BaseModel {

    Date date;
    double amount;
    int unit;
    String description;
    @ManyToOne
    BillService billService;
    @Enumerated(EnumType.ORDINAL)
    ServiceTransactionType type;
}
