package com.xeroxgetters.portal.controller;

import com.xeroxgetters.portal.dto.customerdetailsresponse;
import com.xeroxgetters.portal.service.customerqueryservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerQueryController {

    private final customerqueryservice customerQueryService;

    public CustomerQueryController(customerqueryservice customerQueryService) {
        this.customerQueryService = customerQueryService;
    }

    @GetMapping("/{userId}")
    public customerdetailsresponse getCustomerDetails(@PathVariable Long userId) {
        return customerQueryService.getCustomerDetails(userId);
    }
}
