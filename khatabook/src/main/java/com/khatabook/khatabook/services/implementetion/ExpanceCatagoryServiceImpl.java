package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.ExpansesCategory;
import com.khatabook.khatabook.repository.ExpanceCatagoryRepository;
import com.khatabook.khatabook.services.interfaces.ExpanceCatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpanceCatagoryServiceImpl implements ExpanceCatagoryService {

    @Autowired
    ExpanceCatagoryRepository expanceCatagoryRepository;
    @Override
    public List<ExpansesCategory> getAllExpansesCategory(Long businessId) {
        return expanceCatagoryRepository.findByBusinessId(businessId);
    }

    @Override
    public ExpansesCategory createExpansesCategory(ExpansesCategory expansesCategory) {
        return expanceCatagoryRepository.save(expansesCategory);
    }

    @Override
    public void deleteExpansesCategory(Long expansesCategoryId) {
         expanceCatagoryRepository.deleteById(expansesCategoryId);
    }
}
