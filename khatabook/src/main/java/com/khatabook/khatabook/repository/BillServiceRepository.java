package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.BillService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillServiceRepository extends JpaRepository<BillService,Long> {
    public List<BillService> findAllServiceByBusinessId(Long businessId);
}
