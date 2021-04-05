package com.infoshareacademy.ODCZYTJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;

public class szablonJSON {

    private Place place;
    private String endDate;
    private String name;
    private URLs urls;
    private Attachments[] attachments;
    private Integer id;
    private String descLong;
    private Integer categoryId;
    private String startDate;
    private Organizer organizer;
    private Integer active;
    private String descShort;
    private Tickets tickets;

    ////////////////////////////////HASHCODE & EQUALS/////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof szablonJSON)) return false;
        szablonJSON szablonJSON = (szablonJSON) o;
        return Objects.equals(place, szablonJSON.place) && Objects.equals(endDate, szablonJSON.endDate) && Objects.equals(name, szablonJSON.name) && Objects.equals(urls, szablonJSON.urls) && Arrays.equals(attachments, szablonJSON.attachments) && Objects.equals(id, szablonJSON.id) && Objects.equals(descLong, szablonJSON.descLong) && Objects.equals(categoryId, szablonJSON.categoryId) && Objects.equals(startDate, szablonJSON.startDate) && Objects.equals(organizer, szablonJSON.organizer) && Objects.equals(active, szablonJSON.active) && Objects.equals(descShort, szablonJSON.descShort) && Objects.equals(tickets, szablonJSON.tickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, endDate, name, urls, attachments, id, descLong, categoryId, startDate, organizer, active, descShort, tickets);
    }

    ////////////////////////////////SETTERS & GETTERS/////////////////////////

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URLs getUrls() {
        return urls;
    }

    public void setUrls(URLs urls) {
        this.urls = urls;
    }

    public Attachments[] getAttachments() {
        return attachments;
    }

    public void setAttachments(Attachments[] attachments) {
        this.attachments = attachments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescLong() {
        return descLong;
    }

    public void setDescLong(String descLong) {
        this.descLong = descLong;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getDescShort() {
        return descShort;
    }

    public void setDescShort(String descShort) {
        this.descShort = descShort;
    }

    public Tickets getTickets() {
        return tickets;
    }

    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    ////////////////////////////////READ JSON/////////////////////////

    public static void readJSON() {

        GsonBuilder gsonBuilder = new GsonBuilder();

        String jsonStr = "{\"id\":74348,\"place\":{\"id\":7,\"subname\":\"Scena Muzyczna\",\"name\":\"Gdański Archipelag Kultury\"},\"endDate\":\"2021-03-22T04:05:00-05:00\",\"name\":\"Nowe zajęcia w Scenie Muzycznej - ZAPISZ SIĘ!\",\"urls\":{\"www\":\"http://scenamuzyczna.pl\"},\"attachments\":[{\"fileName\":\"http://gak.gda.pl/sites/default/files/styles/big_1000w/public/Galeria/plakatScenapng.png\"}],\"descLong\":\"<p><b>JĘZYK CHIŃSKI, JOGA, POPPING CZY PLAN FILMOWY – RÓŻNORODNE ZAJĘCIA STAŁE W SCENIE MUZYCZNEJ W ROKU SZKOLNYM 2020/21. W OFERCIE AŻ 18 PROPOZYCJI!</b></p><p><p><b>Tradycyjnie, początkiem października, w Scenie Muzycznej ruszyły zapisy na zajęcia stałe, które będą odbywać się do końca czerwca 2021 r. W ofercie naszej placówki znajdują się m.in. zajęcia językowe (języki: chiński, hiszpański, rosyjski), ale także kreatywne: związane z fotografią, teatrem, filmem, grą na bębnach czy robótkami ręcznymi. Aktywnym, tak jak w poprzednich latach, proponujemy taniec robotów „popping” czy zumbę, ale także jogę, która jest jedną z tegorocznych nowości. W tym roku organizowane będą także dedykowane zajęcia dla dzieci i/lub seniorów (m.in. zabawy z angielskim, warsztaty sensoryczno-plastyczne, klub seniora). Wisienką na tym wyjątkowo obfitym torcie są zajęcia indywidualne – z nauki śpiewu oraz gry na gitarze basowej lub saksofonie. Obiecujemy, że każdy znajdzie coś dla siebie! Wszystkie zajęcia realizowane są z zachowaniem reżimu sanitarnego.</b></p><p><b>Wracają sprawdzone kulturalne hity</b></p><p>- Cześć zajęć to kontynuacja ubiegłorocznych hitów, ale lwią część oferty stanowią kulturalne nowości, które pomogą nam dotrzeć do szerszego grona odbiorców  – mówi Piotr Chrzanowski, kierownik Sceny Muzycznej. Do placówki po wakacyjnej przerwie wróci m.in. język hiszpański, który będzie odbywać się w poniedziałki (180 zł/10 zajęć, dwie grupy podstawowe oraz jedna zaawansowana, co godzinę, od 17:30 do 20:30); zumba, na której będzie można ćwiczyć w poniedziałki i środy w godzinach 19:30-20:30 (20 zł/1 zajęcia, 60 zł/4 zajęcia, 90 zł/6 zajęć) oraz zajęcia fotograficzne, prowadzone przez Artura Makowskiego, czynnego fotografa. Ostatnie z proponowanych warsztatów będą odbywać się w środy (grupa początkująca) oraz w czwartki (grupa zaawansowana) w godzinach 18:00 – 19:30. Koszt to 120 zł za miesiąc. Niezmiennie, w stosunku do poprzedniego roku, funkcjonować będzie także Klub Seniora (poniedziałki, 14:00-16:00).</p><p>Nie zmieni się także oferta zajęć indywidualnych: wciąż będzie można uczęszczać na zajęcia wokalne do Agaty Walczak – wokalistki musicalowej, występującej m.in. w Teatrze Muzycznym w Gdyni czy  Scenie Relax w Warszawie; na saksofon do Marcina Janka – wybitnego gdańskiego saksofonisty; oraz na gitarę basową do Johna Leysnera – muzyka z Surinamu, który występował na największych światowych scenach. Wszystkie zajęcia indywidualne to koszt 100 zł za godzinę, termin spotkań ustalany jest indywidualnie z instruktorem.</p><p>ak jak od niemal 10 lat, w Scenie Muzycznej odbywać się będą także zajęcia z poppingu, które prowadzone są przez Adriana Lipskee’go Lipińskiego. Instruktor szerszej publiczności dał się poznać jako finalista pierwszej edycji programu telewizyjnego TVN Mam talent. Dla tych, którzy jeszcze nie wiedzą, podpowiadamy: popping to styl taneczny pochodzący z USA, który polega on na szybkim spinaniu i rozluźnianiu mięśni (tzw. pop) w rytm muzyki, w połączeniu z różnymi pozami i ruchami. - Popping jednak to nie tylko nauka ruchów, to również wiedza, historia, styl życia, forma wyrażania siebie, wzbudzająca duże zainteresowanie innych. Zajęcia angażują zarówno wyobraźnię, jak i emocje. Rozbudzają twórczy potencjał i rozwijają umiejętności artystyczne i społeczne uczestników – mówi Adrian Lipiński, instruktor poppingu. Zajęcia będą odbywać się dwa razy w tygodniu, we wtorki i czwartki w godzinach: 16:30 – 17:30 – grupa podstawowa, 17:30 – 18:30 – grupa zaawansowana.</p><p><b>Joga czy j. chiński… nowości nadchodzą!</b></p><p>W naszej placówce nie zabraknie również nowości. Do oferty zajęć ruchowych dołączy joga, która będzie odbywać się w poniedziałki i środy w godzinach 18:00-19:15. Cena na 4 wejścia to 100 zł (ważne miesiąc), 10 wejść to koszt 200 zł (ważne 2 miesiące), a w przypadku zajęć pojedynczych, cena jednego wejścia to 28 zł. W środę rano (9:00-10:15) specjalna wersja zajęć (nie tylko) dla seniorów, na którym ćwiczenia skupione będą wokół dbania o zdrowy kręgosłup.  </p><p>Naszych odbiorców w tym roku zaprosimy także na język chiński. Zajęcia będą odbywać się we wtorki, a 10 zajęć tego języka to koszt tylko 180 zł. Uczestnicy zajęć nauczą się podstawowych zwrotów umożliwiających swobodną komunikację na wybrane tematy, ale także poznają tajniki poprawnej wymowy oraz zapisu fonetycznego głosek w j. chińskim. Zajęcia poprowadzi Martyna Szymaniak, absolwentka gdańskiej sinologii.</p><p>Z kolei kolejną językową nowość, 10 lekcyjny kurs języka rosyjskiego, poprowadzi Anna Łukiewska – tzw. „native bilingwalny”, czyli osoba posługująca się językiem na równi z językiem polskim. Na kursie uczestnicy nauczą się najważniejszych zwrotów, poznają tajniki pisania cyrylicą oraz dowiedzą się podstawowych informacji na temat kultury Rosji. Zajęcia będą odbywały się w środy w godzinach 18:15-19:15. Koszt całego kursu to 350 zł.  </p><p><b>Uderzaj w bębny, rób origami, szyj na szydełku</b></p><p>Do Sceny Muzycznej, po wielu latach przerwy, powraca grupowa gra na bębnach, prowadzona przez Annę „Maszkę” Kwidzińską, która od 16 lat jest instruktorką gry na instrumentach afrykańskich i brazylijskich. Anna swoje umiejętności szlifowała, gdy mieszkała w Kenii, Tanzanii i na Zanzibarze. U Maszki będzie można nauczyć się podstawowych uderzeń oraz techniki gry na bębnie djembe i dun dun, ale również rytmów i kompozycji powstałych w Ghanie i Senegalu. W zajęciach bębniarskich może wziąć udział każdy, także osoby, które nie miały dotąd żadnego kontaktu z grą na bębnach. Zajęcia odbywają się we wtorki w godzinach 18:30-20:30. Koszt to 40 zł (1 zajęcia), karnet: 150 zł (miesiąc) lub  400 zł (kwartał).</p><p>Pozostając przy kreatywnym tworzeniu, zapraszamy na oryginalny kurs robótek ręcznych kryjący się pod nazwą ,,Szydełka, druty, origami\\\". Podczas zajęć uczestnicy będą wykonywać różnorodne przedmioty za pomocą szydełka lub/oraz drutów, ucząc się ciekawych technik twórczych. W programie także tworzenie origami oraz origami modułowych – czyli figur powstających w wyniku połączenia powstałych wcześniej origami. Zajęcia będą odbywać się we wtorki w godzinach 18:00-19:00, ich koszt to 49 zł miesięcznie. Materiały na zajęcia częściowo zapewni Scena Muzyczna, inne należy przynosić indywidualnie. Pełna lista potrzebnych przedmiotów zostanie podana na pierwszych zajęciach. Aktualnie trwają zapisy, kurs nie odbywa się.</p><p><b>Jak napisać scenariusz filmowy? Jakie tajniki kryje plan filmowy? Mam 40 lat i chcę zagrać na scenie!</b></p><p>Mamy odpowiedź także na wszystkie potrzeby dotyczące twórczego działania, związanego z teatrem i filmem. Nasze zajęcia ,,plan filmowy: scenariusz, realizacja, akcja\\\" prowadzone przez Jerzego Wójcickiego, będą składać się z trzech modułów: scenopisarstwa, teorii kinematografii i pracy na planie filmowym. Podczas zajęć uczestnicy będą szlifować warsztat pod kątem tworzenia scenariusza filmowego m.in poprzez naukę pisania dialogów, budowania postaci oraz umiejętnego wplatania zwrotów akcji. Uczestnicy będą omawiać także konkretne filmy oraz poszczególne sceny, zwracając uwagę na scenariusz, montaż i zdjęcia. Poznają także tajniki pracy na planie filmowym, zyskując praktyczną wiedzę o sztuce operatorskiej, oświetleniu oraz montażu. Zajęcia poprowadzi Jerzy Wójcicki - autor poszczególnych odcinków seriali realizowanych przez Telewizję Polsat S.A. Gdy zostanie zebrana grupa, zajęcia będą odbywać się czwartki w godzinach 18:00-20:00. Koszt wejściówki to 150 zł za miesiąc.</p><p>Nasza aktorska propozycja nie do odrzucenia, a także tegoroczna nowość dla osób 40+ to Teatr Amatorski. Jest skierowana do osób, które zawsze chciały stanąć na scenie, ale ich drogi z teatrem się rozeszły. Uczestnicy Teatru Amatorskiego sami wybiorą nazwę swojej formacji, wezmą udział w wielu warsztatach (m.in pracy nad głosem i ciałem, rozumienia tekstu, śpiewu), a także praktycznie wykorzystają nabyte umiejętności we wspólnie przygotowanym przedstawieniu. Zajęcia poprowadzi Michał Zasłona - instruktor i pedagog teatralny, posiadający wieloletnie doświadczenie w prowadzeniu amatorskich zespołów teatralnych dla młodzieży i dorosłych, m.in. w Mińsku Mazowieckim, Warszawie i Gdańsku.  Na Teatr zapraszamy amatorów, ale również tych, którzy już działają w kołach teatralnych na terenie Trójmiasta. Po zebraniu grupy, zajęcia będą odbywać się we wtorki w godzinach 18:30-20:30. Miesięczny koszt uczestnictwa to 90 zł.</p><p><b>I dzieci, i seniorzy znajdą u nas swoje miejsce</b></p><p>Język angielski kojarzy Ci się z nudnym powtarzaniem formułek i wkuwaniem słówek i chciałbyś to zmienić? Szukasz metody, by Twoje dziecko po lekcjach uczyło się języka w przyjemnej formie? Nigdy nie miałeś/aś czasu uczyć się angielskiego, więc podczas emerytury chciałbyś nadrobić swoje braki? Skorzystaj z naszej propozycji i przyjdź na nasze „zabawy z angielskim” prowadzone przez Annę Liedke - nauczyciela z ponad 30 letnim stażem, która w swoim CV posiada m.in renomowany londyński Trinity College. Pani Anna uwielbia w nauczanie wplatać humor i taniec, co z pewnością pokaże na swoich zajęciach. W ramach zajęć zostaną zorganizowane dwie grupy - dla seniorów (osób 60+) oraz dzieci (grupa wiekowa zostanie ustalona na podstawie zgłoszeń). Koszt miesięczny zajęć to 60 zł  dla seniorów i 120 zł dla dzieci. Zajęcia będą odbywać się w środy, w godzinach 15:00-16:00 dla seniorów i 16:00-17:00 dla dzieci.</p><p>Dzieci w wieku 3-6 lat zapraszamy również na zajęcia sensoryczno-plastyczne. Będą to cotygodniowe warsztaty prowadzone przez Justynę Majzel – menadżerkę kultury i pasjonatkę pracy z dziećmi. W ramach zajęć dzieci będą mogły rozwinąć swoją wyobraźnię i umiejętności manualne. Wsparty zostanie także rozwój kompetencji intra i interpersonalnych dziecka, a także jego kreatywność oraz twórcze myślenie. Maluszki poznają różną tematykę poprzez mnogość faktur, struktur, kolorów, zapachów i smaków. Dzięki wykorzystaniu mat, dzieci poznają także rożne ciekawostki ze świata: odkryją kontynenty, kraje, tradycje oraz cuda świata i kultury. Po zebraniu grupy zajęcia będą odbywać się w środy, w godzinach  17:00-18:00. Koszt karnetu na zajęcia to 120 zł miesięcznie.</p><p>Szczegółowe opisy wszystkich oferowanych przez nas zajęć można przeczytać na stronie: http://www.scenamuzyczna.pl/edukacja. Zapraszamy do zapisów! Obiecujemy, że każdy znajdzie u nas coś, co go zainteresuje, w dogodnym dla siebie terminie! W razie pytań lub zapisów prosimy o informację na adres info@scenamuzyczna.pl lub telefonicznie: +48515394696. Poniżej mała ściągawka - skrót wszystkich zajęć:</p><p> </p><p><b>Zajęcia w Scenie Muzycznej w roku szkolnym 2020/21:</b></p><p>✅ <b>Język chiński</b> | wtorki, g. 18:00-19:00 | 180 zł/10 zajęć (dorośli), 250 zł/10 zajęć (dzieci) | Martyna Szymaniak | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Język hiszpański</b> | poniedziałki, g. 17:30-18:30 (gr. zaawansowana) / 18:30-19:30 (gr. podstawowa) / 19:30-20:30 (gr. podstawowa) | 180 zł/10 zajęć | Katarzyna Niepokulczycka-Bień | Zajęcia rozpoczynają się 19.10.2020 r.!</p><p>✅ <b>Język rosyjski</b> | środy, g. 18:15-19:15 | 350 zł/10 zajęć | Anna Łukiewska | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Popping</b> | wtorki i czwartki, g. 16:30-17:30 (gr. podstawowa) / 17:30-18:30 (gr. zaawansowana) | 10 zł/zajęcia | Adrian Lipskee Lipiński | Zajęcia już trwają, zapraszamy do zapisów!</p><p>✅ <b>Zumba </b>| poniedziałki i środy, g. 19:30-20:30 | 20 zł (jedno wejście), karnety: 60 zł/ 4 wejścia, 90  zł/ 6 wejść | Natalia Marszałkowicz | Zajęcia rozpoczynają się 19.10.2020 r.!</p><p>✅ <b>Joga</b> | poniedziałki i środy, g. 18:00-19:15 / środy, g. 9:00-10:15 | 28 zł/1 wejście, karnety: 100 zł/4 wejścia, 200 zł/ 10 wejść | Małgorzata Olewniak | Zajęcia już trwają, zapraszamy do zapisów!</p><p>✅ <b>Zajęcia fotograficzne</b> | środy, g. 18:00-19:30 (gr. podstawowa), czwartki, g. 18:00-19:30 (gr. zaawansowana) | 120 zł / miesiąc | Artur Makowski | Uwaga: Zajęcia grupy podstawowej rozpoczynają się 21.10.2020 r.!</p><p>✅ <b>Plan filmowy: scenariusz, realizacja, akcja!</b> | czwartki, g. 18:00-20:00 | 150 zł/miesiąc | Jerzy Wójcicki | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Teatr Amatorski 40+</b> | wtorki, g. 18:30-20:30 | 90 zł / miesiąc | Michał Zasłona | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Warsztaty sensoryczno-plastyczne </b>| środy, g. 17:00-18:00 | 120 zł / miesiąc | Justyna Majzel | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Warsztaty robótek ręcznych: szydełka, druty, origami</b> | wtorki, g. 18:00-19:00 | 49 zł / miesiąc | Anetta Gorloff-Żukowska | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Gra na bębnach</b> | wtorki, g. 18:30-20:30 | 40 zł / 1 zajęcia, karnet: 150 zł / miesiąc, 400 zł / kwartał | Anna „Maszka” Kwidzińska | Zajęcia już trwają, zapraszamy do zapisów!</p><p>✅ <b>Zabawy z angielskim dla dzieci i seniorów</b> | środy, g. 15:00-16:00 (seniorzy) / środy, g. 16:00-17:00 (dzieci) | 60 zł / miesiąc (seniorzy), 120 zł / miesiąc (dzieci) | Anna Liedtke | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Klub Seniora</b> | poniedziałki, g. 14:00-16:00 | bezpłatne | Polski Związek Emerytów, Rencistów i Inwalidów, Koło 11 (oddział Gdańsk) | Uwaga: do czasu pozostawania Gdańska w strefie żółtej lub czerwonej, spotkania nie odbywają się.</p><p>✅ <b>Zajęcia z gry na saksofonie</b> | termin i godzina zajęć do ustalenia z instruktorem| 100 zł | Marcin Janek</p><p>✅ <b>Zajęcia z gry na gitarze basowej</b><b> </b>| termin i godzina zajęć do ustalenia z instruktorem| 100 zł | John Leysner</p><p>✅ <b>Indywidualna nauka śpiewu</b> | termin i godzina zajęć do ustalenia z instruktorem| 100 zł | Agata Walczak</p><p> </p></p>\",\"categoryId\":83,\"startDate\":\"2021-03-22T02:05:00-05:00\",\"organizer\":{\"id\":5,\"designation\":\"Gdański Archipelag Kultury\"},\"active\":1,\"descShort\":\"JĘZYK CHIŃSKI, JOGA, POPPING CZY PLAN FILMOWY – RÓŻNORODNE ZAJĘCIA STAŁE W SCENIE MUZYCZNEJ W ROKU SZKOLNYM 2020/21. W OFERCIE AŻ 18 PROPOZYCJI!Tradycyjnie, początkiem października, w Scenie Muzycznej ruszyły zapisy na zajęcia stałe, kt...\",\"tickets\":{\"type\":\"unknown\"}}";

        Gson gson = new Gson();

        szablonJSON szablon = gson.fromJson(jsonStr, szablonJSON.class);

    }

    public static void printJSON() {

        String available;

        Gson gsonRead = new Gson();
        String jsonStr = "{\"id\":74348,\"place\":{\"id\":7,\"subname\":\"Scena Muzyczna\",\"name\":\"Gdański Archipelag Kultury\"},\"endDate\":\"2021-03-22T04:05:00-05:00\",\"name\":\"Nowe zajęcia w Scenie Muzycznej - ZAPISZ SIĘ!\",\"urls\":{\"www\":\"http://scenamuzyczna.pl\"},\"attachments\":[{\"fileName\":\"http://gak.gda.pl/sites/default/files/styles/big_1000w/public/Galeria/plakatScenapng.png\"}],\"descLong\":\"<p><b>JĘZYK CHIŃSKI, JOGA, POPPING CZY PLAN FILMOWY – RÓŻNORODNE ZAJĘCIA STAŁE W SCENIE MUZYCZNEJ W ROKU SZKOLNYM 2020/21. W OFERCIE AŻ 18 PROPOZYCJI!</b></p><p><p><b>Tradycyjnie, początkiem października, w Scenie Muzycznej ruszyły zapisy na zajęcia stałe, które będą odbywać się do końca czerwca 2021 r. W ofercie naszej placówki znajdują się m.in. zajęcia językowe (języki: chiński, hiszpański, rosyjski), ale także kreatywne: związane z fotografią, teatrem, filmem, grą na bębnach czy robótkami ręcznymi. Aktywnym, tak jak w poprzednich latach, proponujemy taniec robotów „popping” czy zumbę, ale także jogę, która jest jedną z tegorocznych nowości. W tym roku organizowane będą także dedykowane zajęcia dla dzieci i/lub seniorów (m.in. zabawy z angielskim, warsztaty sensoryczno-plastyczne, klub seniora). Wisienką na tym wyjątkowo obfitym torcie są zajęcia indywidualne – z nauki śpiewu oraz gry na gitarze basowej lub saksofonie. Obiecujemy, że każdy znajdzie coś dla siebie! Wszystkie zajęcia realizowane są z zachowaniem reżimu sanitarnego.</b></p><p><b>Wracają sprawdzone kulturalne hity</b></p><p>- Cześć zajęć to kontynuacja ubiegłorocznych hitów, ale lwią część oferty stanowią kulturalne nowości, które pomogą nam dotrzeć do szerszego grona odbiorców  – mówi Piotr Chrzanowski, kierownik Sceny Muzycznej. Do placówki po wakacyjnej przerwie wróci m.in. język hiszpański, który będzie odbywać się w poniedziałki (180 zł/10 zajęć, dwie grupy podstawowe oraz jedna zaawansowana, co godzinę, od 17:30 do 20:30); zumba, na której będzie można ćwiczyć w poniedziałki i środy w godzinach 19:30-20:30 (20 zł/1 zajęcia, 60 zł/4 zajęcia, 90 zł/6 zajęć) oraz zajęcia fotograficzne, prowadzone przez Artura Makowskiego, czynnego fotografa. Ostatnie z proponowanych warsztatów będą odbywać się w środy (grupa początkująca) oraz w czwartki (grupa zaawansowana) w godzinach 18:00 – 19:30. Koszt to 120 zł za miesiąc. Niezmiennie, w stosunku do poprzedniego roku, funkcjonować będzie także Klub Seniora (poniedziałki, 14:00-16:00).</p><p>Nie zmieni się także oferta zajęć indywidualnych: wciąż będzie można uczęszczać na zajęcia wokalne do Agaty Walczak – wokalistki musicalowej, występującej m.in. w Teatrze Muzycznym w Gdyni czy  Scenie Relax w Warszawie; na saksofon do Marcina Janka – wybitnego gdańskiego saksofonisty; oraz na gitarę basową do Johna Leysnera – muzyka z Surinamu, który występował na największych światowych scenach. Wszystkie zajęcia indywidualne to koszt 100 zł za godzinę, termin spotkań ustalany jest indywidualnie z instruktorem.</p><p>ak jak od niemal 10 lat, w Scenie Muzycznej odbywać się będą także zajęcia z poppingu, które prowadzone są przez Adriana Lipskee’go Lipińskiego. Instruktor szerszej publiczności dał się poznać jako finalista pierwszej edycji programu telewizyjnego TVN Mam talent. Dla tych, którzy jeszcze nie wiedzą, podpowiadamy: popping to styl taneczny pochodzący z USA, który polega on na szybkim spinaniu i rozluźnianiu mięśni (tzw. pop) w rytm muzyki, w połączeniu z różnymi pozami i ruchami. - Popping jednak to nie tylko nauka ruchów, to również wiedza, historia, styl życia, forma wyrażania siebie, wzbudzająca duże zainteresowanie innych. Zajęcia angażują zarówno wyobraźnię, jak i emocje. Rozbudzają twórczy potencjał i rozwijają umiejętności artystyczne i społeczne uczestników – mówi Adrian Lipiński, instruktor poppingu. Zajęcia będą odbywać się dwa razy w tygodniu, we wtorki i czwartki w godzinach: 16:30 – 17:30 – grupa podstawowa, 17:30 – 18:30 – grupa zaawansowana.</p><p><b>Joga czy j. chiński… nowości nadchodzą!</b></p><p>W naszej placówce nie zabraknie również nowości. Do oferty zajęć ruchowych dołączy joga, która będzie odbywać się w poniedziałki i środy w godzinach 18:00-19:15. Cena na 4 wejścia to 100 zł (ważne miesiąc), 10 wejść to koszt 200 zł (ważne 2 miesiące), a w przypadku zajęć pojedynczych, cena jednego wejścia to 28 zł. W środę rano (9:00-10:15) specjalna wersja zajęć (nie tylko) dla seniorów, na którym ćwiczenia skupione będą wokół dbania o zdrowy kręgosłup.  </p><p>Naszych odbiorców w tym roku zaprosimy także na język chiński. Zajęcia będą odbywać się we wtorki, a 10 zajęć tego języka to koszt tylko 180 zł. Uczestnicy zajęć nauczą się podstawowych zwrotów umożliwiających swobodną komunikację na wybrane tematy, ale także poznają tajniki poprawnej wymowy oraz zapisu fonetycznego głosek w j. chińskim. Zajęcia poprowadzi Martyna Szymaniak, absolwentka gdańskiej sinologii.</p><p>Z kolei kolejną językową nowość, 10 lekcyjny kurs języka rosyjskiego, poprowadzi Anna Łukiewska – tzw. „native bilingwalny”, czyli osoba posługująca się językiem na równi z językiem polskim. Na kursie uczestnicy nauczą się najważniejszych zwrotów, poznają tajniki pisania cyrylicą oraz dowiedzą się podstawowych informacji na temat kultury Rosji. Zajęcia będą odbywały się w środy w godzinach 18:15-19:15. Koszt całego kursu to 350 zł.  </p><p><b>Uderzaj w bębny, rób origami, szyj na szydełku</b></p><p>Do Sceny Muzycznej, po wielu latach przerwy, powraca grupowa gra na bębnach, prowadzona przez Annę „Maszkę” Kwidzińską, która od 16 lat jest instruktorką gry na instrumentach afrykańskich i brazylijskich. Anna swoje umiejętności szlifowała, gdy mieszkała w Kenii, Tanzanii i na Zanzibarze. U Maszki będzie można nauczyć się podstawowych uderzeń oraz techniki gry na bębnie djembe i dun dun, ale również rytmów i kompozycji powstałych w Ghanie i Senegalu. W zajęciach bębniarskich może wziąć udział każdy, także osoby, które nie miały dotąd żadnego kontaktu z grą na bębnach. Zajęcia odbywają się we wtorki w godzinach 18:30-20:30. Koszt to 40 zł (1 zajęcia), karnet: 150 zł (miesiąc) lub  400 zł (kwartał).</p><p>Pozostając przy kreatywnym tworzeniu, zapraszamy na oryginalny kurs robótek ręcznych kryjący się pod nazwą ,,Szydełka, druty, origami\\\". Podczas zajęć uczestnicy będą wykonywać różnorodne przedmioty za pomocą szydełka lub/oraz drutów, ucząc się ciekawych technik twórczych. W programie także tworzenie origami oraz origami modułowych – czyli figur powstających w wyniku połączenia powstałych wcześniej origami. Zajęcia będą odbywać się we wtorki w godzinach 18:00-19:00, ich koszt to 49 zł miesięcznie. Materiały na zajęcia częściowo zapewni Scena Muzyczna, inne należy przynosić indywidualnie. Pełna lista potrzebnych przedmiotów zostanie podana na pierwszych zajęciach. Aktualnie trwają zapisy, kurs nie odbywa się.</p><p><b>Jak napisać scenariusz filmowy? Jakie tajniki kryje plan filmowy? Mam 40 lat i chcę zagrać na scenie!</b></p><p>Mamy odpowiedź także na wszystkie potrzeby dotyczące twórczego działania, związanego z teatrem i filmem. Nasze zajęcia ,,plan filmowy: scenariusz, realizacja, akcja\\\" prowadzone przez Jerzego Wójcickiego, będą składać się z trzech modułów: scenopisarstwa, teorii kinematografii i pracy na planie filmowym. Podczas zajęć uczestnicy będą szlifować warsztat pod kątem tworzenia scenariusza filmowego m.in poprzez naukę pisania dialogów, budowania postaci oraz umiejętnego wplatania zwrotów akcji. Uczestnicy będą omawiać także konkretne filmy oraz poszczególne sceny, zwracając uwagę na scenariusz, montaż i zdjęcia. Poznają także tajniki pracy na planie filmowym, zyskując praktyczną wiedzę o sztuce operatorskiej, oświetleniu oraz montażu. Zajęcia poprowadzi Jerzy Wójcicki - autor poszczególnych odcinków seriali realizowanych przez Telewizję Polsat S.A. Gdy zostanie zebrana grupa, zajęcia będą odbywać się czwartki w godzinach 18:00-20:00. Koszt wejściówki to 150 zł za miesiąc.</p><p>Nasza aktorska propozycja nie do odrzucenia, a także tegoroczna nowość dla osób 40+ to Teatr Amatorski. Jest skierowana do osób, które zawsze chciały stanąć na scenie, ale ich drogi z teatrem się rozeszły. Uczestnicy Teatru Amatorskiego sami wybiorą nazwę swojej formacji, wezmą udział w wielu warsztatach (m.in pracy nad głosem i ciałem, rozumienia tekstu, śpiewu), a także praktycznie wykorzystają nabyte umiejętności we wspólnie przygotowanym przedstawieniu. Zajęcia poprowadzi Michał Zasłona - instruktor i pedagog teatralny, posiadający wieloletnie doświadczenie w prowadzeniu amatorskich zespołów teatralnych dla młodzieży i dorosłych, m.in. w Mińsku Mazowieckim, Warszawie i Gdańsku.  Na Teatr zapraszamy amatorów, ale również tych, którzy już działają w kołach teatralnych na terenie Trójmiasta. Po zebraniu grupy, zajęcia będą odbywać się we wtorki w godzinach 18:30-20:30. Miesięczny koszt uczestnictwa to 90 zł.</p><p><b>I dzieci, i seniorzy znajdą u nas swoje miejsce</b></p><p>Język angielski kojarzy Ci się z nudnym powtarzaniem formułek i wkuwaniem słówek i chciałbyś to zmienić? Szukasz metody, by Twoje dziecko po lekcjach uczyło się języka w przyjemnej formie? Nigdy nie miałeś/aś czasu uczyć się angielskiego, więc podczas emerytury chciałbyś nadrobić swoje braki? Skorzystaj z naszej propozycji i przyjdź na nasze „zabawy z angielskim” prowadzone przez Annę Liedke - nauczyciela z ponad 30 letnim stażem, która w swoim CV posiada m.in renomowany londyński Trinity College. Pani Anna uwielbia w nauczanie wplatać humor i taniec, co z pewnością pokaże na swoich zajęciach. W ramach zajęć zostaną zorganizowane dwie grupy - dla seniorów (osób 60+) oraz dzieci (grupa wiekowa zostanie ustalona na podstawie zgłoszeń). Koszt miesięczny zajęć to 60 zł  dla seniorów i 120 zł dla dzieci. Zajęcia będą odbywać się w środy, w godzinach 15:00-16:00 dla seniorów i 16:00-17:00 dla dzieci.</p><p>Dzieci w wieku 3-6 lat zapraszamy również na zajęcia sensoryczno-plastyczne. Będą to cotygodniowe warsztaty prowadzone przez Justynę Majzel – menadżerkę kultury i pasjonatkę pracy z dziećmi. W ramach zajęć dzieci będą mogły rozwinąć swoją wyobraźnię i umiejętności manualne. Wsparty zostanie także rozwój kompetencji intra i interpersonalnych dziecka, a także jego kreatywność oraz twórcze myślenie. Maluszki poznają różną tematykę poprzez mnogość faktur, struktur, kolorów, zapachów i smaków. Dzięki wykorzystaniu mat, dzieci poznają także rożne ciekawostki ze świata: odkryją kontynenty, kraje, tradycje oraz cuda świata i kultury. Po zebraniu grupy zajęcia będą odbywać się w środy, w godzinach  17:00-18:00. Koszt karnetu na zajęcia to 120 zł miesięcznie.</p><p>Szczegółowe opisy wszystkich oferowanych przez nas zajęć można przeczytać na stronie: http://www.scenamuzyczna.pl/edukacja. Zapraszamy do zapisów! Obiecujemy, że każdy znajdzie u nas coś, co go zainteresuje, w dogodnym dla siebie terminie! W razie pytań lub zapisów prosimy o informację na adres info@scenamuzyczna.pl lub telefonicznie: +48515394696. Poniżej mała ściągawka - skrót wszystkich zajęć:</p><p> </p><p><b>Zajęcia w Scenie Muzycznej w roku szkolnym 2020/21:</b></p><p>✅ <b>Język chiński</b> | wtorki, g. 18:00-19:00 | 180 zł/10 zajęć (dorośli), 250 zł/10 zajęć (dzieci) | Martyna Szymaniak | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Język hiszpański</b> | poniedziałki, g. 17:30-18:30 (gr. zaawansowana) / 18:30-19:30 (gr. podstawowa) / 19:30-20:30 (gr. podstawowa) | 180 zł/10 zajęć | Katarzyna Niepokulczycka-Bień | Zajęcia rozpoczynają się 19.10.2020 r.!</p><p>✅ <b>Język rosyjski</b> | środy, g. 18:15-19:15 | 350 zł/10 zajęć | Anna Łukiewska | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Popping</b> | wtorki i czwartki, g. 16:30-17:30 (gr. podstawowa) / 17:30-18:30 (gr. zaawansowana) | 10 zł/zajęcia | Adrian Lipskee Lipiński | Zajęcia już trwają, zapraszamy do zapisów!</p><p>✅ <b>Zumba </b>| poniedziałki i środy, g. 19:30-20:30 | 20 zł (jedno wejście), karnety: 60 zł/ 4 wejścia, 90  zł/ 6 wejść | Natalia Marszałkowicz | Zajęcia rozpoczynają się 19.10.2020 r.!</p><p>✅ <b>Joga</b> | poniedziałki i środy, g. 18:00-19:15 / środy, g. 9:00-10:15 | 28 zł/1 wejście, karnety: 100 zł/4 wejścia, 200 zł/ 10 wejść | Małgorzata Olewniak | Zajęcia już trwają, zapraszamy do zapisów!</p><p>✅ <b>Zajęcia fotograficzne</b> | środy, g. 18:00-19:30 (gr. podstawowa), czwartki, g. 18:00-19:30 (gr. zaawansowana) | 120 zł / miesiąc | Artur Makowski | Uwaga: Zajęcia grupy podstawowej rozpoczynają się 21.10.2020 r.!</p><p>✅ <b>Plan filmowy: scenariusz, realizacja, akcja!</b> | czwartki, g. 18:00-20:00 | 150 zł/miesiąc | Jerzy Wójcicki | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Teatr Amatorski 40+</b> | wtorki, g. 18:30-20:30 | 90 zł / miesiąc | Michał Zasłona | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Warsztaty sensoryczno-plastyczne </b>| środy, g. 17:00-18:00 | 120 zł / miesiąc | Justyna Majzel | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Warsztaty robótek ręcznych: szydełka, druty, origami</b> | wtorki, g. 18:00-19:00 | 49 zł / miesiąc | Anetta Gorloff-Żukowska | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Gra na bębnach</b> | wtorki, g. 18:30-20:30 | 40 zł / 1 zajęcia, karnet: 150 zł / miesiąc, 400 zł / kwartał | Anna „Maszka” Kwidzińska | Zajęcia już trwają, zapraszamy do zapisów!</p><p>✅ <b>Zabawy z angielskim dla dzieci i seniorów</b> | środy, g. 15:00-16:00 (seniorzy) / środy, g. 16:00-17:00 (dzieci) | 60 zł / miesiąc (seniorzy), 120 zł / miesiąc (dzieci) | Anna Liedtke | Uwaga: trwają zapisy, zajęcia nie odbywają się!</p><p>✅ <b>Klub Seniora</b> | poniedziałki, g. 14:00-16:00 | bezpłatne | Polski Związek Emerytów, Rencistów i Inwalidów, Koło 11 (oddział Gdańsk) | Uwaga: do czasu pozostawania Gdańska w strefie żółtej lub czerwonej, spotkania nie odbywają się.</p><p>✅ <b>Zajęcia z gry na saksofonie</b> | termin i godzina zajęć do ustalenia z instruktorem| 100 zł | Marcin Janek</p><p>✅ <b>Zajęcia z gry na gitarze basowej</b><b> </b>| termin i godzina zajęć do ustalenia z instruktorem| 100 zł | John Leysner</p><p>✅ <b>Indywidualna nauka śpiewu</b> | termin i godzina zajęć do ustalenia z instruktorem| 100 zł | Agata Walczak</p><p> </p></p>\",\"categoryId\":83,\"startDate\":\"2021-03-22T02:05:00-05:00\",\"organizer\":{\"id\":5,\"designation\":\"Gdański Archipelag Kultury\"},\"active\":1,\"descShort\":\"JĘZYK CHIŃSKI, JOGA, POPPING CZY PLAN FILMOWY – RÓŻNORODNE ZAJĘCIA STAŁE W SCENIE MUZYCZNEJ W ROKU SZKOLNYM 2020/21. W OFERCIE AŻ 18 PROPOZYCJI!Tradycyjnie, początkiem października, w Scenie Muzycznej ruszyły zapisy na zajęcia stałe, kt...\",\"tickets\":{\"type\":\"unknown\"}}";
        szablonJSON szablon = gsonRead.fromJson(jsonStr, szablonJSON.class);
        if (szablon.getActive() == 1) {
            available = "TAK";
        } else {
            available = "NIE";
        }
        System.out.println();
        System.out.println("Nazwa wydarzenia: " + szablon.getName());
        System.out.println("Organizator: " + szablon.getOrganizer().getDesignation());
        System.out.println("Wydarzenie jest aktualne:  " + available);
        System.out.println("Data rozpoczęcia: " + szablon.getStartDate());
        System.out.println("Data zakończenia: " + szablon.getEndDate());
        System.out.println("Krótki opis: " + szablon.getDescShort());



    }
}

