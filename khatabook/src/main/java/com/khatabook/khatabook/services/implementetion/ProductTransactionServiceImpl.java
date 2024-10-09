package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.BillProduct;
import com.khatabook.khatabook.Model.ProductTransaction;
import com.khatabook.khatabook.Model.StockTransactionType;
import com.khatabook.khatabook.repository.ProductRepository;
import com.khatabook.khatabook.repository.ProductTransactionRepository;
import com.khatabook.khatabook.services.interfaces.ProductTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductTransactionServiceImpl implements ProductTransactionService {
    @Autowired
    ProductTransactionRepository productTransactionRepository;
    @Autowired
    ProductRepository productRepository;
    @Override
    public ProductTransaction addTransaction(ProductTransaction productTransaction) {
        Optional<BillProduct> billProductOptional = productRepository.findById(productTransaction.getBillProduct().getId());
        if(billProductOptional.isEmpty()) throw new RuntimeException("Product not found");
        BillProduct billProduct = billProductOptional.get();

        ProductTransaction savedproductTransaction = productTransactionRepository.save(productTransaction);
        billProduct.getProductTransactions().add(savedproductTransaction);
        if(productTransaction.getStockTransactionType() == StockTransactionType.IN){
             billProduct.setStockQuantity(billProduct.getStockQuantity()+productTransaction.getUnit());
             billProduct.setPurchasePrice((billProduct.getPurchasePrice()+productTransaction.getAmount())/billProduct.getStockQuantity());
        }else{
            billProduct.setStockQuantity(billProduct.getStockQuantity()-productTransaction.getUnit());
        }
        productRepository.save(billProduct);
        return savedproductTransaction;
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
