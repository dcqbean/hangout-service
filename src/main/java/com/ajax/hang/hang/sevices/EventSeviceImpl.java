package com.ajax.hang.hang.sevices;

import com.ajax.hang.hang.dao.models.Event;
import com.ajax.hang.hang.dao.reposetories.EventReposetory;
import com.ajax.hang.hang.dto.EventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventSeviceImpl implements EventSevice {
    @Autowired
    EventReposetory eventReposetory;

    @Override
    public void addEvent(EventDTO eventDTO) {
        Event event = new Event();
        event.setEventName(eventDTO.getEventName());
        event.setUserId(eventDTO.getUserId());
        event.setUserLat(eventDTO.getEventLat());
        event.setUserLong(eventDTO.getEventLong());

        eventReposetory.save(event);
    }

    @Override
    public void removeEvent(Long id) {
        eventReposetory.deleteById(id);
    }
}
