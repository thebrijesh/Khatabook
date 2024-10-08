package com.khatabook.khatabook.repository.interfaces;

import com.khatabook.khatabook.Model.BillProduct;
import com.khatabook.khatabook.Model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<BillProduct,Long> {
    public List<BillProduct> getAllProductByBusinessId(Long businessId);
}
