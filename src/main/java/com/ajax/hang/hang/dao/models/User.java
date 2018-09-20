package com.ajax.hang.hang.dao.models;

import javax.persistence.*;
import java.awt.*;
import java.util.Set;

@Entity
@Table(name = "")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_avatar")
    private String userAvatar;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "lat")
    private int userLat;

    @Column(name = "long")
    private int userLong;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<Friend> friends;

    public Set<Friend> getFriends() {
        return friends;
    }

    public void setFriends(Set<Friend> friends) {
        this.friends = friends;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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
