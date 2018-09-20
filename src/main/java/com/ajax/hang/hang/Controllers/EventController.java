package com.ajax.hang.hang.Controllers;

import com.ajax.hang.hang.dto.EventDTO;
import com.ajax.hang.hang.dto.UserDTO;
import com.ajax.hang.hang.sevices.EventSevice;
import com.ajax.hang.hang.sevices.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventController {
    @Autowired
    EventSevice eventSevice;

    @GetMapping(value = "/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("");
        return mav;
    }

    @GetMapping(value = "/addEvent")
    public ModelAndView add(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("addEvent");
        mav.addObject("Event", new UserDTO());// Object user biding data
        return mav;
    }

    @PostMapping(value = "/addEvent-process")
    public String addProcess(EventDTO eventDTO){
        eventSevice.addEvent(eventDTO);
        return "redirect:/addEvent";
    }
}
