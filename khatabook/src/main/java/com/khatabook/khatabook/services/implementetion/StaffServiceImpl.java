package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.StaffMember;
import com.khatabook.khatabook.repository.StaffRepository;
import com.khatabook.khatabook.services.interfaces.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffRepository staffRepository;
    @Override
    public List<StaffMember> getAllStaffMembers(Long businessId) {
        return staffRepository.findAllByBusinessId(businessId);
    }

    @Override
    public StaffMember addNewStaffMember(StaffMember staffMember) {
        return staffRepository.save(staffMember);
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
