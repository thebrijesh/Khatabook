package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.Bill;
import org.hibernate.engine.jdbc.spi.JdbcServices;

import java.util.List;

public interface BillService {
    List<Bill> getAllBills(Long businessId);
    Bill createBill(Bill bill);
    Bill updateBill(Bill bill);
}
