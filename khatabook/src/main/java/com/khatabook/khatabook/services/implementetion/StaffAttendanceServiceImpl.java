package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.StaffAttendance;
import com.khatabook.khatabook.repository.StaffAttendanceRepository;
import com.khatabook.khatabook.services.interfaces.StaffAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffAttendanceServiceImpl implements StaffAttendanceService {
    @Autowired
    StaffAttendanceRepository staffAttendanceRepository;
    @Override
    public StaffAttendance addStaffAttendance(StaffAttendance staffAttendance) {
        return staffAttendanceRepository.save(staffAttendance);
    }

    public List<StaffAttendance> getStaffAttendance(Long staffId) {
        return staffAttendanceRepository.findAllStaffAttendanceByStaffMemberId(staffId);
    }
}
