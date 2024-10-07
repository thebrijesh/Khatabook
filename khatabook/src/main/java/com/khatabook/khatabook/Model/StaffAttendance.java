package com.khatabook.khatabook.Model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity(name = "StaffAttendance")
@Getter
@Setter
public class StaffAttendance extends BaseModel {
    StaffMember staffMember;
    StaffAttendanceType type;
    Date date;
}
