package com.infoshareacademy;

import com.infoshareacademy.eventsEntities.Events;
import com.infoshareacademy.menuService.MainMenu;

import java.io.IOException;
import java.util.Scanner;


public class StartApp {
    public static void main(String[] args) throws IOException {
        JsonParser jsonParser = new JsonParser();
        Events events = new Events();
        events.setEvents(jsonParser.parseJsonToObject());

        MainMenu mainMenu = new MainMenu(new Scanner(System.in));
        mainMenu.start(events);



    }
}
