package com.khatabook.khatabook.controller;

import com.khatabook.khatabook.Model.ServiceTransaction;
import com.khatabook.khatabook.services.interfaces.ServiceTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serviceTransaction")
public class ServiceTransactionController {
    @Autowired
    ServiceTransactionService service;

    @GetMapping("/{billServiceId}")
    public ResponseEntity<List<ServiceTransaction>> getAllServiceTransactions(@PathVariable("billServiceId") Long billServiceId) {
        List<ServiceTransaction> serviceTransactionList = service.getAllServiceTransaction(billServiceId);
        return new ResponseEntity<>(serviceTransactionList, HttpStatus.OK);
    }

    @PostMapping("/addServiceTransaction")
    public ResponseEntity<ServiceTransaction> addServiceTransaction(@RequestBody ServiceTransaction serviceTransaction) {
        ServiceTransaction savedServiceTransaction = service.addServiceTransaction(serviceTransaction);
        return new ResponseEntity<>(savedServiceTransaction, HttpStatus.CREATED);
    }
}
