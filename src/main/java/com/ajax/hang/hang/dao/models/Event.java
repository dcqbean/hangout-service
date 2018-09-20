package com.ajax.hang.hang.dao.models;

import javax.persistence.*;

@Entity
@Table(name = "")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long eventId;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_lat")
    private int userLat;

    @Column(name = "user_long")
    private int userLong;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getUserLat() {
        return userLat;
    }

    public void setUserLat(int userLat) {
        this.userLat = userLat;
    }

    public int getUserLong() {
        return userLong;
    }

    public void setUserLong(int userLong) {
        this.userLong = userLong;
    }
}
