package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.ExpansesCategory;
import com.khatabook.khatabook.Model.ExpansesItem;

import java.util.List;

public interface ExpanceItemService {

    public List<ExpansesItem> getAllExpansesItem(Long businessId);
    public ExpansesItem createExpansesItem(ExpansesItem expansesItem);
    public void deleteExpansesItem(Long expansesItemId);
}
