package com.ajax.hang.hang.dao.reposetories;

import com.ajax.hang.hang.dao.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposetory extends JpaRepository<User, Long> {
}
