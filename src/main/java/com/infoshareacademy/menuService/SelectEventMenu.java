package com.infoshareacademy.menuService;

import com.infoshareacademy.eventsEntities.Events;

import java.util.Scanner;

public class SelectEventMenu {
    private Scanner scanner;

    public SelectEventMenu(Scanner scanner) {
        this.scanner = scanner;
    }


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

    public void start(Events events) {
        if (this.scanner != null) {
            int key;
            String line;
            do {
                printSelectEventMenu();
                line = this.scanner.nextLine();
                key = Integer.parseInt(line);
                switch (key) {
                    case 1:
                        System.out.println("Wszystkie wydzrzenia:");
                        events.displayAllEvents();
                        break;
                    case 2:
                        System.out.println("Pokazać wydarzenie numer:");
                        System.out.println("Wpisz numer wydarzenia");
                        events.displaySingleEvent();
                        break;
                    case 3:
                        System.out.println("Powrót do menu głównego");
                        MainMenu mainMenu = new MainMenu(scanner);
                        mainMenu.printMenu();
                        mainMenu.start(events);
                        break;
                    default:
                        System.out.println("Wybierz poprawną opcję!");
                }

            } while ( key!=3 );
        }
    }
}