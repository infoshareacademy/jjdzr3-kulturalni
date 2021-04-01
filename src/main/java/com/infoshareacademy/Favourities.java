package com.infoshareacademy;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Favourities {
    private List<Integer> favouritiesDB = new ArrayList<>();
    private Path path = Paths.get("src", "main", "resources", "favourities.json");

    public void readFavourities () {
        String readString;
        Gson gson = new Gson();

        try {
            readString = Files.readString(path);
            readString = readString.replace("[", "");
            readString = readString.replace("]", "");

            String[] favour = readString.split(",");

            if (favour[0].equals("")) {
                favour[0] = "0";
            }

            for (int i = 0; i < favour.length; i++) {
                favouritiesDB.add(Integer.parseInt(favour[i]));
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku .json.");
            createFavourities();
        }
    }

    private void createFavourities() {
        try {
            Files.createFile(path);
        } catch (IOException e) {
            System.out.println("Nie można utworzyć pliku.");
        }

        Integer number = 100;
        favouritiesDB.add(0);

        Integer[] favourities = new Integer[1];
        favourities[0] = favouritiesDB.get(0);
        System.out.println(favourities[0]);

        Gson gson = new Gson();
        String jsonString = gson.toJson(favourities[0]);

        try {
            Files.writeString(path, jsonString);
        } catch (IOException e) {
            System.out.println("Nie można zapisać pliku.");
        }
    }


    public void saveFavourities() {
        Gson gson = new Gson();
        String jsonString = gson.toJson(favouritiesDB);

        try {
            Files.writeString(path, jsonString);
        } catch (IOException e) {
            System.out.println("Nie można zapisać pliku.");
        }
    }

    public boolean isFavourite(Integer id) {
        System.out.println(favouritiesDB.contains(id));
        return favouritiesDB.contains(id);
    }

    public void addFavourite(Integer id) {
        favouritiesDB.add(id);
    }

    public void removeFavourite(Integer id) {
        while (isFavourite(id)) {
            Integer position = favouritiesDB.indexOf(id);
            System.out.println(position);
            favouritiesDB.remove((int) position);
        }
    }
}