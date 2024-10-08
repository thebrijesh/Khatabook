package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.Expanses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpansesRepository extends JpaRepository<Expanses,Long> {

    List<Expanses> findByBusinessId(Long businessId);
}
