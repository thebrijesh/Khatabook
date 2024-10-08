package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.Business;

import java.util.List;

public interface BusinessService {

    public List<Business> getAllBusiness(Long userId);
    public Business createBusiness(Business business);
    public void deleteBusiness(Long Id);
}
