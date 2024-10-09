package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.BillService;
import com.khatabook.khatabook.repository.BillServiceRepository;

import com.khatabook.khatabook.services.interfaces.BillServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BillServiceServiceImpl implements BillServiceService {
@Autowired
BillServiceRepository serviceRepository;
    @Override
    public BillService addService(BillService service) {
        return  serviceRepository.save(service);
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
