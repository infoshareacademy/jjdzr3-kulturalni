package com.infoshareacademy.menu;

import com.infoshareacademy.Configuration;
import com.infoshareacademy.EventsDB;

import java.util.Scanner;

public class SearchMenu extends MainMenu {

    public void printSearchMenu(){
        System.out.println("====================================================");
        System.out.println("             |Menu wyszukiwania wydarzeń|           ");
        System.out.println("====================================================");
        System.out.println("|Opcja:                                             |");
        System.out.println("|        1. Wyszukaj  wydarzenie po ID              |");
        System.out.println("|        2. Wyszukaj  wydarzenie po nazwie          |");
        System.out.println("|        3. Wyszukaj  wydarzenie po miejscu         |");
        System.out.println("|        4. Wyszukaj  wydarzenie po organizatorze   |");
        System.out.println("|        5. Powrót do menu głównego                 |");
        System.out.println("=====================================================");
        System.out.println("Wybierz odpowiednią opcję:");
    }

    public void start(EventsDB eventsDB, Configuration configuration) {
        Scanner searchScanner = new Scanner(System.in);
        int key;
        do {
            printSearchMenu();
            MenuUtil menuUtil = new MenuUtil();
            key = menuUtil.checkInput(searchScanner);
            switch (key) {
                case 1:
                    eventsDB.setNoneEventsToDisplay();
                    eventsDB.searchElement("ID");
                    eventsDB.displayEvents(configuration.getSortParameter());
                    break;
                case 2:
                    eventsDB.setNoneEventsToDisplay();
                    eventsDB.searchElement("NAME");
                    eventsDB.displayEvents(configuration.getSortParameter());
                    break;
                case 3:
                    eventsDB.setNoneEventsToDisplay();
                    eventsDB.searchElement("PLACE");
                    eventsDB.displayEvents(configuration.getSortParameter());
                    break;
                case 4:
                    eventsDB.setNoneEventsToDisplay();
                    eventsDB.searchElement("ORGANIZER");
                    eventsDB.displayEvents(configuration.getSortParameter());
                    break;
                case 5:
                    System.out.println("Powrót do menu głównego");
                    printMenu();
                    break;
                default:
                    System.out.println("Wybierz poprawną opcję!");
            }

        } while (key != 5);
    }
}

