import java.util.Scanner;

import static java.lang.Math.pow;

public class MathFunction {
    public static double factorial(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введіть значення числа x: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        //double x=1.57;
        double u, sum = 0, eps = 0.00001;
        int k = 1;
        do {
            u = 0.25 * Math.pow(-1, k + 1) * (((Math.pow(3, 2 * k + 1) - 3) / factorial(2 * k + 1) )* Math.pow(x, 2 * k + 1));
            sum += u;
            k++;
        } while (Math.abs(u) >= eps);

        System.out.println("\nЗначення суми степеневого ряду: " + sum);
        System.out.println("Кількість доданків у степеневому ряді: " + k);

        //обчислення лівої частини рівняння
        double sin = Math.sin(x);
        double y = pow(sin, 3);

        System.out.printf("Значення функції: ");
        System.out.println(y);

        System.out.printf("Перевірка: ");
        System.out.println("порівняння результатів (модуль різниці): " + Math.abs(y-sum));
    }
}
