package com.khatabook.khatabook.repository.interfaces;

import com.khatabook.khatabook.Model.BillService;
import com.khatabook.khatabook.Model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<BillService,Long> {
}
