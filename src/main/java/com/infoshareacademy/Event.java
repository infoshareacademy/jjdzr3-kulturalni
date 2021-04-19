package com.infoshareacademy;

import com.infoshareacademy.DomainData.EventJson;
import com.infoshareacademy.DomainData.Organizer;
import com.infoshareacademy.DomainData.Place;

import java.util.Objects;

public class Event implements Comparable<Event> {
    private EventJson eventJson;
    private String sortParameter;
    private Integer display;
    private Place place;
    private String name;
    private String startDate;
    private Organizer organizer;

    public Event(EventJson eventJson) {
        this.eventJson = eventJson;
        sortParameter = "ID";
        this.display = 1;
    }

    public Event(Place place, String name, String startDate, Organizer organizer) {
        this.place = place;
        this.name = name;
        this.startDate = startDate;
        this.organizer = organizer;
    }

    @Override
    public int compareTo(Event o) {
        return this.getSortParameter().compareTo(o.getSortParameter());
    }

    ///////////////////////////////HASCODE & EQUALS///////////////////////////////////

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

    /////////////////////////SETTERS & GETTERS///////////////////////////////////

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

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

}
