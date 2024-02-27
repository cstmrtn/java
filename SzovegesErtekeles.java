import java.util.Scanner;

public class SzovegesErtekeles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem, adjon meg egy egész számot 1 és 5 között: ");
        int szam = scanner.nextInt();

        switch (szam) {
            case 1:
                System.out.println("Elégtelen");
                break;
            case 2:
                System.out.println("Elégséges");
                break;
            case 3:
                System.out.println("Közepes");
                break;
            case 4:
                System.out.println("Jó");
                break;
            case 5:
                System.out.println("Jeles");
                break;
            default:
                System.out.println("Nincs ilyen jegy");
        }
    }
}
