package com.khatabook.khatabook.Model;


import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import java.security.Permission;
import java.util.List;

@Entity(name = "staffMember")
@Getter
@Setter
public class StaffMember extends BaseModel {

    String name;
    String mobile;
    @ManyToOne(cascade = CascadeType.MERGE)
    Business business;
    @Enumerated(EnumType.ORDINAL)
    List<MemberPermission> permissionList;
    int presentDays;
    int paidLeave;
    int halfDay;
    double totalDue;

}
