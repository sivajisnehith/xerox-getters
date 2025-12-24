package com.xeroxgetters.portal.service;

import com.xeroxgetters.portal.model.deliveryprofile;
import com.xeroxgetters.portal.model.user;
import com.xeroxgetters.portal.repository.deliveryprofilerepository;
import com.xeroxgetters.portal.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class deliveryprofileservice {

    private final deliveryprofilerepository deliveryprofilerepository;
    private final UserRepository UserRepository;

    public deliveryprofileservice(deliveryprofilerepository deliveryprofilerepository,
                                  UserRepository UserRepository) {
        this.deliveryprofilerepository = deliveryprofilerepository;
        this.UserRepository = UserRepository;
    }

    public deliveryprofile createdeliveryprofile(Long userId, deliveryprofile profile) {

        user user = UserRepository.findById(userId).orElseThrow();

        profile.setUser(user);
        return deliveryprofilerepository.save(profile);
    }
}
