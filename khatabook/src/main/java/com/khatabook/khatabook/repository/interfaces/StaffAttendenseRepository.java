package com.khatabook.khatabook.repository.interfaces;

import com.khatabook.khatabook.Model.StaffAttendance;
import com.khatabook.khatabook.dto.response.StaffAttendenseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffAttendenseRepository extends JpaRepository<StaffAttendance,Long> {
}
