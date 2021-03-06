package com.infoshareacademy.menu;

import com.infoshareacademy.Configuration;
import com.infoshareacademy.EventsDB;
import com.infoshareacademy.Favourities;

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
        System.out.println("|        4. Wyszukiwanie wydarzeń                          |");
        System.out.println("|        5. Edycja wydarzeń                                |");
        System.out.println("|        6. Wyjście                                        |");
        System.out.println("============================================================");
        System.out.println("Wybierz odpowiednią opcję:");
    }

    public void start(EventsDB eventsDB, Favourities favourities, Configuration configuration) {
        try {
            Scanner scanner = new Scanner(System.in);
            printMenu();
            int key;
            do {
                MenuUtil menuUtil = new MenuUtil();
                key = menuUtil.checkInput(scanner);
                switch (key) {
                    case 1:
                        SelectEventMenu selectEventMenu = new SelectEventMenu();
                        selectEventMenu.start(eventsDB);
                        break;
                    case 2:
                        SortMenu sortMenu = new SortMenu();
                        sortMenu.start(eventsDB, configuration);
                        System.out.println("Menu sortowania");
                        break;
                    case 3:
                        FavouriteMenu favouriteMenu = new FavouriteMenu();
                        favouriteMenu.start(favourities, eventsDB);
                        break;
                    case 4:
                        SearchMenu searchMenu = new SearchMenu();
                        searchMenu.start(eventsDB,configuration);
                        break;
                    case 5:
                        EditMenu editMenu = new EditMenu();
                        editMenu.start(eventsDB);
                        break;
                    case 6:
                        System.out.println("Wyjście. Do zobaczenia.");
                        break;
                    default:
                        System.out.println("Wybierz poprawną opcję!");
                }
            } while (key != 6);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Wpisz poprawny symbol!");
        }
    }
}
