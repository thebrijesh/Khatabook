package com.khatabook.khatabook.Model;


import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
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
    @Enumerated(EnumType.ORDINAL)
    List<MemberPermission> permissionList;
    int presentDays;
    int paidLeave;
    int halfDay;
    double totalDue;

}
