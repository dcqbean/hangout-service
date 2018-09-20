package com.ajax.hang.hang.dao.reposetories;

import com.ajax.hang.hang.dao.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventReposetory extends JpaRepository<Event, Long> {
}
