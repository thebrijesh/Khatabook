package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.BillProduct;
import com.khatabook.khatabook.Model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<BillProduct,Long> {
}
