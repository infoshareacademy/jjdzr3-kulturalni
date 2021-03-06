package com.infoshareacademy;

import com.infoshareacademy.DomainData.*;

import java.util.Objects;

public class Event implements Comparable<Event>{
    private EventJson eventJson;
    private String sortParameter;
    private Integer display;

    public Event(EventJson eventJson) {
        this.eventJson = eventJson;
        sortParameter = "ID";
        this.display = 1;
    }
    public Event(Integer id, String name, String startDate, String endDate, Organizer organizer, Place place, URLs urLs, Attachments attachment, String descLong, Integer categoryId, Integer active, String descShort, Tickets ticket) {
        EventJson eventJson = new EventJson();
        eventJson.setPlace(place);
        eventJson.setId(id);
        eventJson.setName(name);
        eventJson.setStartDate(startDate);
        eventJson.setEndDate(endDate);
        eventJson.setOrganizer(organizer);
        eventJson.setUrls(urLs);
        eventJson.setAttachments(attachment);
        eventJson.setDescLong(descLong);
        eventJson.setCategoryId(categoryId);
        eventJson.setActive(active);
        eventJson.setDescShort(descShort);
        eventJson.setTickets(ticket);
        this.eventJson = eventJson;
        sortParameter = "ID";
        this.display = 1;
    }

    @Override
    public int compareTo(Event o) {
        return this.getSortParameter().compareTo(o.getSortParameter());
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
