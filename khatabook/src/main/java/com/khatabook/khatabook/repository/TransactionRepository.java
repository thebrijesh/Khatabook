package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.Bill;
import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.PartyTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<PartyTransaction,Long> {
    List<PartyTransaction> findAllByPartyId(Long partyId);
}
