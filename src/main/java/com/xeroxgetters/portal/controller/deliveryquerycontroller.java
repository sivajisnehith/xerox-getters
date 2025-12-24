package com.xeroxgetters.portal.controller;

import com.xeroxgetters.portal.dto.deliverydetailsresponse;
import com.xeroxgetters.portal.service.deliveryqueryservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delivery")
public class deliveryquerycontroller {

    private final deliveryqueryservice deliveryqueryservice;

    public deliveryquerycontroller(deliveryqueryservice deliveryQueryService) {
        this.deliveryqueryservice = deliveryQueryService;
    }

    @GetMapping("/{userId}")
    public deliverydetailsresponse getDeliveryDetails(@PathVariable Long userId) {
        return deliveryqueryservice.getDeliveryDetails(userId);
    }
}
