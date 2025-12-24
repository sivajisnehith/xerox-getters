package com.xeroxgetters.portal.controller;

import com.xeroxgetters.portal.model.customerprofile;
import com.xeroxgetters.portal.service.customerprofileservice;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/customers")
public class customerprofilecontroller {

    private final customerprofileservice customerprofileservice;

    public customerprofilecontroller(customerprofileservice customerprofileservice) {
        this.customerprofileservice = customerprofileservice;
    }

    @PostMapping("/{userid}/profile")
    public customerprofile createprofile(
            @PathVariable Long userid,
            @RequestBody customerprofile profile) {

        return customerprofileservice.createcustomerprofile(userid, profile);
    }
}