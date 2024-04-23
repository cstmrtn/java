public class Metodusok2 {
    public static double negyzetTerulet(double a, double b)
    {
        if(a ==0 || b == 0)
        {
            return 0;
        }
        else if (a<0 || b<0) 
        {
            return -1;  
        }
        else
        {
            return a*b;
        }
    }
    public static int harmadikSzog(int a, int b)
    {
        int c = 180-( a + b );
        if (a == 0 || b == 0) 
        {
            return -1;    
        }
        else if (a<0 || b<0) 
        {
            return -1;    
        }
        else if (a + b + c == 180)
        {
            return -1;
        }
        else
        {
            return -1;
        }
    }
    public static boolean vanNagybetu(String szov)
    {
        for(Character betu : szov.toCharArray())
        {
            if ( (Character.isUpperCase(betu))) {
                return true;
                
            }
            
        }
        return false;
    } 
    public static String  fejVagyIras(int a)
    {
        if (a > 0) {
            return "fej";
        }
        else if (a<0) {
            return "írás";
        }
        else {
            return "elere esett";
        }
            
        }
    }