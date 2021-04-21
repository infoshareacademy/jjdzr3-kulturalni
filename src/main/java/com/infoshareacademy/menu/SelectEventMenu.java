package com.infoshareacademy.menu;


import com.infoshareacademy.EventsDB;

import java.util.Scanner;

public class SelectEventMenu extends MainMenu {

    public void printSelectEventMenu() {
        System.out.println("=========================================");
        System.out.println("        |Menu wyboru wydarzeń|           ");
        System.out.println("=========================================");
        System.out.println("|Opcja:                                  |");
        System.out.println("|        1. Pokazać wszystkie wydarzenia |");
        System.out.println("|        2. Pokazać osobne wydarzenie    |");
        System.out.println("|        3. Powrót do menu głównego      |");
        System.out.println("=========================================");
        System.out.println("Wybierz odpowiednią opcję:");
    }

    public void start(EventsDB eventsDB) {
        Scanner selectScanner = new Scanner(System.in);
        int key;
        do {
            printSelectEventMenu();
            key = selectScanner.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Wszystkie wydarzenia:");
                    eventsDB.setAllEventsToDisplay();
                    eventsDB.displayEvents("1");
                    break;
                case 2:
                    System.out.println("Pokazać wydarzenie o numerze ID:");
                    System.out.println("Wpisz ID wydarzenia");
                    Scanner scannerID = new Scanner(System.in);
                    int inputID = scannerID.nextInt();
                    eventsDB.displaySingleEvent(inputID);
                    break;
                case 3:
                    System.out.println("Powrót do menu głównego");
                    printMenu();
                    break;
                default:
                    System.out.println("Wybierz poprawną opcję!");
            }

        } while (key != 3);
    }
}
