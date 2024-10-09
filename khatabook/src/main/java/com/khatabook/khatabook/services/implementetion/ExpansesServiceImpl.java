package com.khatabook.khatabook.services.implementetion;


import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.Expanses;
import com.khatabook.khatabook.repository.BusinessRepository;
import com.khatabook.khatabook.repository.ExpansesRepository;
import com.khatabook.khatabook.services.interfaces.ExpansesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpansesServiceImpl implements ExpansesService {
    @Autowired
    ExpansesRepository expansesRepository;
    @Autowired
    BusinessRepository businessRepository;
    @Override
    public List<Expanses> getAllExpanses(Long businessId) {
        return expansesRepository.findByBusinessId(businessId);
    }

    @Override
    public Expanses createExpanses(Expanses expanses) {
        Optional<Business> businessOptional = businessRepository.findById(expanses.getBusiness().getId());
        if(businessOptional.isEmpty()) throw new RuntimeException("Business not found");
        Business business = businessOptional.get();

        Expanses savedExpanse = expansesRepository.save(expanses);
        business.getExpansesList().add(savedExpanse);
        businessRepository.save(business);
        return savedExpanse;
    }

    @Override
    public void deleteExpanses(Long expansesId) {
         expansesRepository.deleteById(expansesId);
    }
}
