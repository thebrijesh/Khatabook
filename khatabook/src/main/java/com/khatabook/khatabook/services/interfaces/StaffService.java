package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.StaffMember;

import java.util.List;

public interface StaffService {
    List<StaffMember> getAllStaffMembers(Long businessId);
    StaffMember addNewStaffMember(StaffMember staffMember);
    StaffMember updateStaffMemberDetails(StaffMember staffMember);
    void deleteStaffMemberDetails(Long staffMemberId);
}
