package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.StaffAttendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffAttendanceRepository extends JpaRepository<StaffAttendance,Long> {

    List<StaffAttendance> findAllStaffAttendanceByStaffMemberId(Long staffId);
}
