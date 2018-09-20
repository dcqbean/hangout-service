package com.ajax.hang.hang.sevices;

import com.ajax.hang.hang.dao.models.Friend;
import com.ajax.hang.hang.dao.models.User;
import com.ajax.hang.hang.dao.reposetories.FriendReposetory;
import com.ajax.hang.hang.dao.reposetories.UserReposetory;
import com.ajax.hang.hang.dto.FriendDTO;
import com.ajax.hang.hang.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FriendSeviceImpl implements FriendSevice {
    @Autowired
    FriendReposetory friendReposetory;

    @Override
    public void addFriend(FriendDTO friendDTO){
        Friend friend = new Friend();
        friend.setFriendId(friendDTO.getFriendId());

        friendReposetory.save(friend);
    }

    @Override
    public void removeFriend(Long id) {

    }

    @Override
    public List<FriendDTO> getUsers() {
        return null;
    }
    /*@Override
    public List<FriendDTO> getBanks() {
        List<FriendDTO> friendDTOs = new ArrayList<>();
        List<Friend> friends = UserReposetory.findAll();
        for (Friend friend : friends) {
            FriendDTO FriendDTO = new FriendDTO();
            FriendDTO.setFriendId(friend.getFriendId());

            UserDTO userDTO = new UserDTO();
            userDTO.setId(friend.setUserId().getFriendId());
            userDTO.setFullName(friend.getUser().getFullName());

            FriendDTO.setUser(userDTO);

            friendDTOs.add(FriendDTO);
        }

        return friendDTOs;
    }*/
}
