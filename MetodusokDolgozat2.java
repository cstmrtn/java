public class MetodusokDolgozat2{

        
        public static void main(String[] args) {
            double a = 1;
            double b = -3;
            double c = 2;
            
            int megoldasokSzama = masodfokuMegoldasSzam(a, b, c);
            
            switch (megoldasokSzama) {
                case -1:
                    System.out.println("Nem másodfokú képlet.");
                    break;
                case 0:
                    System.out.println("Nincs valós megoldása.");
                    break;
                case 1:
                    System.out.println("Egy megoldása van.");
                    break;
                case 2:
                    System.out.println("Két megoldása van.");
                    break;
            }
        }
    }
    
    public static boolean vanKisbetu(String szov)
    {
        for(Character betu : szov.toCharArray())
        {
            if ( (Character.isLowerCase(betu))) {
                return true;
                
            }
            
        }
        return false;
    }
    public static String getMeret(double a){
        if (a < 150){
            return "XS";
        }
        else if (a >= 150 && a <159){
            return "S";
        
        }
        else if (a >= 160 && a <169){
            return "M";
        }
        else if (a >= 170 && a <179){
            return "L";
        }
        else if (a >= 180 && a <189){
            return "XL";
        }
        else{
            return "XXL";
        }
}
public static String rubikKockaSzin(int a){
    if (a == 1){
        return "yellow";
    }
    else if (a == 2){
        return "red";
    }
    else if (a == 3){
        return "orange";
    }
    else if (a == 4){
        return "white";
    }
    else if (a == 5){
        return "blue";
    }
    else if (a == 6){
        return "green";
    }
    else{
        return "invalid parameter";
    }
}

public static void main(String[] args) {
          // Karakterek ellenőrzése
          System.out.println(vanKisbetu("alma")); // true
          System.out.println(vanKisbetu("ALmA")); // true
          System.out.println(vanKisbetu("ALMA")); // false
          System.out.println(vanKisbetu("")); // false
          System.out.println(vanKisbetu("123456")); // false
  
          // Méret meghatározása
          System.out.println(getMeret(100)); // "XS"
          System.out.println(getMeret(150)); // "S"
          System.out.println(getMeret(156)); // "S"
          System.out.println(getMeret(160)); // "M"
          System.out.println(getMeret(166)); // "M"
          System.out.println(getMeret(170)); // "L"
          System.out.println(getMeret(176)); // "L"
          System.out.println(getMeret(180)); // "XL"
          System.out.println(getMeret(186)); // "XL"
          System.out.println(getMeret(190)); // "XXL"
          System.out.println(getMeret(200)); // "XXL"
  
          // Rubik-kocka színe
          System.out.println(rubikKockaSzin(1)); // "yellow"
          System.out.println(rubikKockaSzin(2)); // "red"
          System.out.println(rubikKockaSzin(3)); // "orange"
          System.out.println(rubikKockaSzin(4)); // "white"
          System.out.println(rubikKockaSzin(5)); // "blue"
          System.out.println(rubikKockaSzin(6)); // "green"
          System.out.println(rubikKockaSzin(7)); // "invalid parameter"
          System.out.println(rubikKockaSzin(-1)); // "invalid parameter"
}
}
