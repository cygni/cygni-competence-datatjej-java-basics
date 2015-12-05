package se.cygni.datatjej.hello;

public class DataTjejDemo {

    int age = 30; // long
    boolean female = true;
    String name = "Nathalie";
    double shoeSize = 37.5; // float


    public static void main(String[] args) {
        System.out.println(power(5, 2));
        System.out.println(power(2, 3));

        int first = 2;
        int second = 6;
        int result = first * second + first - second / first; // 11
        result++;    // 12
        result--;    // 11
        result += 1; // 12
        result *= 2; // 24
        System.out.println(result);

        int divide1 = 5 / 2; // 2
        double divide2 = 5.0 / 2.0;


        System.out.println(divide1);
        System.out.println(divide2);
    }

    public static void operators() {
        double shoeSize = 37.5;
        String name = "Nathalie";
        boolean female = true;
        int age = 30;
        char ch = 'A';

        int first = 5;
        int second = 10;

        int result = first * second + first - second / first;


    }

    public static int power(int number, int exponent) {
        int result = number;
        for (int i = 1; i < exponent; i++) {
            result = result * number;
        }
        return result;
    }

    public static void types() {
        double shoeSize = 37.5; // float
        String name = "Nathalie";
        boolean female = true;
        int age = 30;
        char ch = 'A';

        if (female) {
            if (age > 40) {
                System.out.println("A lady");
            } else if (age > 20) {
                System.out.println("A woman");
            } else {
                System.out.println("A girl");
            }
        } else {
            System.out.println("A dude");
        }

        int[] firstPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        for (int prime : firstPrimes) {
            System.out.println(prime);
        }

    }
}
