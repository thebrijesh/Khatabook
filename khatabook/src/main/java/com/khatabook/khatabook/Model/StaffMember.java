package com.khatabook.khatabook.Model;


import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.security.Permission;
import java.util.List;

@Entity(name = "staffMember")
@Getter
@Setter
public class StaffMember extends BaseModel {

    String name;
    String mobile;
    List<MemberPermission> permissionList;
    int presentDays;
    int paidLeave;
    int halfDay;
    double totalDue;

}
