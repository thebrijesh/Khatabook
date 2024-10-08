package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.ExpansesItem;
import com.khatabook.khatabook.repository.ExpanceItemRepository;
import com.khatabook.khatabook.services.interfaces.ExpanceItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpanceItemServiceImpl implements ExpanceItemService {
    @Autowired
    ExpanceItemRepository expanceItemRepository;
    @Override
    public List<ExpansesItem> getAllExpansesItem(Long businessId) {
        return expanceItemRepository.findByBusinessId(businessId);
    }

    @Override
    public ExpansesItem createExpansesItem(ExpansesItem expansesItem) {
        return expanceItemRepository.save(expansesItem);
    }

    @Override
    public void deleteExpansesItem(Long expansesItemId) {
        expanceItemRepository.deleteById(expansesItemId);
    }
}
