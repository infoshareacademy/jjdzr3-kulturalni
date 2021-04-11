package com.infoshareacademy;

import com.infoshareacademy.readJSON.classTemplate.EventJson;

import java.util.Objects;

public class Event implements Comparable{
    private EventJson eventJson;
    private String sortParameter;
    private Integer display;

    public Event(EventJson eventJson) {
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(eventJson, event.eventJson) && Objects.equals(sortParameter, event.sortParameter) && Objects.equals(display, event.display);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventJson, sortParameter, display);
    }

    public EventJson getEventJson() {
        return eventJson;
    }

    public void setEventJson(EventJson eventJson) {
        this.eventJson = eventJson;
    }

    public String getSortParameter() {
        return sortParameter;
    }

    public void setSortParameter(String sortParameter) {
        this.sortParameter = sortParameter;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }
}
