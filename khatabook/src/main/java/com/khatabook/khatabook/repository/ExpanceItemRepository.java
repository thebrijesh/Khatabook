package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.Expanses;
import com.khatabook.khatabook.Model.ExpansesItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpanceItemRepository  extends JpaRepository<ExpansesItem,Long> {
    List<ExpansesItem> findByBusinessId(Long businessId);
}
