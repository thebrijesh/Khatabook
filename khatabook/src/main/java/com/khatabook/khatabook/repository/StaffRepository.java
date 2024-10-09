package com.khatabook.khatabook.repository;

import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<StaffMember,Long> {
    List<StaffMember> findAllByBusinessId(Long businessId);
}
