package com.infoshareacademy.menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuUtil extends MainMenu {
    public void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                System.out.print("\033\143");
        } catch (IOException | InterruptedException ex) {

        }
    }

    public Integer checkInput(Scanner scanner) {
        int key;
        while (!scanner.hasNextInt()) {
            System.out.println("To nie jest cyfra!");
            scanner.next();
        }
        key = scanner.nextInt();
        return key;
    }
}
