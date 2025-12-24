package com.xeroxgetters.portal.controller;

import com.xeroxgetters.portal.model.deliveryprofile;
import com.xeroxgetters.portal.service.deliveryprofileservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delivery")
public class deliveryprofilecontroller {

    private final deliveryprofileservice deliveryprofileservice;

    public deliveryprofilecontroller(deliveryprofileservice deliveryprofileservice) {
        this.deliveryprofileservice = deliveryprofileservice;
    }

    @PostMapping("/{userId}/profile")
    public deliveryprofile createProfile(
            @PathVariable Long userId,
            @RequestBody deliveryprofile profile) {

        return deliveryprofileservice.createdeliveryprofile(userId, profile);
    }
}
