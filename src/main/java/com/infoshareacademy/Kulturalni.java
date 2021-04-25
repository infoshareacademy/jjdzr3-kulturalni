package com.infoshareacademy;


import com.infoshareacademy.menu.MainMenu;

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

        MainMenu mainMenu = new MainMenu();
        mainMenu.start(eventsDB,favourities,configuration);

//        eventsDB.sortByConfiguration(configuration.getDirection(), configuration.getSortParameter()); // Tu jest tymczasowe wywołanie sortowania wg konfiguracji
//        eventsDB.displayEvents(configuration.getDateFormat());    // Tu jest tymczasowo do wywołania wyświetlenia wszystkich eventów, fla których display=1
//
//        eventsDB.sortByConfiguration(configuration.getDirection(), configuration.getSortParameter()); // Tu jest tymczasowe wywołanie sortowania wg konfiguracji
//        eventsDB.setFilterByName(new String[] {"-FILTER", "-NAME", "-\"Miejski", "Teatr", "MINIATURA\""}); // Tu jest tymczasowo wywołanie filtrowania po nazwie
//        eventsDB.displayEvents(configuration.getDateFormat());    // Tu jest tymczasowo do wywołania wyświetlenia wszystkich eventów, fla których display=1

//        eventsDB.sortByConfiguration(configuration.getDirection(), configuration.getSortParameter()); // Tu jest tymczasowe wywołanie sortowania wg konfiguracji
//        eventsDB.setFilterByDate(new String[] {"-FILTER", "-DATE", "-2021-03-26", "-2021-04-01"}); // Tu jest tymczasowo wywołanie filtrowania po dacie
//        eventsDB.displayEvents(configuration.getDateFormat());    // Tu jest tymczasowo do wywołania wyświetlenia wszystkich eventów, fla których display=1

//        favourities.addFavourite(72591);  // Tu jest tymczasowo wywołane dodanie wydarzenia do ulubionych
//        eventsDB.sortByConfiguration(configuration.getDirection(), configuration.getSortParameter()); // Tu jest tymczasowe wywołanie sortowania wg konfiguracji
//        eventsDB.setAllFavouritiesToDisplay(favourities); // Tu jest tymczasowo wywołane wyświetlenie wszystkich ulubionych
//        eventsDB.displayEvents(configuration.getDateFormat());    // Tu jest tymczasowo do wywołania wyświetlenia wszystkich eventów, fla których display=1


    }

    public static void displayHelp() {
        System.out.println("Kulturalni help.");
        System.out.println();
        System.out.println("Commands description:");
        System.out.println("kulturalni -show -id -<event id>                        -> displays one event denoted by id. Example: kulturalni -show 12345");
        System.out.println("kulturalni -show -all                                   -> displays all events");
        System.out.println("kulturalni -fav -all                                    -> displays all favourite events");
        System.out.println("kulturalni -fav -add -<event id>                        -> adds event to favourities");
        System.out.println("kulturalni -fav -delete -<event id>                     -> removes event from favourities");
        System.out.println("kulturalni -sort -id                                    -> sorts events by id");
        System.out.println("kulturalni -sort -date                                  -> sorts events by date");
        System.out.println("kulturalni -sort -name                                  -> sorts events by name");
        System.out.println("kulturalni -search -org -<\"organizer name\">           -> searches organiser");
        System.out.println("kulturalni -search -date -<start date> -<end date>      -> searches date");
        System.out.println("kulturalni -search -name -<event name>                  -> searches name");
        System.out.println("kulturalni -filter -name -<\"organizer name\">          -> searches name");
        System.out.println("kulturalni -filter -date -<start date> -<end date>      -> searches date");
        System.out.println();
    }






}
