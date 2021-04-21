package com.infoshareacademy.menu;

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
        System.out.println("|      2. Usunąć wydarzenie z ulubionych           |");
        System.out.println("|      3. Powrót do menu głównego                  |");
        System.out.println("===================================================");
        System.out.println("Wybierz odpowiednią opcję:");
    }

    public void start(Favourities favourities) {
        Scanner selectScanner = new Scanner(System.in);
        int key;
        do {
            printFavouriteMenu();
            key = selectScanner.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Wszystkie ulubione wydzrzenia:");
                    favourities.readFavourities();
                    break;
                case 2:
                    System.out.println("Dodaj wydarzenie do ulubionych:");
                    System.out.println("Wpisz ID wydarzenia");
                    Scanner scannerID = new Scanner(System.in);
                    int addID = scannerID.nextInt();
                    favourities.addFavourite(addID);
                    break;
                case 3:
                    System.out.println("Usuń wydarzenie z ulubionych:");
                    System.out.println("Wpisz ID wydarzenia");
                    Scanner scanner = new Scanner(System.in);
                    int removeID = scanner.nextInt();
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
