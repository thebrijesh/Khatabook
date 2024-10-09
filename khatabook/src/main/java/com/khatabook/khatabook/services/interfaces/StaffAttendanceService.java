package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.StaffAttendance;

import java.util.List;

public interface StaffAttendanceService {
    StaffAttendance addStaffAttendance(StaffAttendance staffAttendance);
    List<StaffAttendance> getStaffAttendance(Long staffId);
}
