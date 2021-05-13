package com.infoshareacademy.repository;


import com.infoshareacademy.Event;

import java.util.List;

public class Repository {


    public static List<Event> eventList = LoadJson.loadJsonAsArray("src/main/resources/data.json");
    private Repository() {

    }

}
