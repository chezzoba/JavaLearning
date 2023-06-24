import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        // Variables & Expressions
        int x = 5;
        float y = 3.14f;
        String greeting = "Hiiii";

        System.out.println("My variable greeting = " + greeting);

        System.out.println("x / 2 = " + (double) x / 2);

        // User Input
/*         Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.next();
        System.out.print("Your age: ");
        int age = scanner.nextInt();
        System.out.println("Favourite food: ");
        String food = scanner.next();
        System.out.println("Hello " + name + ", you are " + age + " years old and you like " + food);
        scanner.close();
        */

        // Math Class
        double a = 4, b = 5;
        double hyp = Math.sqrt(Math.pow(a, 2) + b*b);
        System.out.println("Hypotenuse: " + hyp);

        // Random Class

        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1; // Random int between 1 and 6
        double randomDouble = random.nextDouble(); // Random double between 0 and 1
        System.out.println("My random integer = " + diceRoll);
        System.out.println("Random Double: " + randomDouble);

        // Conditionals

        int condition = 17;

        if (condition >= 18) {
            System.out.println("Greater than or equal to 18");
        } else {
            System.out.println("Less than 18");
        }

        String dayOfWeek = "Friday";

        switch (dayOfWeek) {
            case "Sunday":
                System.out.println("It is a Sunday");
                break;
            case "Saturday":
                System.out.println("It is a Saturday");
                break;
            case "Friday":
                System.out.println("It is a Friday");
                break;
            default:
                System.out.println("Not a day");
        }

        // While Loops

        int iter = 0;

        while (iter < 5) {
            System.out.println("While loop iter = " + iter);
            iter++;
        }

        // For Loops

        for (int i = 0; i <= 5; i++) {
            System.out.println("For loop i = " + i);
        }

        // Arrays

        String[] cars = {"Camaro", "Corvette", "Tesla"};

        System.out.println(cars[0]);
        cars[0] = "Mustang";

        for (int i=0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();

        // String methods

        String name = "Ya boi";

        boolean resultofName = name.equalsIgnoreCase("ya boi");

        int indexOfBoi = name.indexOf("boi");
        String replacedStr = name.replace("boi", "man");
        System.out.println("String results: " + replacedStr);

        // ArrayList

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.remove(2);

        food.set(0, "sushi");

        System.out.println(food.get(1));

        // For-each Loops

        String animals[] = {"Cat", "dog", "rat", "bird"};

        for (String animal : animals) {
            System.out.println("Animal in animals: " + animal);
        }

        hello("Kaizad");
        int z = add(3, 4);

        System.out.println("Sum: " + z);

        System.out.printf("My name is %s and I am %d years old and am %.1f cm tall\n", "Kaizad", 22, 180.);

        // Final

        final double pi = 3.14159; // pi cannot be changed anymore. Basically const

        try {
            int invalid = 8 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("This will always print");
        }

    }

    static void hello ( String name ) {
        System.out.println("Hello " + name);
    }

    static int add ( int x, int y) {
        return x + y;
    }

    static double add (double x, double y) {
        return x + y;
    }

    static int add(int x, int y, int z) {
        return x + y + z;
    }
}
