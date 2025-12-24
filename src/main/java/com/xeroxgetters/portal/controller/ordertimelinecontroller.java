package com.xeroxgetters.portal.controller;

import com.xeroxgetters.portal.dto.ordertimelineresponse;
import com.xeroxgetters.portal.service.ordertimelineservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class ordertimelinecontroller {

    private final ordertimelineservice ordertimelineservice;

    public ordertimelinecontroller(ordertimelineservice ordertimelineservice) {
        this.ordertimelineservice = ordertimelineservice;
    }

    @GetMapping("/{orderId}/timeline")
    public List<ordertimelineresponse> getTimeline(@PathVariable Long orderId) {
        return ordertimelineservice.getTimeline(orderId);
    }
}
