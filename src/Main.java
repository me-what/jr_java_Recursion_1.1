public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        System.out.println(main.fact(5));

        System.out.println(main.fact2(6));
        System.out.println(main.factorial(7));
        System.out.println();

        System.out.println(factorial(1));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
        System.out.println(factorial(6));

        System.out.println();
        System.out.println(factorial4(3) + "!");
    }

    private int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    private int fact2(int n) {
        if (n < 0) {
            System.out.println("Зачем тебе факториал из отрицательного числа?");
            return Integer.parseInt(null);
        }
        int result = 1;
        if (n == 0) {
            return result;
        }
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;

    }

    private static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }


    private static int factorial4(int n) {
        int result = 1;
        if (n < 0) {
            System.out.println("Зачем тебе факториал из отрицательного числа?");
            return Integer.parseInt(null);
        }

        if (n == 0) {
            System.out.print(" = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }
        result = n * factorial4(n-1);
        return result;
    }
}