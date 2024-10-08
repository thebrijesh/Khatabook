package com.khatabook.khatabook.controller;


import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.Expanses;
import com.khatabook.khatabook.services.interfaces.BusinessService;
import com.khatabook.khatabook.services.interfaces.ExpansesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expanse")
public class ExpansesController {

    @Autowired
    ExpansesService expansesService;
    @GetMapping("/{businessId}")
    public ResponseEntity<List<Expanses>> getAllExpanses(@PathVariable("businessId") Long businessId){
        List<Expanses> expansesList = expansesService.getAllExpanses(businessId);
        return new ResponseEntity<>(expansesList, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Expanses> createExpanses(@RequestBody Expanses expanses){
        Expanses saveExpanses = expansesService.createExpanses(expanses);
        return new ResponseEntity<>(saveExpanses, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpanses(@PathVariable("id") Long expansesId){
        expansesService.deleteExpanses(expansesId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
