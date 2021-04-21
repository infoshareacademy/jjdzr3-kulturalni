package com.infoshareacademy.menu.menu;

import com.infoshareacademy.EventsDB;
import com.infoshareacademy.Favourities;
import com.infoshareacademy.menu.SelectEventMenu;
import com.infoshareacademy.menu.SortMenu;

import java.util.Scanner;

public class MainMenu {

    public void printMenu() {
        System.out.println("============================================================");
        System.out.println("|Cześć, jestem wyszukiwarką wydarzeń kulturalnych w Gdańsku|");
        System.out.println("============================================================");
        System.out.println("|Opcja:                                                    |");
        System.out.println("|        1. Pokaż wydarzenia                               |");
        System.out.println("|        2. Sortuj wydarzenia                              |");
        System.out.println("|        3. Ulubione wydarzenia                            |");
        System.out.println("|        4. Option 4                                       |");
        System.out.println("|        5. Wyjście                                        |");
        System.out.println("============================================================");
        System.out.println("Wybierz odpowiedną opcję:");
    }

    public void start(EventsDB eventsDB, Favourities favourities) {
        try {
            Scanner scanner = new Scanner(System.in);
            int key;
            printMenu();
            do {
                MenuUtil menuUtil = new MenuUtil();
                key = scanner.nextInt();
                switch (key) {
                    case 1:
                        SelectEventMenu selectEventMenu = new SelectEventMenu();
                        selectEventMenu.start(eventsDB);
                        menuUtil.clearScreen();
                        break;
                    case 2:
                        SortMenu sortMenu = new SortMenu();
                        sortMenu.start(eventsDB);
                        System.out.println("Menu sortowania");
                        menuUtil.clearScreen();
                        break;
                    case 3:
                        FavouriteMenu favouriteMenu = new FavouriteMenu();
                        favouriteMenu.start(favourities);
                        menuUtil.clearScreen();
                        break;
                    case 4:
                        System.out.println("Opcja 4");
                        break;
                    case 5:
                        System.out.println("Wyjście");
                        break;
                    default:
                        System.out.println("Wybierz poprawną opcję!");
                }
            } while (key != 5);
    } catch (Exception e){
            e.printStackTrace();
            System.out.println("Wpisz poprawny symbol!");
        }
    }
}
