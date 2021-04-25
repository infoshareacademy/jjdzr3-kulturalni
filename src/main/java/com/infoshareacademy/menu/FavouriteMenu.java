package com.infoshareacademy.menu;

import com.infoshareacademy.EventsDB;
import com.infoshareacademy.Favourities;

import java.util.Scanner;

public class FavouriteMenu extends MainMenu {

    public void printFavouriteMenu() {
        System.out.println("===================================================");
        System.out.println("              |Menu ulubionych wydarzeń|           ");
        System.out.println("===================================================");
        System.out.println("|Opcja:                                            |");
        System.out.println("|      1. Pokazać wszystkie ulubione wydarzenia    |");
        System.out.println("|      2. Dodać wydarzenie do ulubionych           |");
        System.out.println("|      3. Usunąć wydarzenie z ulubionych           |");
        System.out.println("|      4. Powrót do menu głównego                  |");
        System.out.println("===================================================");
        System.out.println("Wybierz odpowiednią opcję:");
    }

    public void start(Favourities favourities, EventsDB eventsDB) {
        Scanner selectScanner = new Scanner(System.in);
        int key;
        do {
            printFavouriteMenu();
            MenuUtil menuUtil = new MenuUtil();
            key = menuUtil.checkInput(selectScanner);
            switch (key) {
                case 1:
                    System.out.println("Wszystkie ulubione wydzrzenia:");
                    eventsDB.setAllFavouritiesToDisplay(favourities);
                    eventsDB.displayEvents("1");
                    break;
                case 2:
                    System.out.println("Dodaj wydarzenie do ulubionych:");
                    System.out.println("Wpisz ID wydarzenia");
                    Scanner scannerID = new Scanner(System.in);
                    int addID = menuUtil.checkInput(scannerID);
                    favourities.addFavourite(addID);
                    break;
                case 3:
                    System.out.println("Usuń wydarzenie z ulubionych:");
                    System.out.println("Wpisz ID wydarzenia");
                    Scanner scanner = new Scanner(System.in);
                    int removeID = menuUtil.checkInput(scanner);
                    favourities.removeFavourite(removeID);
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
