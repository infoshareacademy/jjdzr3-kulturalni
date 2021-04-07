package com.infoshareacademy;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infoshareacademy.eventsEntities.Event;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JsonParser {

    public List<Event>  parseJsonToObject() throws IOException {
        Path path = Paths.get("C:\\Users\\Ilya\\kulturalni\\src\\main\\resources\\file.json");
        File file = path.toFile();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        List<Event> resultList = objectMapper.reader().forType(new TypeReference<List<Event>>(){}).readValue(file);
        return resultList;
    }
}
