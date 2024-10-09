package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.Bill;

import java.util.List;

public interface MyBillService {
    List<Bill> getAllBills(Long businessId);
    Bill createBill(Bill bill);
    Bill updateBill(Bill bill);
}
