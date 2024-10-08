package com.khatabook.khatabook.controller;

import com.khatabook.khatabook.Model.ExpansesCategory;
import com.khatabook.khatabook.Model.ExpansesItem;
import com.khatabook.khatabook.services.interfaces.ExpanceCatagoryService;
import com.khatabook.khatabook.services.interfaces.ExpanceItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expansecatagory")
public class ExpanceCatagoryController {

    @Autowired
    ExpanceCatagoryService expanceCatagoryService;
    @GetMapping("/{businessId}")
    public ResponseEntity<List<ExpansesCategory>> getAllExpansesCategory(@PathVariable("businessId") Long businessId){
        List<ExpansesCategory> expansesCategoryList = expanceCatagoryService.getAllExpansesCategory(businessId);
        return new ResponseEntity<>(expansesCategoryList, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<ExpansesCategory> createExpansesCategory(@RequestBody ExpansesCategory expansesCategory){
        ExpansesCategory saveExpansesCategory = expanceCatagoryService.createExpansesCategory(expansesCategory);
        return new ResponseEntity<>(saveExpansesCategory, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpansesCategory(@PathVariable("id") Long expansesCategoryId){
        expanceCatagoryService.deleteExpansesCategory(expansesCategoryId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
