package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.BillService;
import com.khatabook.khatabook.Model.ServiceTransaction;
import com.khatabook.khatabook.Model.ServiceTransactionType;
import com.khatabook.khatabook.repository.BillServiceRepository;
import com.khatabook.khatabook.repository.ServiceTransactionRepository;
import com.khatabook.khatabook.services.interfaces.ServiceTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTransactionImpl implements ServiceTransactionService {
    @Autowired
    ServiceTransactionRepository serviceTransactionRepository;
    @Autowired
    BillServiceRepository billServiceRepository;

    @Override
    public List<ServiceTransaction> getAllServiceTransaction(Long billServiceId) {

        return serviceTransactionRepository.findAllServiceTransactionByBillServiceId(billServiceId);
    }

    @Override
    public ServiceTransaction addServiceTransaction(ServiceTransaction serviceTransaction) {
        Optional<BillService> billServiceOptional = billServiceRepository.findById(serviceTransaction.getBillService().getId());
        if(billServiceOptional.isEmpty()) throw new RuntimeException("Service not found");
        BillService billService= billServiceOptional.get();

        ServiceTransaction savedServiceTransaction = serviceTransactionRepository.save(serviceTransaction);
        billService.getServiceTransactions().add(savedServiceTransaction);
        if(serviceTransaction.getType() == ServiceTransactionType.SALE){
            billService.setTotalSales(billService.getTotalSales()+serviceTransaction.getUnit());
            billService.setSalePrice((billService.getSalePrice()+serviceTransaction.getAmount())/billService.getTotalSales());
        }else{
            billService.setTotalSales(billService.getTotalSales()-serviceTransaction.getUnit());
            billService.setSalePrice((billService.getSalePrice()-serviceTransaction.getAmount())/billService.getTotalSales());
        }
        billServiceRepository.save(billService);
        return savedServiceTransaction;
    }
}
