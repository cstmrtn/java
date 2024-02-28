import java.util.Scanner;

public class Dolgozat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a kör sugarát:  ");
        int s = scanner.nextInt();

        double terulet = 0;
        terulet = Math.sqrt(s)*Math.PI;
        System.out.println("A kör területe 2 tizedesjegy pontossággal: %.2f " + terulet + "A kör területe egész számra kerekítve: " + Math.round(terulet));
    }
}