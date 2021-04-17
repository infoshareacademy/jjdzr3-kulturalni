package com.infoshareacademy;


public class Kulturalni {
    EventsDB eventsDB;
    Configuration configuration;
    Favourities favourities;

    public static void main( String[] args ) {
        new Kulturalni().doJob(args);
    }

    public void doJob(String[] args) {
        configuration = new Configuration();
        configuration.readConfiguration();
        favourities = new Favourities();

        eventsDB = new EventsDB();
        eventsDB.readEvent();

        favourities.readFavourities();

        eventsDB.displayEvents("1");    // Tu jest tymczasowo do wywołania wyświetlenia wszystkich eventów, fla których display=1





    }








}
