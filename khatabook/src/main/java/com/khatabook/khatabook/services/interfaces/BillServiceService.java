package com.khatabook.khatabook.services.interfaces;



import com.khatabook.khatabook.Model.BillService;

import java.util.List;

public interface BillServiceService {
    public BillService addService(BillService service);
    public List<BillService> getAllServiceByBusinessId(Long serviceId);
    public void deleteService(Long id);
}
