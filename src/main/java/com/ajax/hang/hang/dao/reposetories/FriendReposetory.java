package com.ajax.hang.hang.dao.reposetories;

import com.ajax.hang.hang.dao.models.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendReposetory extends JpaRepository<Friend, Long> {
}
