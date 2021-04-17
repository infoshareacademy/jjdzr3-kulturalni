package com.infoshareacademy;

import com.google.gson.Gson;
import com.infoshareacademy.DomainData.EventJson;
import org.apache.commons.lang3.StringUtils;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



public class EventsDB {
    private List<Event> eventsDB = new ArrayList<>();
    private Path path = Paths.get("src", "main", "resources", "data.json");


    public void readEvent() {
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader(String.valueOf(path));
            EventJson[] eventJson = gson.fromJson(reader, EventJson[].class);

            for (EventJson json : eventJson) {
                Event event = new Event(json);
                eventsDB.add(event);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Błąd odczytu pliku *.json.");
        }
    }

    public void displaySingleEvent(Integer id) {
    }

    public void displayEvents(String type) {
        StringBuilder naglowek = new StringBuilder();

        String szerokoscTabeli = "---------------------------------------------------------------------------------------------------------";
        ///ustawiona szerokość tabeli to 105 znaków
        String nazwaTabeli = "WYDARZENIA";
        String naglowekSeparator = "   ";
        String separator = " | ";
        String odstepId = "%-5.5s";
        String odstepNazwa = "%-35.35s";
        String odstepTermin = "%-25.25s";
        String odstepMiejsce = "%-27.27s";

//Buduje stringa składającego się na nagłówek tabeli
        naglowek.append("| " + String.format(odstepId, "ID") + naglowekSeparator);

        //--zmienia format wyświetlania daty (skraca) i zwiększa pole nazwy
        if (type.equals("1")) {
            odstepNazwa = "%-50.50s";
            odstepTermin = "%-10.10s";
            naglowek.append(String.format(odstepNazwa, "NAZWA WYDARZENIA") + naglowekSeparator);
            naglowek.append(String.format(odstepTermin, "TERMIN") + naglowekSeparator);
        } else {
            naglowek.append(String.format(odstepNazwa, "NAZWA WYDARZENIA") + naglowekSeparator);
            naglowek.append(String.format(odstepTermin, "TERMIN") + naglowekSeparator);
        }
        naglowek.append(String.format(odstepMiejsce, "MIEJSCE") + separator);

        //SZABLON TABELI
        System.out.println(szerokoscTabeli);
        //WYŚWIETLA NAZWĘ TABELI NA ŚRODKU
        System.out.println(String.format("|" + "%-" + (szerokoscTabeli.length() - 2) + "s", String.format("%" +
                (nazwaTabeli.length() + (szerokoscTabeli.length() - nazwaTabeli.length()) / 2) + "s", nazwaTabeli)) + "|");
        System.out.println(szerokoscTabeli);
        System.out.println(naglowek);
        System.out.println(szerokoscTabeli);

        //UZUPEŁNIANIE TABELI WYDARZENIAMI
        for (Event event : eventsDB) {

            if (event.getDisplay() == 1) {

                StringBuilder tabelaWydarzenia = new StringBuilder();

                /*  !PRZYKŁAD!
                String.format("%-40.20s", eventsDB.get(i).getEventJson().getPlace().getName()));
                "%-40.20s"
                %   oznacza, że wynik jest literałem
                -   flaga która oznacza wyrównanie wyniku do lewej
                40  oznacza maksymalną ilość (szerokość) wyświetlanych znaków (tu 40)
                .20 oznacza precyzję, czyli po ilu znakach dane wejsciowe zostana uciete (tu 20 znakow)
                s   oznacza format formatowanego elementu
                */

                tabelaWydarzenia.append("| " + String.format(odstepId, event.getEventJson().getId()) + separator);
                tabelaWydarzenia.append(String.format(odstepNazwa, event.getEventJson().getName()) + separator);
                tabelaWydarzenia.append(String.format(odstepTermin, event.getEventJson().getStartDate()) + separator);
                tabelaWydarzenia.append(String.format(odstepMiejsce, event.getEventJson().getPlace().getName()) + separator);
                System.out.println(tabelaWydarzenia);
            }
        }
        System.out.println(szerokoscTabeli);
        System.out.println("Ilość wydarzeń: " + eventsDB.size());
    }

    public void setAllEventsToDisplay() {
        for (Event event : eventsDB) {
            event.setDisplay(1);
        }
    }

    public void setNoneEventsToDisplay() {
        for (Event event : eventsDB) {
            event.setDisplay(0);
        }
    }



    public void setFilterByName(String[] args) {
        setNoneEventsToDisplay();
        String filterString = args[2];

        if (args.length > 3) {
            for (int i = 3; i < args.length; i++) {
                filterString = filterString + " " + args[i];
            }
            filterString = filterString.substring(2, filterString.length() - 1);
        }

        for (int i = 0; i < eventsDB.size(); i++) {
            if (eventsDB.get(i).getEventJson().getOrganizer().getDesignation().equals(filterString)) {
                eventsDB.get(i).setDisplay(1);
            }
        }
    }


    public boolean setFilterByDate(String [] args) {
        String startingTime;
        String endingTime;

        setNoneEventsToDisplay();

        if (args.length > 3) {
            startingTime = args[2].substring(1);
            endingTime = args[3].substring(1);
        } else {
            startingTime = args[2].substring(1);
            endingTime = "2099-12-31";
        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateValidatorUsingLocalDate dateValidatorUsingLocalDate = new DateValidatorUsingLocalDate(dateTimeFormatter);

        if (dateValidatorUsingLocalDate.isValid(startingTime) && dateValidatorUsingLocalDate.isValid(endingTime)) {
            LocalDate startDateLocalDate = LocalDate.parse(startingTime);
            LocalDate endDateLocalDate = LocalDate.parse(endingTime);
            LocalDate eventDate;
            if (startDateLocalDate.isAfter(endDateLocalDate)) {
                startDateLocalDate = LocalDate.parse(endingTime);
                endDateLocalDate = LocalDate.parse(startingTime);
            }

            for (int i = 0; i < eventsDB.size(); i++) {
                String dateString = eventsDB.get(i).getEventJson().getStartDate();
                String[] arrOfStr = dateString.split("T");
                eventDate = LocalDate.parse(arrOfStr[0]);

                if (startDateLocalDate.equals(endDateLocalDate)) {
                    if (arrOfStr[0].equals(endDateLocalDate)) {
                        eventsDB.get(i).setDisplay(1);
                    }
                } else {
                    if (eventDate.isEqual(startDateLocalDate) || eventDate.isEqual(endDateLocalDate) || (eventDate.isAfter(startDateLocalDate) && eventDate.isBefore(endDateLocalDate))) {
                        eventsDB.get(i).setDisplay(1);
                    }
                }
            }
            return  true;
        } else {
            System.out.println("Podaj datę we właściwym formacie.");
            return false;
        }
    }


    public void setAllFavouritiesToDisplay(Favourities favourities) {
        Integer id;

        for (int i = 0; i < eventsDB.size(); i++) {
            id = eventsDB.get(i).getEventJson().getId();

            if (favourities.isFavourite(id)) {
                eventsDB.get(i).setDisplay(1);
            } else {
                eventsDB.get(i).setDisplay(0);
            }
        }
    }










}
