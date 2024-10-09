package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.Party;
import com.khatabook.khatabook.Model.PartyTransaction;
import com.khatabook.khatabook.Model.TransactionType;
import com.khatabook.khatabook.repository.BusinessRepository;
import com.khatabook.khatabook.repository.PartyRepository;
import com.khatabook.khatabook.repository.TransactionRepository;
import com.khatabook.khatabook.services.interfaces.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    BusinessRepository businessRepository;
    @Autowired
    PartyRepository partyRepository;
    @Override
    public List<PartyTransaction> getAllTransaction(Long partyId) {
        return transactionRepository.findAllByPartyId(partyId);
    }

    @Override
    public PartyTransaction createTransaction(PartyTransaction partyTransaction) {
        Optional<Party> partyOptional = partyRepository.findById(partyTransaction.getParty().getId());
        if(partyOptional.isEmpty()) throw new RuntimeException("Party not found");
        Optional<Business> businessOptional = businessRepository.findById(partyOptional.get().getBusiness().getId());
        if(businessOptional.isEmpty()) throw new RuntimeException("Business not found");
        Business business = businessOptional.get();
        if(partyTransaction.getTransactionType() == TransactionType.CREDIT){
            business.setTotalCredit(business.getTotalCredit()+ partyTransaction.getAmount());
        }else {
            business.setTotalDebit(business.getTotalDebit()+ partyTransaction.getAmount());
        }
        businessRepository.save(business);
        return transactionRepository.save(partyTransaction);
    }
}
