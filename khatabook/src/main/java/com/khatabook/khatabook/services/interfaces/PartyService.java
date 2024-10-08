package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.Party;

import java.util.List;

public interface PartyService {

    public Party createParty(Party party);

    public void deleteParty(Long id);
    public List<Party> getAllParty(Long BusinessId);
}
