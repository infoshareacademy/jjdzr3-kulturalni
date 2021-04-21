package com.infoshareacademy.menu.menu;

import java.io.IOException;

public class MenuUtil {
    public void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                System.out.print("\033\143");
        } catch (IOException | InterruptedException ex) {

        }
    }

}
