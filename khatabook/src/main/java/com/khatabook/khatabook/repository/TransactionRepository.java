package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.PartyTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<PartyTransaction,Long> {
}
