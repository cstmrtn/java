import java.util.Random;

public class Whiles {
    public static void main(String[] args) {
        Random rand = new Random();

        int num1 = rand.nextInt(100) + 1;
        int num2 = rand.nextInt(100) + 1;

 
        int smaller = Math.min(num1, num2);
        int larger = Math.max(num1, num2);

        int count = 0;

     
        while (smaller <= larger) {
            System.out.print(smaller + " ");
            smaller++;
            count++;

  
            if (count % 10 == 0 && smaller <= larger) {
                System.out.println();
            }
        }
    }
}
