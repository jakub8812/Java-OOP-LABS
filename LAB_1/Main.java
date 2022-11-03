import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Zadanie 1
        System.out.println("Imie: " + getName() + "\nWiek: " + getAge());

//        Zadanie 2
        System.out.println("Podaj zmienną A typu double: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj zmienną B typu double: ");
        double b = scanner.nextDouble();
        math(a, b);

        // Zadanie 3
        System.out.println("Podaj liczbe, aby sprawdzic czy jest parzysta: ");
        double c = scanner.nextDouble();
        System.out.println(checkIfEven(c));

        // Zadanie 4
        System.out.println("Podaj liczbe, aby sprawdzic czy jest podzielna przez 3 i 5: ");
        double d = scanner.nextDouble();
        System.out.println(checkMod_3_and_5(d));

        // Zadanie 5
        System.out.println("Podaj liczbe, aby zwrócić ją podniesioną do potęgi 3");
        int e = scanner.nextInt();
        System.out.println(exponentiation(e));

        //Zadanie 6.
        System.out.println("Podaj liczbe, aby zwrócić jej pierwiastek kwadratowy: ");
        double f = scanner.nextDouble();
        System.out.println(sqrtNumber(f));

        //Zadanie 7.
        System.out.println("Podaj zmienny x oraz y do zadania 7.");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println(randNumbers(x, y));
        
    }

    public static boolean randNumbers(double a, double b) {
        double[] numbers = new double[3];
        for (int i = 0; i < 3; i++) {
            double any_nr = Math.random() * b + a;
            numbers[i] = (int) (any_nr);
        }
        return possibleTriangle(numbers);
    }

    public static boolean possibleTriangle(double[] a) {
        Arrays.sort(a);
        return (a[0] + a[1]) < a[2];
    }

    private static double sqrtNumber(double f) {
        return Math.sqrt(f);
    }

    public static String getName() {
        return "Jakub";
    }

    public static Integer getAge() {
        return 22;
    }

    public static Integer exponentiation(int e) {
        return (e * e * e);
    }

    public static boolean checkIfEven(double c) {

        return (c % 2 == 0);
    }

    public static boolean checkMod_3_and_5(double d) {

        return (d % 3 == 0 && d % 5 == 0);
    }
    public static void math(double a, double b) {
        System.out.println("Suma liczb " + a + " oraz " + b + " to: " + (a + b) + "\nRóżnica liczb " + a + " oraz " + b + " to: " + (a - b) + "\nIloczyn liczb " + a + " oraz " + b + " to: " + (a * b) + "\nIloraz liczb " + a + " oraz " + b + " to: " + (a / b) );
    }
}