package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.ExpansesItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpanceItemRepository  extends JpaRepository<ExpansesItem,Long> {
}
