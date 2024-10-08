package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
}
