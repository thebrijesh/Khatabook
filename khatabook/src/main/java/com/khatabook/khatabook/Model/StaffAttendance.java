package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity(name = "StaffAttendance")
@Getter
@Setter
public class StaffAttendance extends BaseModel {
    @OneToOne
    StaffMember staffMember;
    @Enumerated(EnumType.ORDINAL)
    StaffAttendanceType type;
    Date date;
}
