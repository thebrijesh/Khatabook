package com.khatabook.khatabook.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity(name = "StaffAttendance")
@Getter
@Setter
public class StaffAttendance extends BaseModel {
    @ManyToOne
    StaffMember staffMember;
    @Enumerated(EnumType.ORDINAL)
    StaffAttendanceType type;
    Date date;
}
