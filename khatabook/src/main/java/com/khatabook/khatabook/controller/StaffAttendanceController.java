package com.khatabook.khatabook.controller;

import com.khatabook.khatabook.Model.StaffAttendance;
import com.khatabook.khatabook.services.interfaces.StaffAttendanceService;
import com.sun.net.httpserver.HttpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staffAttendance")
public class
StaffAttendanceController {
    @Autowired
    StaffAttendanceService staffAttendanceService;

    @GetMapping("/getStaffAttendance/{staffId}")
    public ResponseEntity<List<StaffAttendance>> getStaffAttendenceById(@PathVariable("staffId")Long staffId) {
        List<StaffAttendance> staffAttendance = staffAttendanceService.getStaffAttendance(staffId);
        return new ResponseEntity<>(staffAttendance, HttpStatus.OK);
    }

    @PostMapping("/addStaffAttendance")
    public ResponseEntity<StaffAttendance> addStaffAttendance(@RequestBody StaffAttendance staffAttendance) {
        StaffAttendance savedStaffAttandence = staffAttendanceService.addStaffAttendance(staffAttendance);
        return new ResponseEntity<>(savedStaffAttandence, HttpStatus.CREATED);
    }
}
