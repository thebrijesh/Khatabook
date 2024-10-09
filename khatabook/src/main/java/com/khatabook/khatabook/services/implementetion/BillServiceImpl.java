package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.Bill;
import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.repository.BillRepository;
import com.khatabook.khatabook.repository.BusinessRepository;
import com.khatabook.khatabook.services.interfaces.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    BillRepository billRepository;
    @Autowired
    BusinessRepository businessRepository;
    @Override
    public List<Bill> getAllBills(Long businessId) {
        return billRepository.findAllBillByBusinessId(businessId);
    }

    @Override
    public Bill createBill(Bill bill) {
        Optional<Business> businessOptional = businessRepository.findById(bill.getBusiness().getId());
        if(businessOptional.isEmpty()) throw new RuntimeException("Business not found");
        Business business = businessOptional.get();

        Bill savedBill = billRepository.save(bill);
        business.getBills().add(savedBill);
        businessRepository.save(business);
        return savedBill;
    }

    @Override
    public Bill updateBill(Bill bill) {
        return null;
    }
}
