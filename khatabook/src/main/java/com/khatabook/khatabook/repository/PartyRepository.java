package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party,Long> {
}
