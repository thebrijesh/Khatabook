package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.StaffAttendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffAttendenseRepository extends JpaRepository<StaffAttendance,Long> {
}
