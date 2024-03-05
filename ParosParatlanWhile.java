import java.util.Scanner;

public class ParosParatlanWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int szam;

        while (true) {
            System.out.print("Kérem adjon meg egy pozitív egész számot (0 a kilépéshez): ");
            szam = scanner.nextInt();

            if (szam > 0) {
                if (szam % 2 == 0) {
                    System.out.println(szam + " páros szám.");
                } else {
                    System.out.println(szam + " páratlan szám.");
                }
            } else {
                System.out.println("Köszönjük, hogy használta a programot!");
                break;
            }
        }
    }
}
