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

        eventsDB.sortByConfiguration(configuration.getDirection(), configuration.getSortParameter()); // Tu jest tymczasowe wywołanie sortowania wg konfiguracji
        eventsDB.displayEvents(configuration.getDateFormat());    // Tu jest tymczasowo do wywołania wyświetlenia wszystkich eventów, fla których display=1

        eventsDB.sortByConfiguration(configuration.getDirection(), configuration.getSortParameter()); // Tu jest tymczasowe wywołanie sortowania wg konfiguracji
        eventsDB.setFilterByName(new String[] {"-FILTER", "-NAME", "-\"Miejski", "Teatr", "MINIATURA\""}); // Tu jest tymczasowo wywołanie filtrowania po nazwie
        eventsDB.displayEvents(configuration.getDateFormat());    // Tu jest tymczasowo do wywołania wyświetlenia wszystkich eventów, fla których display=1

        eventsDB.sortByConfiguration(configuration.getDirection(), configuration.getSortParameter()); // Tu jest tymczasowe wywołanie sortowania wg konfiguracji
        eventsDB.setFilterByDate(new String[] {"-FILTER", "-DATE", "-2021-03-26", "-2021-04-01"}); // Tu jest tymczasowo wywołanie filtrowania po dacie
        eventsDB.displayEvents(configuration.getDateFormat());    // Tu jest tymczasowo do wywołania wyświetlenia wszystkich eventów, fla których display=1

        favourities.addFavourite(72591);  // Tu jest tymczasowo wywołane dodanie wydarzenia do ulubionych
        eventsDB.sortByConfiguration(configuration.getDirection(), configuration.getSortParameter()); // Tu jest tymczasowe wywołanie sortowania wg konfiguracji
        eventsDB.setAllFavouritiesToDisplay(favourities); // Tu jest tymczasowo wywołane wyświetlenie wszystkich ulubionych
        eventsDB.displayEvents(configuration.getDateFormat());    // Tu jest tymczasowo do wywołania wyświetlenia wszystkich eventów, fla których display=1


    }








}
