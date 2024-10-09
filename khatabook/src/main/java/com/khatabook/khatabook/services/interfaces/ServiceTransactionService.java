package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.ServiceTransaction;

import java.util.List;

public interface ServiceTransactionService {
    List<ServiceTransaction> getAllServiceTransaction(Long billServiceId);
    ServiceTransaction addServiceTransaction(ServiceTransaction serviceTransaction);
}
