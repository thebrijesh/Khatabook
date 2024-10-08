package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.repository.interfaces.BusinessRepository;
import com.khatabook.khatabook.services.interfaces.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    BusinessRepository businessRepository;
    @Override
    public List<Business> getAllBusiness(Long userId) {
        return businessRepository.findByUserId(userId);
    }

    @Override
    public Business createBusiness(Business business) {
        return businessRepository.save(business);
    }

    @Override
    public void deleteBusiness(Long Id) {
         businessRepository.deleteById(Id);
    }
}
