public class MetodusokDolgozat {


    public static int signOfTheNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }


    public static String twoParameters(Object param1, Object param2) {
        return "first parameter: " + param1.toString() + ", second parameter: " + param2.toString();
    }


    public static double triangleArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            return -1;
        }
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }


    public static String secondDegreeFunction(double a, double b, double c) {
        if (a == 0) {
            return "nem masodfoku a fuggveny";
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "x1 = " + x1 + ", x2 = " + x2;
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return "x = " + x;
        } else {
            return "nincs valos megoldas";
        }
    }

    // A hihetetlen nagy töszt
    public static void main(String[] args) {
        // 1.
        System.out.println("1. feladat:");
        System.out.println("signOfTheNumber(10): " + signOfTheNumber(10));
        System.out.println("signOfTheNumber(1): " + signOfTheNumber(1));
        System.out.println("signOfTheNumber(0): " + signOfTheNumber(0));
        System.out.println("signOfTheNumber(-10): " + signOfTheNumber(-10));
        System.out.println("signOfTheNumber(-1): " + signOfTheNumber(-1));

        // 2.
        System.out.println("\n2. feladat:");
        System.out.println(twoParameters(2, 3));
        System.out.println(twoParameters("2", 3));
        System.out.println(twoParameters(2, "3"));
        System.out.println(twoParameters("2", "3"));
        System.out.println(twoParameters(4, 5));
        System.out.println(twoParameters("4", 5));
        System.out.println(twoParameters(4, "5"));
        System.out.println(twoParameters("4", "5"));

        // 3.
        System.out.println("\n3. feladat:");
        System.out.println("triangleArea(3, 4, 0): " + triangleArea(3, 4, 0));
        System.out.println("triangleArea(0, 1, 0): " + triangleArea(0, 1, 0));
        System.out.println("triangleArea(3, 4, 5): " + triangleArea(3, 4, 5));
        System.out.println("triangleArea(4, 6, 8): " + triangleArea(4, 6, 8));
        System.out.println("triangleArea(3, 4, 7): " + triangleArea(3, 4, 7));
        System.out.println("triangleArea(1, 2, 4): " + triangleArea(1, 2, 4));

        // 4.
        System.out.println("\n4. feladat:");
        System.out.println("secondDegreeFunction(0, 6, 5): " + secondDegreeFunction(0, 6, 5));
        System.out.println("secondDegreeFunction(0, 1, 1): " + secondDegreeFunction(0, 1, 1));
        System.out.println("secondDegreeFunction(1, 3, 4): " + secondDegreeFunction(1, 3, 4));
        System.out.println("secondDegreeFunction(2, 4, 3): " + secondDegreeFunction(2, 4, 3));
        System.out.println("secondDegreeFunction(2, -4, 2): " + secondDegreeFunction(2, -4, 2));
        System.out.println("secondDegreeFunction(1, 0, -4): " + secondDegreeFunction(1, 0, -4));
    }
}
