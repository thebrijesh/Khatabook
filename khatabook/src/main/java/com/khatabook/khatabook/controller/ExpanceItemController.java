package com.khatabook.khatabook.controller;

import com.khatabook.khatabook.Model.Expanses;
import com.khatabook.khatabook.Model.ExpansesItem;
import com.khatabook.khatabook.services.interfaces.ExpanceItemService;
import com.khatabook.khatabook.services.interfaces.ExpansesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expanseitem")
public class ExpanceItemController {

    @Autowired
    ExpanceItemService expanceItemService;
    @GetMapping("/{businessId}")
    public ResponseEntity<List<ExpansesItem>> getAllExpansesItem(@PathVariable("businessId") Long businessId){
        List<ExpansesItem> expansesItemsList = expanceItemService.getAllExpansesItem(businessId);
        return new ResponseEntity<>(expansesItemsList, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<ExpansesItem> createExpansesItem(@RequestBody ExpansesItem expansesItem){
        ExpansesItem saveExpansesItem = expanceItemService.createExpansesItem(expansesItem);
        return new ResponseEntity<>(saveExpansesItem, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpansesItem(@PathVariable("id") Long expansesItemId){
        expanceItemService.deleteExpansesItem(expansesItemId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
