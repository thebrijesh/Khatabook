package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.ServiceTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceTransactionRepository extends JpaRepository<ServiceTransaction, Long> {
    List<ServiceTransaction> findAllServiceTransactionByBillServiceId(Long billServiceId);
}
