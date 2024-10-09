package com.khatabook.khatabook.controller;

import com.khatabook.khatabook.Model.PartyTransaction;
import com.khatabook.khatabook.services.interfaces.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping("/{partyId}")
    public ResponseEntity<List<PartyTransaction>> getAllTransaction(@PathVariable("partyId") Long partyId) {
        List<PartyTransaction> partyTransactions = transactionService.getAllTransaction(partyId);
        return new ResponseEntity<>(partyTransactions, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<PartyTransaction> createTransaction(@RequestBody PartyTransaction partyTransaction) {
        PartyTransaction savesPartyTransaction = transactionService.createTransaction(partyTransaction);
        return new ResponseEntity<>(savesPartyTransaction, HttpStatus.CREATED);
    }
}
