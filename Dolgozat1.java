import java.util.Scanner;

public class Dolgozat1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Kérlek add meg a nevedet! ");
    String nev = sc.next();
    sc.close();

    System.out.print("Hello " + nev);
    }
}