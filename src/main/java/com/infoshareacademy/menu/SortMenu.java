package com.infoshareacademy.menu;

import com.infoshareacademy.Configuration;
import com.infoshareacademy.EventsDB;

import java.util.Scanner;

public class SortMenu extends MainMenu {

    public void printSortMenu() {
        System.out.println("============================================");
        System.out.println("        |Menu sortowania wydarzeń|          ");
        System.out.println("============================================");
        System.out.println("|Opcja:                                     |");
        System.out.println("|       1. Sortowanie po ID wydarzenia      |");
        System.out.println("|       2. Sortowanie po dacie wydarzenia   |");
        System.out.println("|       3. Sortowanie po nazwie wydarzenia  |");
        System.out.println("|       4. Powrót do menu głównego          |");
        System.out.println("=============================================");
        System.out.println("Wybierz odpowiednią opcję:");
    }

    public void start(EventsDB eventsDB, Configuration configuration) {
        Scanner sortScanner = new Scanner(System.in);
        int key;
        do {
            printSortMenu();
            MenuUtil menuUtil = new MenuUtil();
            key = menuUtil.checkInput(sortScanner);
            switch (key) {
                case 1:
                    System.out.println("Sortuj wydarzenia po ID");
                    eventsDB.sortByID(configuration.getDirection(),"ID");
                    eventsDB.setAllEventsToDisplay();
                    eventsDB.displayEvents("1");
                    break;
                case 2:
                    System.out.println("Sortuj wydarzenia po dacie");
                    eventsDB.sortByDate(configuration.getDirection(),"DATE");
                    eventsDB.setAllEventsToDisplay();
                    eventsDB.displayEvents("1");
                    break;
                case 3:
                    System.out.println("Sortuj wydarzenia po nazwie");
                    eventsDB.sortByOrganizer(configuration.getDirection(),"NAME");
                    eventsDB.setAllEventsToDisplay();
                    eventsDB.displayEvents("1");
                    break;
                case 4:
                    System.out.println("Powrót do menu głównego");
                    printMenu();
                    break;
            }
        } while (key != 4);
    }
}