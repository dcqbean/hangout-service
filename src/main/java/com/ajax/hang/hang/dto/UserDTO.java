package com.ajax.hang.hang.dto;

import javafx.scene.image.Image;

import java.util.List;

public class UserDTO {
    private Long id;
    private String fullName;
    private List<FriendDTO> fiends;
    private String userEmail;
    private String userAvatar;
    private Integer userLat;
    private Integer userLong;

    public List<FriendDTO> getFiends() {
        return fiends;
    }

    public void setFiends(List<FriendDTO> fiends) {
        this.fiends = fiends;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getUserLat() {
        return userLat;
    }

    public void setUserLat(Integer userLat) {
        this.userLat = userLat;
    }

    public Integer getUserLong() {
        return userLong;
    }

    public void setUserLong(Integer userLong) {
        this.userLong = userLong;
    }


    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }
}
