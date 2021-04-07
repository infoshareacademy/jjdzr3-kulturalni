package com.infoshareacademy.menuService;

import com.infoshareacademy.eventsEntities.Events;

import java.util.Scanner;

public class MainMenu {
    private final Scanner scanner;

    public MainMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printMenu() {
        System.out.println("============================================================");
        System.out.println("|Cześć, jestem wyszukiwarką wydarzeń kulturalnych w Gdańsku|");
        System.out.println("============================================================");
        System.out.println("|Opcja:                                                    |");
        System.out.println("|        1. Pokaż wydarzenia                               |");
        System.out.println("|        2. Option 2                                       |");
        System.out.println("|        3. Option 3                                       |");
        System.out.println("|        4. Option 4                                       |");
        System.out.println("|        5. Wyjście                                          |");
        System.out.println("============================================================");
        System.out.println("Wybierz odpowiedną opcję:");
    }

    public void start(Events events) {
        try {
        if (this.scanner != null) {
            int key;
            String line;
            printMenu();
            do {
                line = this.scanner.nextLine();
                key = Integer.parseInt(line);
                switch (key) {
                    case 1:
                        SelectEventMenu selectEventMenu = new SelectEventMenu(scanner);
                        selectEventMenu.start(events);
                        break;
                    case 2:
                        System.out.println("Opcja 2");
                        break;
                    case 3:
                        System.out.println("Opcja 3");
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
        }
    } catch (Exception e){
            System.out.println("Wpisz poprawny symbol!");
        }
    }
}
