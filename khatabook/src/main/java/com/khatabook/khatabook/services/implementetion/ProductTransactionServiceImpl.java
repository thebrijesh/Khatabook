package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.ProductTransaction;
import com.khatabook.khatabook.repository.ProductTransactionRepository;
import com.khatabook.khatabook.services.interfaces.ProductTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTransactionServiceImpl implements ProductTransactionService {
    @Autowired
    ProductTransactionRepository productTransactionRepository;
    @Override
    public ProductTransaction addTransaction(ProductTransaction productTransaction) {
        return productTransactionRepository.save(productTransaction);
    }

    @Override
    public List<ProductTransaction> getAllProductTransactionByProductId(Long productId) {
        return productTransactionRepository.findAllProductTransactionByBillProductId(productId);
    }

    @Override
    public void deleteProductTransaction(Long id) {
        productTransactionRepository.deleteById(id);
    }
}
