package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.ProductTransaction;

import java.util.List;

public interface ProductTransactionService {
    public ProductTransaction addTransaction(ProductTransaction productTransaction);
    public List<ProductTransaction> getAllProductTransactionByProductId(Long productId);
    public void deleteProductTransaction(Long id);

}
