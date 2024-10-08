package com.khatabook.khatabook.controller;

import com.khatabook.khatabook.Model.Party;
import com.khatabook.khatabook.services.implementetion.PartyServiceImpl;
import com.khatabook.khatabook.services.interfaces.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/party")
public class PartyController {
    @Autowired
    PartyService partyService;
    @PostMapping("/creteParty")
    public ResponseEntity<Party> createParty(@RequestBody Party party){
        Party createdParty = partyService.createParty(party);
        return new ResponseEntity<>(createdParty, HttpStatus.OK);
    }

    @GetMapping("/{businessId}")
    public ResponseEntity< List<Party>> getAllParty(@PathVariable("businessId") Long businessId){
        List<Party> createdPartyList = partyService.getAllParty(businessId);
        return new ResponseEntity<>(createdPartyList, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Party> deleteParty(@PathVariable Long id){
          partyService.deleteParty(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
