package com.infoshareacademy.readJSON;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ParseJsonFile {


    ////////////////////////////////PARSOWANIE PLIKU Z PODANEJ ŚCIEŻKI/////////////////////////
    ///ŚCIEŻKA JEST INNA U KAŻDEGO - JESZCZE NIE ROZKMINIŁEM UNIWERSALNEGO ROZWIĄZANIA


    public void displayAllEvents() {

        Gson gson = new Gson();

        try {
            FileReader file = new FileReader("C:\\Users\\macwl\\IdeaProjects\\ISE\\src\\main\\resources\\data.json");
            JsonReader reader = new JsonReader(file);

            //odczytanie stringa z pliku json i umieszczenie każdego z obiektów w macierzy
            jsonObjectTemplate[] data1 = gson.fromJson(reader, jsonObjectTemplate[].class);

            //przekształcenie macierzy w Kolekcję List
            List<jsonObjectTemplate> data2 = Arrays.asList(data1);

            for (int i = 0; i < data2.size(); i++) {
                int eventNr = i + 1;
                System.out.println();
                System.out.println("Wydarzenie nr " + eventNr);
                System.out.println("Nazwa wydarzenia: " + data2.get(i).getName());
                System.out.println("Organizator: " + data2.get(i).getOrganizer().getDesignation());

                //niektóre z wydarzeń posiadają w nazwie "ZAWIESZONE"
                //Można przemyslec czy powinno miec to wplyw na parametr ACTIVE wydarzenia

                if (data2.get(i).getActive() == 1) {
                    System.out.println("Wydarzenie jest aktualne.");
                } else
                    System.out.println("Wydarzenie jest nieaktualne.");

                System.out.println("Data rozpoczęcia: " + data2.get(i).getStartDate());
                System.out.println("Data zakończenia: " + data2.get(i).getEndDate());
                System.out.println("Krótki opis: " + data2.get(i).getDescShort());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Nie znaleziono pliku, sprawdź charset, lub poprawność ścieżki");
        }

    }

}
