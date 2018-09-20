package com.ajax.hang.hang.dto;

public class EventDTO {
    private Long userId;
    private String eventName;
    private Integer eventLat;
    private Integer eventLong;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Integer getEventLat() {
        return eventLat;
    }

    public void setEventLat(Integer eventLat) {
        this.eventLat = eventLat;
    }

    public Integer getEventLong() {
        return eventLong;
    }

    public void setEventLong(Integer eventLong) {
        this.eventLong = eventLong;
    }
}
