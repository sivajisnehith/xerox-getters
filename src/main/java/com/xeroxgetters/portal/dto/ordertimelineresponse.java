package com.xeroxgetters.portal.dto;

public class ordertimelineresponse {

    private String time;
    private String event;

    public ordertimelineresponse(String time, String event) {
        this.time = time;
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public String getEvent() {
        return event;
    }
}
