package com.khatabook.khatabook.repository.interfaces;

import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.ProductTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTransactionRepository extends JpaRepository<ProductTransaction,Long> {
}
