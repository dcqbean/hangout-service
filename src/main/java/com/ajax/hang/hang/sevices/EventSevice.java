package com.ajax.hang.hang.sevices;

import com.ajax.hang.hang.dto.EventDTO;

public interface EventSevice {
    void addEvent(EventDTO eventDTO);
    void removeEvent(Long id);
}
