import java.util.Scanner;

public class IFfeladat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első számot: ");
        int elso = scanner.nextInt();
        System.out.println("Kérem a második számot: ");
        int masodik = scanner.nextInt();
        System.out.println("Kérem a harmadik számot: ");
        int harmadik = scanner.nextInt();
        if(elso > masodik && masodik > harmadik ){
            System.out.println("A sorrend: " + elso + " " + masodik + " " + harmadik );
        }
        else if(masodik > elso && elso  > harmadik ){
            System.out.println("A sorrend: " + masodik + " " + elso + " " + harmadik );
        }
         else if(harmadik > masodik && masodik > elso ){
            System.out.println("A sorrend: " + harmadik + " " + masodik + " " + elso );
        }
         else if(harmadik > elso && elso > masodik ){
            System.out.println("A sorrend: " + harmadik + " " + elso + " " + masodik );
        }
        else {
            System.out.println("Nem jó szám");
        }

    }
}