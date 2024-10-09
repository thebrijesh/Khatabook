package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.Bill;
import com.khatabook.khatabook.Model.PartyTransaction;

import java.util.List;

public interface TransactionService {

    List<PartyTransaction> getAllTransaction(Long partyId);
    PartyTransaction createBill(PartyTransaction partyTransaction);
}
