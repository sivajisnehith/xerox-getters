package com.xeroxgetters.portal.service;

import com.xeroxgetters.portal.dto.deliverydetailsresponse;
import com.xeroxgetters.portal.model.deliveryprofile;
import com.xeroxgetters.portal.model.user;
import com.xeroxgetters.portal.repository.deliveryprofilerepository;
import com.xeroxgetters.portal.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class deliveryqueryservice {

    private final UserRepository UserRepository;
    private final deliveryprofilerepository deliveryprofilerepository;

    public deliveryqueryservice(UserRepository UserRepository,
                                deliveryprofilerepository deliveryprofilerepository) {
        this.UserRepository = UserRepository;
        this.deliveryprofilerepository = deliveryprofilerepository;
    }

    public deliverydetailsresponse getDeliveryDetails(Long userId) {

        // 1️⃣ fetch user
        user user = UserRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // 2️⃣ fetch delivery profile
        deliveryprofile profile = deliveryprofilerepository.findByUser_Id(userId)
                .orElseThrow(() -> new RuntimeException("Delivery profile not found"));

        // 3️⃣ combine manually
        deliverydetailsresponse response = new deliverydetailsresponse();

        response.setId(user.getId());
        response.setName(user.getName());
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setRole(user.getRole());

        response.setVehicleNumber(profile.getVehicleNumber());
        response.setLicenseNumber(profile.getLicenseNumber());
        response.setAvailable(profile.isAvailable());

        return response;
    }
}
