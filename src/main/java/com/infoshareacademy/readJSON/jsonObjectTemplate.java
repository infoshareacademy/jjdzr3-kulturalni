package com.infoshareacademy.readJSON;
import com.infoshareacademy.readJSON.classTemplate.*;
import java.util.Arrays;
import java.util.Objects;

public class jsonObjectTemplate {

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
        if (!(o instanceof jsonObjectTemplate)) return false;
        jsonObjectTemplate jsonObjectTemplate = (jsonObjectTemplate) o;
        return Objects.equals(place, jsonObjectTemplate.place) && Objects.equals(endDate, jsonObjectTemplate.endDate) && Objects.equals(name, jsonObjectTemplate.name) && Objects.equals(urls, jsonObjectTemplate.urls) && Arrays.equals(attachments, jsonObjectTemplate.attachments) && Objects.equals(id, jsonObjectTemplate.id) && Objects.equals(descLong, jsonObjectTemplate.descLong) && Objects.equals(categoryId, jsonObjectTemplate.categoryId) && Objects.equals(startDate, jsonObjectTemplate.startDate) && Objects.equals(organizer, jsonObjectTemplate.organizer) && Objects.equals(active, jsonObjectTemplate.active) && Objects.equals(descShort, jsonObjectTemplate.descShort) && Objects.equals(tickets, jsonObjectTemplate.tickets);
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

    }


