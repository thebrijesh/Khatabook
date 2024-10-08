package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.ExpansesCategory;

import java.util.List;

public interface ExpanceCatagoryService {

    public List<ExpansesCategory> getAllExpansesCategory(Long businessId);
    public ExpansesCategory createExpansesCategory(ExpansesCategory expansesItem);
    public void deleteExpansesCategory(Long expansesItemId);
}
