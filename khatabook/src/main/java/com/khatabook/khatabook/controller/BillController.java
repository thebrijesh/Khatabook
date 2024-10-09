package com.khatabook.khatabook.controller;

import com.khatabook.khatabook.Model.Bill;
import com.khatabook.khatabook.services.interfaces.MyBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    MyBillService billService;

    @GetMapping("/{businessId}")
    public ResponseEntity<List<Bill>> getAllBills(@PathVariable() Long businessId) {
        List<Bill> billList = billService.getAllBills(businessId);
        return new ResponseEntity<>(billList, HttpStatus.OK);
    }

    @PostMapping("/createbill")
    public ResponseEntity<Bill> createBill(@RequestBody Bill bill) {
        Bill savedBill = billService.createBill(bill);
        return new ResponseEntity<>(savedBill, HttpStatus.CREATED);
    }
}
