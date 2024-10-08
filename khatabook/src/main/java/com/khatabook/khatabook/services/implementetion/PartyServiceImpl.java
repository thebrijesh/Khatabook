package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.Party;
import com.khatabook.khatabook.repository.interfaces.PartyRepository;
import com.khatabook.khatabook.services.interfaces.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartyServiceImpl implements PartyService {
    @Autowired
    PartyRepository partyRepository;
    @Override
    public Party createParty(Party party) {
        return partyRepository.save(party);
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
