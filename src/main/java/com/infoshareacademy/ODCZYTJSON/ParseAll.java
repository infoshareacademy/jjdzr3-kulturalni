package com.infoshareacademy.ODCZYTJSON;

import com.google.gson.Gson;

import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class ParseAll {

    public void parse() {

        Gson gson = new Gson();

        try {
            FileReader file = new FileReader("data.json");
            JsonReader reader = new JsonReader(file);
            szablonJSON[] data1 = gson.fromJson(reader, szablonJSON[].class);
            List<szablonJSON> data2 = Arrays.asList(data1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
