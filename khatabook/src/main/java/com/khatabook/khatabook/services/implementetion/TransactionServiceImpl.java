package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.PartyTransaction;
import com.khatabook.khatabook.repository.TransactionRepository;
import com.khatabook.khatabook.services.interfaces.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public List<PartyTransaction> getAllTransaction(Long partyId) {
        return transactionRepository.findAllByPartyId(partyId);
    }

    @Override
    public PartyTransaction createBill(PartyTransaction partyTransaction) {
        return transactionRepository.save(partyTransaction);
    }
}
