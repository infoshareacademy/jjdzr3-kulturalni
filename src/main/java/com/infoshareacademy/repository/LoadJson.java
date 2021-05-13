package com.infoshareacademy.repository;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infoshareacademy.DomainData.*;
import com.infoshareacademy.Event;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadJson extends Event {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static String fileAsString;

    public LoadJson(EventJson eventJson) {
        super(eventJson);
    }

    public LoadJson(Integer id, String name, String startDate, String endDate, Organizer organizer, Place place, URLs urLs, Attachments attachment, String descLong, Integer categoryId, Integer active, String descShort, Tickets ticket) {
        super(id, name, startDate, endDate, organizer, place, urLs, attachment, descLong, categoryId, active, descShort, ticket);
    }

    static List<Event> loadJsonAsArray(String jsonPath) {
        Path eventPaths = Paths.get(jsonPath);
        Event[] events = null;
        if (Files.exists(eventPaths)) {
            try {
                fileAsString = Files.readString(eventPaths);
                if (fileAsString.equals("")) {
                    return new ArrayList<>();
                }
                mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                events = mapper.reader().forType(Event[].class).readValue(fileAsString);

            } catch (IOException e) {
                System.out.println("Ups! Coś poszło nie tak podczas otwierania pliku, lub odczytu, lub mapowania ");
            }
        }

        return new ArrayList<>(Arrays.asList(events));
    }

}
