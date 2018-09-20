package com.ajax.hang.hang.sevices;

import com.ajax.hang.hang.dto.FriendDTO;

import java.util.List;

public interface FriendSevice {
    void addFriend(FriendDTO friendDTO);
    void removeFriend(Long id);
    List<FriendDTO> getUsers();
}
