package com.infoshareacademy;

import com.google.gson.Gson;
import com.infoshareacademy.readJSON.classTemplate.EventJson;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EventsDB {


    public void readEvent() {
        EventsDB eventsDB = new EventsDB();
        Gson gson = new Gson();
        Path path = Paths.get("src","main","resources","data.json");
      try {
            FileReader reader = new FileReader(String.valueOf(path));
            EventJson[] eventJson = gson.fromJson(reader, EventJson[].class);

            for (int i = 0; i < eventJson.length; i++) {
               Event event = new Event(eventJson[i]);

            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Błąd odczytu pliku *.json.");
        }
    }

    public void displayEvents(String s) {
        //temp
    }}
