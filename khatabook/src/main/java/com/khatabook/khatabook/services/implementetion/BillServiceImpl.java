package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.Bill;
import com.khatabook.khatabook.repository.BillRepository;
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
