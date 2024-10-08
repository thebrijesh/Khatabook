package com.khatabook.khatabook.services.implementetion;


import com.khatabook.khatabook.Model.Expanses;
import com.khatabook.khatabook.repository.ExpansesRepository;
import com.khatabook.khatabook.services.interfaces.ExpansesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpansesServiceImpl implements ExpansesService {
    @Autowired
    ExpansesRepository expansesRepository;
    @Override
    public List<Expanses> getAllExpanses(Long businessId) {
        return expansesRepository.findByBusinessId(businessId);
    }

    @Override
    public Expanses createExpanses(Expanses expanses) {
        return expansesRepository.save(expanses);
    }

    @Override
    public void deleteExpanses(Long expansesId) {
         expansesRepository.deleteById(expansesId);
    }
}
