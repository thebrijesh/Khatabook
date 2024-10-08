package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.Expanses;

import java.util.List;

public interface ExpansesService {

    public List<Expanses> getAllExpanses(Long businessId);
    public Expanses createExpanses( Expanses expanses);
    public void deleteExpanses(Long expansesId);
}
