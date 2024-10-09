package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.Party;
import com.khatabook.khatabook.repository.BusinessRepository;
import com.khatabook.khatabook.repository.PartyRepository;
import com.khatabook.khatabook.services.interfaces.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartyServiceImpl implements PartyService {
    @Autowired
    PartyRepository partyRepository;
    @Autowired
    BusinessRepository businessRepository;
    @Override
    public Party createParty(Party party) {
        Optional<Business> businessOptional = businessRepository.findById(party.getBusiness().getId());
        if(businessOptional.isEmpty()) throw new RuntimeException("Business not found");
        Business business = businessOptional.get();

        Party savedParty = partyRepository.save(party);
        business.getParties().add(savedParty);
        businessRepository.save(business);
        return savedParty;
    }



    @Override
    public void deleteParty(Long id) {
        partyRepository.deleteById(id);
    }

    @Override
    public List<Party> getAllParty(Long businessId) {
        return partyRepository.findByBusinessId(businessId);
    }
}
