package com.infoshareacademy;

import com.google.gson.Gson;
import com.infoshareacademy.DomainData.EventJson;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EventsDB {
    private List<Event> eventsDB = new ArrayList<>();
    private Path path = Paths.get("src", "main", "resources", "json.json");


    public void readEvent() {
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader(String.valueOf(path));
            EventJson[] eventJson = gson.fromJson(reader, EventJson[].class);

            for (int i = 0; i < eventJson.length; i++) {
                Event event = new Event(eventJson[i]);
                eventsDB.add(event);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Błąd odczytu pliku *.json.");
        }
    }

    public void displayEvents(String s){
        /*in progress*/
    }
}
