import java.util.Scanner;

public class IFfeladat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Második feladat ");
        System.out.println("Kérem a magasságodat: ");
        int szam = scanner.nextInt();

        if(szam >=150 && szam <= 165 ) {
            System.out.println("A te méreted: S");
        }
        else if (szam >=165 && szam <= 175 ) {
            System.out.println("A te méreted: M");
        }
        else if (szam >=175 && szam <= 185 ) {
            System.out.println("A te méreted: L");
        }
        else if (szam >=185 && szam <= 195 ) {
            System.out.println("A te méreted: XL");
        }
        else{
            System.out.println("NO SIZE");
        }
    }
}