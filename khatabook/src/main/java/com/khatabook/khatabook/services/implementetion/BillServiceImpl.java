package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.*;
import com.khatabook.khatabook.repository.BillRepository;
import com.khatabook.khatabook.repository.BusinessRepository;
import com.khatabook.khatabook.repository.ProductRepository;
import com.khatabook.khatabook.services.interfaces.BillServiceService;
import com.khatabook.khatabook.services.interfaces.MyBillService;
import com.khatabook.khatabook.services.interfaces.ProductTransactionService;
import com.khatabook.khatabook.services.interfaces.ServiceTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BillServiceImpl implements MyBillService {

    @Autowired
    BillRepository billRepository;
    @Autowired
    BusinessRepository businessRepository;
    @Autowired
    ProductTransactionService productTransactionService;
    @Autowired
    ServiceTransactionService serviceTransactionService;
    @Override
    public List<Bill> getAllBills(Long businessId) {
        return billRepository.findAllBillByBusinessId(businessId);
    }

    @Override
    public Bill createBill(Bill bill) {
        Optional<Business> businessOptional = businessRepository.findById(bill.getBusiness().getId());
        if(businessOptional.isEmpty()) throw new RuntimeException("Business not found");
        Business business = businessOptional.get();

        if(bill.getBillType() == BillType.SALE){
             for(BillProduct billProduct : bill.getProducts().keySet()){
                 ProductTransaction productTransaction = new ProductTransaction();
                 productTransaction.setBillProduct(billProduct);
                 productTransaction.setDate(new Date());
                 productTransaction.setUnit(bill.getProducts().get(billProduct));
                 productTransaction.setAmount(billProduct.getSalePrice() * bill.getProducts().get(billProduct));
                 productTransaction.setDescription("Stock Balance" + billProduct.getStockQuantity());
                 productTransaction.setStockTransactionType(StockTransactionType.OUT);
                 productTransactionService.addTransaction(productTransaction);
             }
            for(BillService billService : bill.getServices().keySet()){
                ServiceTransaction serviceTransaction = new ServiceTransaction();
                serviceTransaction.setBillService(billService);
                serviceTransaction.setDate(new Date());
                serviceTransaction.setUnit(bill.getProducts().get(billService));
                serviceTransaction.setAmount(billService.getSalePrice() * bill.getProducts().get(billService));
                serviceTransactionService.addServiceTransaction(serviceTransaction);
            }
        }else if(bill.getBillType() == BillType.SALE_RETURN){
            for(BillProduct billProduct : bill.getProducts().keySet()){
                ProductTransaction productTransaction = new ProductTransaction();
                productTransaction.setBillProduct(billProduct);
                productTransaction.setDate(new Date());
                productTransaction.setUnit(bill.getProducts().get(billProduct));
                productTransaction.setAmount(billProduct.getSalePrice() * bill.getProducts().get(billProduct));
                productTransaction.setDescription("Stock Balance" + billProduct.getStockQuantity());
                productTransaction.setStockTransactionType(StockTransactionType.IN);
                productTransactionService.addTransaction(productTransaction);
            }
            for(BillService billService : bill.getServices().keySet()){
                ServiceTransaction serviceTransaction = new ServiceTransaction();
                serviceTransaction.setBillService(billService);
                serviceTransaction.setDate(new Date());
                serviceTransaction.setUnit(bill.getProducts().get(billService));
                serviceTransaction.setAmount(billService.getSalePrice() * bill.getProducts().get(billService));
                serviceTransactionService.addServiceTransaction(serviceTransaction);
            }
        }else if(bill.getBillType() == BillType.PURCHASE_RETURN){
            for(BillProduct billProduct : bill.getProducts().keySet()){
                ProductTransaction productTransaction = new ProductTransaction();
                productTransaction.setBillProduct(billProduct);
                productTransaction.setDate(new Date());
                productTransaction.setUnit(bill.getProducts().get(billProduct));
                productTransaction.setAmount(billProduct.getSalePrice() * bill.getProducts().get(billProduct));
                productTransaction.setDescription("Stock Balance" + billProduct.getStockQuantity());
                productTransaction.setStockTransactionType(StockTransactionType.IN);
                productTransactionService.addTransaction(productTransaction);
            }
        }else{
            for(BillProduct billProduct : bill.getProducts().keySet()){
                ProductTransaction productTransaction = new ProductTransaction();
                productTransaction.setBillProduct(billProduct);
                productTransaction.setDate(new Date());
                productTransaction.setUnit(bill.getProducts().get(billProduct));
                productTransaction.setAmount(billProduct.getSalePrice() * bill.getProducts().get(billProduct));
                productTransaction.setDescription("Stock Balance" + billProduct.getStockQuantity());
                productTransaction.setStockTransactionType(StockTransactionType.OUT);
                productTransactionService.addTransaction(productTransaction);
            }
        }


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
