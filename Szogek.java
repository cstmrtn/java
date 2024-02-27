import java.util.Scanner;

public class Szogek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adjon meg egy szöget: ");
        int szam = scanner.nextInt();

        if (szam > 0 && szam < 90) 
        {
            System.out.println("hegyes szög");
        }
        else if (szam > 90 && szam < 180) 
        {
            System.out.println("tompa szög");
        }
        else if (szam > 180 && szam < 360) 
        {
            System.out.println("homorú szög");
        }

        switch(szam)
        {
            case 0:
                System.out.println("null szög");
                break;
            case 90:
                System.out.println("derékszög");
                break;
            case 180:
                System.out.println("egyenes szög");
                break;
            case 360:
                System.out.println("teljes szög");
                break;
            default:
                System.out.println("Nincs ilyen szög");

            }
        }

        
    }

