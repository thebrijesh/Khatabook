package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.Bill;
import com.khatabook.khatabook.repository.BillRepository;
import com.khatabook.khatabook.services.interfaces.MyBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements MyBillService {

    @Autowired
    BillRepository billRepository;
    @Override
    public List<Bill> getAllBills(Long businessId) {
        return billRepository.findAllBillByBusinessId(businessId);
    }

    @Override
    public Bill createBill(Bill bill) {
        return billRepository.save(bill);
    }

    @Override
    public Bill updateBill(Bill bill) {
        return null;
    }
}
