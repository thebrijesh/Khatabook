package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.BillProduct;

import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.repository.BusinessRepository;
import com.khatabook.khatabook.repository.ProductRepository;
import com.khatabook.khatabook.services.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    BusinessRepository businessRepository;
    @Override
    public BillProduct addProduct(BillProduct product) {
        Optional<Business> businessOptional = businessRepository.findById(product.getBusiness().getId());
        if(businessOptional.isEmpty()) throw new RuntimeException("Business not found");
        Business business = businessOptional.get();

        BillProduct savedBillProduct = productRepository.save(product);
        business.getProducts().add(savedBillProduct);
        businessRepository.save(business);
        return savedBillProduct;
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
