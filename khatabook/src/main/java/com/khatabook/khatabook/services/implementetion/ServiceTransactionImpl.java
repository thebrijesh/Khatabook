package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.ServiceTransaction;
import com.khatabook.khatabook.repository.ServiceTransactionRepository;
import com.khatabook.khatabook.services.interfaces.ServiceTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTransactionImpl implements ServiceTransactionService {
    @Autowired
    ServiceTransactionRepository serviceTransactionRepository;

    @Override
    public List<ServiceTransaction> getAllServiceTransaction(Long billServiceId) {
        return serviceTransactionRepository.findAllServiceTransactionByBillServiceId(billServiceId);
    }

    @Override
    public ServiceTransaction addServiceTransaction(ServiceTransaction serviceTransaction) {
        return serviceTransactionRepository.save(serviceTransaction);
    }
}
