package com.infoshareacademy.DomainData;
import java.util.Arrays;
import java.util.Objects;

public class EventJson {

    ////////////////////////////////VARIABLES/////////////////////////

    private Place place;
    private String endDate;
    private String name;
    private URLs urls;
    private Attachments[] attachments;
    private Integer id;
    private String descLong;
    private Integer categoryId;
    private String startDate;
    private Organizer organizer;
    private Integer active;
    private String descShort;
    private Tickets tickets;

    ////////////////////////////////HASHCODE & EQUALS/////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EventJson)) return false;
        EventJson EventJson = (EventJson) o;
        return Objects.equals(place, EventJson.place) && Objects.equals(endDate, EventJson.endDate) && Objects.equals(name, EventJson.name) && Objects.equals(urls, EventJson.urls) && Arrays.equals(attachments, EventJson.attachments) && Objects.equals(id, EventJson.id) && Objects.equals(descLong, EventJson.descLong) && Objects.equals(categoryId, EventJson.categoryId) && Objects.equals(startDate, EventJson.startDate) && Objects.equals(organizer, EventJson.organizer) && Objects.equals(active, EventJson.active) && Objects.equals(descShort, EventJson.descShort) && Objects.equals(tickets, EventJson.tickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, endDate, name, urls, attachments, id, descLong, categoryId, startDate, organizer, active, descShort, tickets);
    }

    ////////////////////////////////SETTERS & GETTERS/////////////////////////

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URLs getUrls() {
        return urls;
    }

    public void setUrls(URLs urls) {
        this.urls = urls;
    }

    public Attachments[] getAttachments() {
        return attachments;
    }

    public void setAttachments(Attachments[] attachments) {
        this.attachments = attachments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescLong() {
        return descLong;
    }

    public void setDescLong(String descLong) {
        this.descLong = descLong;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getDescShort() {
        return descShort;
    }

    public void setDescShort(String descShort) {
        this.descShort = descShort;
    }

    public Tickets getTickets() {
        return tickets;
    }

    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    public void setAttachments(Attachments attachment) {
    }
}


