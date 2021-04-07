package com.infoshareacademy.eventsEntities;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Events {
    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public void displayAllEvents() {
        for (int i = 0; i < events.size(); i++) {
            int eventNr = i + 1;
            System.out.println();
            System.out.println("Wydarzenie nr " + eventNr);
            System.out.println("Nazwa wydarzenia: " + events.get(i).getName());
            System.out.println("Organizator: " + events.get(i).getOrganizer().getDesignation());

            if (events.get(i).getActive() == 1) {
                System.out.println("Wydarzenie jest aktualne.");
            } else
                System.out.println("Wydarzenie jest nieaktualne.");

            System.out.println("Data rozpoczęcia: " + events.get(i).getStartDate());
            System.out.println("Data zakończenia: " + events.get(i).getEndDate());
            System.out.println("Krótki opis: " + events.get(i).getDescShort());

        }
    }

    public void displaySingleEvent(){
        Scanner scanner = new Scanner(System.in);
        int eventNr = scanner.nextInt();
        System.out.println();
        System.out.println("Wydarzenie nr " + eventNr);
        System.out.println("Nazwa wydarzenia: " + events.get(eventNr).getName());
        System.out.println("Organizator: " + events.get(eventNr).getOrganizer().getDesignation());

        if (events.get(eventNr).getActive() == 1) {
            System.out.println("Wydarzenie jest aktualne.");
        } else
            System.out.println("Wydarzenie jest nieaktualne.");

        System.out.println("Data rozpoczęcia: " + events.get(eventNr).getStartDate());
        System.out.println("Data zakończenia: " + events.get(eventNr).getEndDate());
        System.out.println("Krótki opis: " + events.get(eventNr).getDescShort());

    }
}

