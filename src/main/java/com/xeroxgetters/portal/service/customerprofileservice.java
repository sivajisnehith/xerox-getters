package com.xeroxgetters.portal.service;

import com.xeroxgetters.portal.model.customerprofile;
import com.xeroxgetters.portal.model.user;
import com.xeroxgetters.portal.repository.customerprofilerepository;
import com.xeroxgetters.portal.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class customerprofileservice {

    private final customerprofilerepository customerprofileRepository;
    private final UserRepository userrepository;

    public customerprofileservice(customerprofilerepository customerprofilerepository,
                                  UserRepository userRepository) {
        this.customerprofileRepository = customerprofilerepository;
        this.userrepository = userRepository;
    }

    public customerprofile createcustomerprofile(Long userId, customerprofile profile) {

        user user = userrepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        profile.setuser(user);

        return customerprofileRepository.save(profile);
    }
}
