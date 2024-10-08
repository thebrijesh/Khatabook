package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.BillProduct;

import java.util.List;

public interface ProductService {

    public BillProduct addProduct(BillProduct product);
    public List<BillProduct> getAllProductByBusinessId(Long billId);
    public void  deleteProduct(Long id);
}
