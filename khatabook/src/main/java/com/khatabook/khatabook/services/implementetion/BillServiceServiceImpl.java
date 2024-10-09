package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.BillService;
import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.repository.BillServiceRepository;

import com.khatabook.khatabook.repository.BusinessRepository;
import com.khatabook.khatabook.services.interfaces.BillServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BillServiceServiceImpl implements BillServiceService {
@Autowired
BillServiceRepository serviceRepository;
    @Autowired
    BusinessRepository businessRepository;

    @Override
    public BillService addService(BillService service) {
        Optional<Business> businessOptional = businessRepository.findById(service.getBusiness().getId());
        if(businessOptional.isEmpty()) throw new RuntimeException("Business not found");
        Business business = businessOptional.get();

        BillService savedBillService = serviceRepository.save(service);
        business.getServices().add(savedBillService);
        businessRepository.save(business);
        return  savedBillService;
    }

    @Override
    public List<BillService> getAllServiceByBusinessId(Long businessId) {
        return serviceRepository.findAllServiceByBusinessId(businessId);
    }

    @Override
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
}
