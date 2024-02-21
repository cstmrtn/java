import java.util.Scanner;

public class IFfeladat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első számot: ");
        int elso = scanner.nextInt();
        System.out.println("Kérem a második számot: ");
        int masodik = scanner.nextInt();
        if(elso>masodik){
            System.out.println("Az első szám a nagyobb. " + elso);
        } else if(elso == masodik){
            System.out.println("A két szm egyenlő. ");
        }else{
            System.out.println("A második szám a nagyobb. " + masodik);
        }
        
    }

}