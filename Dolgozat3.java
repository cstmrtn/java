import java.util.Scanner;

public class Dolgozat3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Kérem, adj meg egy egész számot 10 és 90 között: ");
        int szam = sc.nextInt();

        if(szam >= 10 && szam <= 90)
        {
            if ((szam % 3 )== 0 && (szam % 5) != 0 )
            {
                System.out.println("Fizz");
            }
            else  if ((szam % 5 )== 0 && (szam % 3 )!= 0 )
            {
                System.out.println("Buzz");
            }
            else  if ((szam % 3  )== 0 && (szam % 5  )== 0  )
            {
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(szam);
            }
        }
        else{
            System.out.print("a szám nem helyes");
        }
    
    
    




    }
}