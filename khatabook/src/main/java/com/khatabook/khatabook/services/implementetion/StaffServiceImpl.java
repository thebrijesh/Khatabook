package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.Bill;
import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.StaffMember;
import com.khatabook.khatabook.repository.BusinessRepository;
import com.khatabook.khatabook.repository.StaffRepository;
import com.khatabook.khatabook.services.interfaces.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffRepository staffRepository;

    @Autowired
    BusinessRepository businessRepository;

    @Override
    public List<StaffMember> getAllStaffMembers(Long businessId) {
        return staffRepository.findAllByBusinessId(businessId);
    }

    @Override
    public StaffMember addNewStaffMember(StaffMember staffMember) {
        Optional<Business> businessOptional = businessRepository.findById(staffMember.getBusiness().getId());
        if(businessOptional.isEmpty()) throw new RuntimeException("Business not found");
        Business business = businessOptional.get();

        StaffMember savedStaffMember = staffRepository.save(staffMember);
        business.getStaffList().add(savedStaffMember);
        businessRepository.save(business);
        return savedStaffMember;
    }

    @Override
    public StaffMember updateStaffMemberDetails(StaffMember staffMember) {
        return null;
    }

    @Override
    public void deleteStaffMemberDetails(Long staffMemberId) {
        staffRepository.deleteById(staffMemberId);
    }
}
