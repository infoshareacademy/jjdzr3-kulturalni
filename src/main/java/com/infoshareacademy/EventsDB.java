package com.infoshareacademy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.google.gson.Gson;
import com.infoshareacademy.DomainData.*;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

    public void displaySingleEvent(Integer ID) {
        try {
            if (isEvent(ID)) {
                for (Event event : eventsDB) {
                    System.out.println();
                    System.out.println("ID wydarzenia " + ID);
                    System.out.println("Nazwa wydarzenia: " + event.getEventJson().getName());
                    System.out.println("Organizator: " + event.getEventJson().getOrganizer().getDesignation());

                    if (event.getEventJson().getActive() == 1) {
                        System.out.println("Wydarzenie jest aktualne.");
                    } else
                        System.out.println("Wydarzenie jest nieaktualne.");

                    System.out.println("Data rozpoczęcia: " + event.getEventJson().getStartDate());
                    System.out.println("Data zakończenia: " + event.getEventJson().getEndDate());
                    System.out.println("Opis: " + event.getEventJson().getDescShort());
                    break;
                }
            } else System.out.println("Nie ma wydarzenia o takim numerze");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nie ma wydarzenia o takim numerze");
        }
    }

    public boolean isEvent(Integer ID) {
        for (int i = 0; i < eventsDB.size(); i++) {
            if (ID.equals(eventsDB.get(i).getEventJson().getId())) {
                return true;
            }
        }
        return false;
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


    public boolean setFilterByDate(String[] args) {
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
            return true;
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


    public void sortByID(String direction, String key) {
        sortByConfiguration(direction, key);
        setSortParameterID();
        Collections.sort(eventsDB);
    }

    public void sortByOrganizer(String direction, String key) {
        sortByConfiguration(direction, key);
        setSortParameterName();
        Collections.sort(eventsDB);
    }

    public void sortByDate(String direction, String key) {
        sortByConfiguration(direction, key);
        setSortParameterDate();
        Collections.sort(eventsDB);
    }


    public void sortByConfiguration(String direction, String key) {
        if (key.equals("ID")) {
            setSortParameterID();
            if (direction.equals("ASC")) {
                Collections.sort(eventsDB);
            } else if (direction.equals("DSC")) {
                Collections.sort(eventsDB, Collections.reverseOrder());
            } else {
                Collections.sort(eventsDB);
            }
        } else if (key.equals("NAME")) {
            setSortParameterName();
            if (direction.equals("ASC")) {
                Collections.sort(eventsDB);
            } else if (direction.equals("DSC")) {
                Collections.sort(eventsDB, Collections.reverseOrder());
            } else {
                Collections.sort(eventsDB);
            }
        } else if (key.equals("DATE")) {
            setSortParameterDate();
            if (direction.equals("ASC")) {
                Collections.sort(eventsDB);
            } else if (direction.equals("DSC")) {
                Collections.sort(eventsDB, Collections.reverseOrder());
            } else {
                Collections.sort(eventsDB);
            }
        } else {
            if (direction.equals("ASC")) {
                Collections.sort(eventsDB);
            } else if (direction.equals("DSC")) {
                Collections.sort(eventsDB, Collections.reverseOrder());
            } else {
                Collections.sort(eventsDB);
            }
        }
    }

    public void setSortParameterID() {
        for (Event event : eventsDB) {
            Integer id = event.getEventJson().getId();
            event.setSortParameter(id.toString());
        }
    }

    public void setSortParameterName() {
        for (Event event : eventsDB) {
            String name = event.getEventJson().getName();
            event.setSortParameter(name);
        }
    }

    public void setSortParameterDate() {
        for (Event event : eventsDB) {
            String[] date = event.getEventJson().getStartDate().split("T");
            event.setSortParameter(date[0]);
        }
    }

    public String searchElement(String key) {
        //TODO compareToIgnoreCase // Pattern threeChars = Pattern.compile("([a-zA-Z0-9]){3,}"); ???
        int charCount = 3;
        String searchElement;
        System.out.print("Wprowadź co najmniej 3 znaki: ");
        do {
            Scanner scanner = new Scanner(System.in);
            searchElement = scanner.nextLine();
            charCount = searchElement.length();

            if (charCount < 3) {
                System.out.print("Wprowadź co najmniej 3 znaki: ");
            }
        } while (charCount < 3);

        switch (key) {
            case "ID":
                for (int i = 0; i < eventsDB.size(); i++) {
                    if (eventsDB.get(i).getEventJson().getId().toString().startsWith(searchElement)) {
                        eventsDB.get(i).setDisplay(1);
                    }
                }
            case "NAME":
                for (int i = 0; i < eventsDB.size(); i++) {
                    if (eventsDB.get(i).getEventJson().getName().toUpperCase().startsWith(searchElement.toUpperCase())) {
                        eventsDB.get(i).setDisplay(1);
                    }
                }
            case "PLACE":
                for (int i = 0; i < eventsDB.size(); i++) {
                    if (eventsDB.get(i).getEventJson().getPlace().getName().toUpperCase().startsWith(searchElement.toUpperCase())) {
                        eventsDB.get(i).setDisplay(1);
                    }
                }
            case "ORGANIZER":
                for (int i = 0; i < eventsDB.size(); i++) {
                    if (eventsDB.get(i).getEventJson().getOrganizer().getDesignation().toUpperCase().startsWith(searchElement.toUpperCase())) {
                        eventsDB.get(i).setDisplay(1);
                    }
                }
        }
        return searchElement;
    }

    public void addEvent() {
        createEvent();

    }

    public void createEvent() {
        System.out.println("Enter ID: ");
        Integer id = getUserInputInt();
        System.out.println("Enter name: ");
        String name = getUserInputStr();
        System.out.println("Enter start date");
        String startDate = getUserInputStr();
        System.out.println("Enter end date");
        String endDate = getUserInputStr();
        System.out.println("Enter organizer");
        System.out.println("organizer id: ");
        Integer orgId = getUserInputInt();
        System.out.println("organizer designation: ");
        String designation = getUserInputStr();
        System.out.println("Enter place");
        System.out.println("place id");
        Integer placeId = getUserInputInt();
        System.out.println("place subName");
        String placeSubName = getUserInputStr();
        System.out.println("place Name");
        String placeName = getUserInputStr();
        System.out.println("Enter urls");
        String urls = getUserInputStr();
        System.out.println("Enter descLong");
        String descLong = getUserInputStr();
        System.out.println("Enter attachments");
        String attachments = getUserInputStr();
        System.out.println("Enter categoryId");
        Integer categoryId = getUserInputInt();
        System.out.println("Enter active");
        Integer active = getUserInputInt();
        System.out.println("Enter descShort");
        String descShort = getUserInputStr();
        System.out.println("Enter ticket");
        String type = getUserInputStr();
        Place place = new Place(placeId, placeSubName, placeName);
        Organizer organizer = new Organizer(orgId, designation);
        URLs urLs = new URLs(urls);
        Tickets ticket = new Tickets(type);
        Attachments attachment = new Attachments(attachments);
        Event event = new Event(id, name, startDate, endDate, organizer, place, urLs, attachment, descLong, categoryId, active, descShort, ticket);
        eventsDB.add(event);
    }


    public boolean removeEvent(Integer id) {
        for (Event event : eventsDB) {
            if (id.equals(event.getEventJson().getId())) {
                eventsDB.remove(event);
                System.out.println("Event has been deleted");
                return true;
            }
        }
        System.out.println("Failed! Please try again");
        return false;
    }

    public boolean editEvent(Integer eventId) {
        for (Event event : eventsDB) {
            if ((event.getEventJson().getId().equals(eventId))) {
                System.out.println("Please enter new name. To go next hit Enter ");
                Scanner scanName = new Scanner(System.in);
                String name = scanName.nextLine();
                if (!name.isEmpty()) {
                    event.getEventJson().setName(name);
                }
                System.out.println("Please enter new place name. To go next hit Enter ");
                Scanner scanPlace = new Scanner(System.in);
                String placeName = scanPlace.nextLine();
                if (!placeName.isEmpty()) {
                    Place place = event.getEventJson().getPlace();
                    place.setName(placeName);
                }
                System.out.println("Please enter new  place subname. To go next hit Enter ");
                Scanner scanSubname = new Scanner(System.in);
                String subname = scanSubname.nextLine();
                if (!subname.isEmpty()) {
                    Place place = event.getEventJson().getPlace();
                    place.setSubname(subname);
                }
                System.out.println("Please enter new start date. To go next hit Enter ");
                Scanner scanStartDate = new Scanner(System.in);
                String startDate = scanStartDate.nextLine();
                if (!startDate.isEmpty()) {
                    event.getEventJson().setStartDate(startDate);
                }
                System.out.println("Please enter new end date. To go next hit Enter ");
                Scanner scanEndDate = new Scanner(System.in);
                String endDate = scanEndDate.nextLine();
                if (!endDate.isEmpty()) {
                    event.getEventJson().setEndDate(endDate);
                }
                System.out.println("Please enter new organizer designation. To go next hit Enter ");
                Scanner scanOrganizer = new Scanner(System.in);
                String organizer = scanOrganizer.nextLine();
                if (!organizer.isEmpty()) {
                    Organizer org = event.getEventJson().getOrganizer();
                    org.setDesignation(organizer);
                }
                System.out.println("Please enter new event URL. To go next hit Enter ");
                Scanner scanUrlWww = new Scanner(System.in);
                String urlW = scanUrlWww.nextLine();
                if (!urlW.isEmpty()) {
                    URLs eventURL = event.getEventJson().getUrls();
                    eventURL.setWww(urlW);
                }
                System.out.println("Please enter new event URL for tickets. To go next hit Enter ");
                Scanner scanUrlTicket = new Scanner(System.in);
                String urlT = scanUrlTicket.nextLine();
                if (!urlT.isEmpty()) {
                    Tickets eventURL = event.getEventJson().getTickets();
                    eventURL.setType(urlT);
                }
                System.out.println("Please enter new category ID. To go next hit Enter ");
                Scanner scanCat = new Scanner(System.in);
                Integer cat = scanCat.nextInt();
                if (!cat.equals(null)) {
                    event.getEventJson().setCategoryId(cat);
                }
                System.out.println("Please enter 'yes' if event is active. To go next hit Enter ");
                Scanner scanActive = new Scanner(System.in);
                String active = scanActive.nextLine();
                if (active.equals("yes")) {
                    event.getEventJson().setActive(1);
                } else {
                    event.getEventJson().setActive(0);
                }
                System.out.println("Please enter new ticket type. To go next hit Enter ");
                Scanner scanTicketType = new Scanner(System.in);
                String ticketType = scanTicketType.nextLine();
                if (!ticketType.isEmpty()) {
                    Tickets ticket = event.getEventJson().getTickets();
                    ticket.setType(ticketType);
                }
                System.out.println("Please enter new attachment. To go next hit Enter ");
                Scanner scanAttachment = new Scanner(System.in);
                String attach = scanAttachment.nextLine();
                if (!attach.isEmpty()) {
                    for (Attachments attachment : event.getEventJson().getAttachments()) {
                        attachment.setAttachments(attachment);
                    }
                }
                System.out.println("Event has been updated \n" + event.toString());
                return true;
            }

        }
        return false;
    }

    public static String getUserInputStr() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().trim();
    }

    public static Integer getUserInputInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
