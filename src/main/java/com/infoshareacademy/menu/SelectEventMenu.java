package com.infoshareacademy.menu;


import com.infoshareacademy.events.Events;
import com.infoshareacademy.menu.MainMenu;

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

    public void start(Events events) {
            Scanner selectScanner = new Scanner(System.in);
            int key;
            do {
                printSelectEventMenu();
                key = selectScanner.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("Wszystkie wydzrzenia:");
                        events.displayAllEvents();
                        System.out.print("\f");
                        break;
                    case 2:
                        System.out.println("Pokazać wydarzenie numer:");
                        System.out.println("Wpisz numer wydarzenia");
                        events.displaySingleEvent();
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
