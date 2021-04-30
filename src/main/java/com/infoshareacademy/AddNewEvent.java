package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class AddNewEvent {
    List<Event> newEvent = new ArrayList<>();

    public void addEvent(Event event) {
        newEvent.add(event);
    }

    public List<Event> getNewEvent() {
        return newEvent;
    }
}
