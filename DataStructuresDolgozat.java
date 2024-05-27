import java.util.ArrayList;
import java.util.List;

public class DataStructuresDolgozat {

    public static void main(String[] args) {
        // Hozz létre egy változót, mely fővárosok neveit tárolja.
        List<String> capitals = new ArrayList<>();

        // Tartalmazza az alábbi adatokat: "Wien", "Budapest", "Prag", "Bratislava"
        // 2 pont
        capitals.add("Wien");
        capitals.add("Budapest");
        capitals.add("Prag");
        capitals.add("Bratislava");

        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(capitals);

        // Add hozzá a "Ljubljana", "Sarajevo" és "Zagreb" értékeket a fővárosok listájához
        // az ujElemHozzaadasa() metódussal
        // 3 pont
        ujElemHozzaadasa(capitals, "Ljubljana");
        ujElemHozzaadasa(capitals, "Sarajevo");
        ujElemHozzaadasa(capitals, "Zagreb");

        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(capitals);

        // Töröld a fővárosok listából "Sarajevo" elemet a torolElemet() metódussal
        // 1 pont
        torolElemet(capitals, "Sarajevo");

        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(capitals);

        // Hozz létre egy változót, mely főváros, ország párokat tartalmaz.
        // 1 pont
        List<String[]> countries = new ArrayList<>();

        // A tartalma a főváros, ország pároknak a következő legyen:
        // "Wien", "Österreich"
        // "Budapest", "Magyarország"
        // "Ljubljana", "Slovenija"
        // 3 pont
        String[] country1 = {"Wien", "Österreich"};
        String[] country2 = {"Budapest", "Magyarország"};
        String[] country3 = {"Ljubljana", "Slovenija"};

        countries.add(country1);
        countries.add(country2);
        countries.add(country3);

        // Írasd ki a főváros, ország párokat!
        // 1 pont
        for (String[] pair : countries) {
            System.out.println(pair[0] + ", " + pair[1]);
        }

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Budapest"
        // 1 pont
        System.out.println(fovarosOrszaga(countries, "Budapest"));

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Zagreb"
        // 1 pont
        System.out.println(fovarosOrszaga(countries, "Zagreb"));

        // Az ujFovarosOrszagPar() metódussal add hozzá a "Zagreb", "Hrvatska" párt a fővárosok országok párokhoz
        // 1 pont
        ujFovarosOrszagPar(countries, "Zagreb", "Hrvatska");

        // A torolAdatPart() metódussal törld a "Ljubljana" főváros ország párt
        // 1 pont
        torolAdatPart(countries, "Ljubljana");

        // A torolAdatPart() metódussal törld a "Prag" főváros ország párt
        // kezeld a felmerülő hibát és írd ki a hibát
        // 3 pont
        try {
            torolAdatPart(countries, "Prag");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Írasd ki a főváros, ország párokat!
        // 1 pont
        for (String[] pair : countries) {
            System.out.println(pair[0] + ", " + pair[1]);
        }

    }

    // Implementáció szükséges a következő metódusokhoz

    /**
     * ujElemHozzaadasa() - egy elemet ad hozzá a megadott listához
     * @param list a lista, melyhez hozzá kell adni az elemet
     * @param elem az új elem
     */
    // 3 pont
    public static void ujElemHozzaadasa(List<String> list, String elem) {
        list.add(elem);
    }

    /**
     * torolElemet() - a megadott listából törli a megadott elemet
     * @param list a lista, melyből törölni kell az elemet
     * @param elem a törlendő érték
     */
    // 3 pont
    public static void torolElemet(List<String> list, String elem) {
        list.remove(elem);
    }

    /**
     * fovarosOrszaga() - a megadott főváros, ország párok és főváros adatokra visszaadja az osztágot és a fővárost,
     * vagy visszaadja, hogy az adott főváros nincs az adatai között.
     * @param countries a főváros ország párok
     * @param capital a főváros
     * @return "country fővárosa capital", ha a párok között szerepel a főváros, egyébként
     * capital nincs az adatok között.
     * Példa:
     * England fővárosa London.
     * London nincs az adatok között.
     */
    public static String fovarosOrszaga(List<String[]> countries, String capital) {
        for (String[] pair : countries) {
            if (pair[0].equals(capital)) {                return pair[1] + " fővárosa " + capital;
        }
    }
    return capital + " nincs az adatok között.";
}

/**
 * ujFovarosOrszagPar() - A countries-hoz hozzáadja a főváros ország (capital country) párt.
 * @param countries a főváros ország párok
 * @param capital a főváros neve
 * @param country az ország neve
 */
// 3 pont
public static void ujFovarosOrszagPar(List<String[]> countries, String capital, String country) {
    String[] newPair = {capital, country};
    countries.add(newPair);
}

/**
 * A countries főváros ország adatpárok közül törli a capital főváros ország adatpárt, ha szerepel benne.
 * Ha nem szerepel benne, akkor "Nincs " + capital + " főváros az adatok között" hibát dob.
 * @param countries a főváros ország adatpárok
 * @param capital a főváros neve
 * @throws IllegalArgumentException
 */
// 5 pont
public static void torolAdatPart(List<String[]> countries, String capital) throws IllegalArgumentException {
    boolean removed = false;
    for (int i = 0; i < countries.size(); i++) {
        if (countries.get(i)[0].equals(capital)) {
            countries.remove(i);
            removed = true;
            break;
        }
    }
    if (!removed) {
        throw new IllegalArgumentException("Nincs " + capital + " főváros az addatok között");
    }
}
}

               
