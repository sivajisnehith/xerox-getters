package com.xeroxgetters.portal.service;

import com.xeroxgetters.portal.dto.customerdetailsresponse;
import com.xeroxgetters.portal.model.customerprofile;
import com.xeroxgetters.portal.model.user;
import com.xeroxgetters.portal.repository.customerprofilerepository;
import com.xeroxgetters.portal.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class customerqueryservice {

    private final UserRepository UserRepository;
    private final customerprofilerepository customerprofilerepository; 

    public customerqueryservice(UserRepository userRepository,
                                customerprofilerepository customerprofilerepository) {
        this.UserRepository = userRepository;
        this.customerprofilerepository = customerprofilerepository;
    }

    public customerdetailsresponse getCustomerDetails(Long userId) {

        user user = UserRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        customerprofile profile = customerprofilerepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Customer profile not found"));

        customerdetailsresponse response = new customerdetailsresponse();

        // user table data
        response.setId(user.getId());
        response.setName(user.getName());
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setRole(user.getRole());

        // customer profile table data
        response.setCollegeEmail(profile.getCollegeEmail());
        response.setRegistrationNumber(profile.getRegistrationNumber());

        return response;
    }
}
