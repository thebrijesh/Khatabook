package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.BillProduct;
import com.khatabook.khatabook.repository.ProductRepository;
import com.khatabook.khatabook.services.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public BillProduct addProduct(BillProduct product) {
        return productRepository.save(product);
    }

    @Override
    public List<BillProduct> getAllProductByBusinessId(Long businessId) {
        return productRepository.getAllProductByBusinessId(businessId);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
