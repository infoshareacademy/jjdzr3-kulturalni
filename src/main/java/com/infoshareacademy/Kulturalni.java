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

        eventsDB.setFilterByName(new String[] {"-FILTER", "-NAME", "-\"Miejski", "Teatr", "MINIATURA\""}); // Tu jest tymczasowo wywołanie filtrowania po nazwie
        eventsDB.displayEvents("1");    // Tu jest tymczasowo do wywołania wyświetlenia wszystkich eventów, fla których display=1

        eventsDB.setFilterByDate(new String[] {"-FILTER", "-DATE", "-2021-03-26", "-2021-04-01"}); // Tu jest tymczasowo wywołanie filtrowania po dacie
        eventsDB.displayEvents("1");    // Tu jest tymczasowo do wywołania wyświetlenia wszystkich eventów, fla których display=1



    }








}
