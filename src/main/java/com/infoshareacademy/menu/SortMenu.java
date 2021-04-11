package com.infoshareacademy.menu;

import com.infoshareacademy.events.Events;
import com.infoshareacademy.menu.MainMenu;

import java.util.Scanner;

public class SortMenu extends MainMenu {

    public void printSortMenu() {
        System.out.println("===========================================");
        System.out.println("        |Menu sortowania wydarzeń|         ");
        System.out.println("===========================================");
        System.out.println("|Opcja:                                    |");
        System.out.println("|        1. Sortowanie po dacie wydarzenia |");
        System.out.println("|        2.     |");
        System.out.println("|        3.       |");
        System.out.println("===========================================");
        System.out.println("Wybierz odpowiednią opcję:");
    }

    public void start(Events events) {
        Scanner sortScanner = new Scanner(System.in);
        int key;
        do {
            printSortMenu();
            key = sortScanner.nextInt();
            switch (key) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Powrót do menu głównego");
                    printMenu();
                    break;
            }
        } while (key != 3);
    }
}