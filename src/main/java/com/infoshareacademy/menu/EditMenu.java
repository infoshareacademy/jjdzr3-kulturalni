package com.infoshareacademy.menu;

import com.infoshareacademy.EventsDB;

import java.util.Scanner;

public class EditMenu extends MainMenu {

    public void printEditMenu() {
        System.out.println("=========================================");
        System.out.println("        |Menu edycji wydarzeń|           ");
        System.out.println("=========================================");
        System.out.println("|Opcja:                                  |");
        System.out.println("|        1. Dodawanie wydarzenia         |");
        System.out.println("|        2. Kasowanie wydarzenia         |");
        System.out.println("|        3. Edycja wydarzenia            |");
        System.out.println("|        4. Powrót do menu głównego      |");
        System.out.println("=========================================");
        System.out.println("Wybierz odpowiednią opcję:");
    }

    public void start(EventsDB eventsDB) {
        Scanner selectScanner = new Scanner(System.in);
        int key;
        do {
            printEditMenu();
            MenuUtil menuUtil = new MenuUtil();
            key = menuUtil.checkInput(selectScanner);
            switch (key) {
                case 1:
                    System.out.println("Dodaj nowe wydarzenie:");
                    eventsDB.createEvent();
                    break;
                case 2:
                    System.out.println("Skasuj wydarzenie o numerze ID:");
                    System.out.println("Wpisz ID wydarzenia");
                    Scanner scannerID = new Scanner(System.in);
                    int inputID = menuUtil.checkInput(scannerID);
                    eventsDB.removeEvent(inputID);
                    break;
                case 3:
                    System.out.println("Edytuj wydarzenie o numerze ID:");
                    System.out.println("Wpisz ID wydarzenia");
                    Scanner scannerID1 = new Scanner(System.in);
                    inputID = menuUtil.checkInput(scannerID1);
                    eventsDB.editEvent(inputID);
                    break;
                case 4:
                    System.out.println("Powrót do menu głównego");
                    printMenu();
                    break;
                default:
                    System.out.println("Wybierz poprawną opcję!");
            }

        } while (key != 4);
    }
}
