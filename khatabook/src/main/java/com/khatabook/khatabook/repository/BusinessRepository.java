package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessRepository extends JpaRepository<Business,Long> {

    List<Business> findByUserId(Long userid);
}
