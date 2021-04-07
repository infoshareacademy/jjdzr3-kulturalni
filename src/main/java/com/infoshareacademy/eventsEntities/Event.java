package com.infoshareacademy.eventsEntities;

public class Event extends Events {
    private int ID;
    private int categoryID;
    private int active;
    private String name;
    private String endDate;
    private String startDate;
    private Urls urls;
    private String descLong;
    private String descShort;
    private Place place;
    private Tickets tickets;
    private Organizer organizer;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public String getDescLong() {
        return descLong;
    }

    public void setDescLong(String descLong) {
        this.descLong = descLong;
    }

    public String getDescShort() {
        return descShort;
    }

    public void setDescShort(String descShort) {
        this.descShort = descShort;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Tickets getTickets() {
        return tickets;
    }

    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }


    @Override
    public String toString() {
        return "{" +
                "'" + name + '\'' +
                ", " + place +
                ", organizer-" + organizer +
                ", startDate:'" + startDate + '\'' +
                ", endDate:'" + endDate + '\'' +
                ", '" + urls + '\'' +
                ", descShort:'" + descShort + '\'' +
                ", " + tickets +
                '}';
    }

}
