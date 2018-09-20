package com.ajax.hang.hang.sevices;

import com.ajax.hang.hang.dao.models.User;
import com.ajax.hang.hang.dao.reposetories.UserReposetory;
import com.ajax.hang.hang.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSeviceImpl implements UserSevice{
    @Autowired
    UserReposetory userReposetory;

    @Override
    public void loginUser(UserDTO userDTO) {
        User user = new User();
        user.setUserEmail(userDTO.getUserEmail());
        user.setUserAvatar(userDTO.getUserAvatar());
        user.setUserLat(userDTO.getUserLat());
        user.setUserLong(userDTO.getUserLong());

        userReposetory.save(user);
    }
}
