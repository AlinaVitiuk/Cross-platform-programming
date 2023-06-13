import java.util.Scanner;
public class Algorithm {
    public static void main(String[] args) {
        System.out.println("Для заданого натурального числа N знайти суму N/N!");
        System.out.println("Введіть значення числа N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Введіть натуральне число більше за 0.");
        } else {
            double sum = 0;
            double factorial = 1;

            int i = 1;
            while (i <= n) {
                factorial *= i;
                sum += i / factorial;
                i++;
            }

            System.out.println("Результат while:");
            System.out.println(n + "/" + n + "! = " + sum);

            sum = 0;
            factorial = 1;
            i = 1;

            do {
                factorial *= i;
                sum += i / factorial;
                i++;
            } while (i <= n);

            System.out.println("Результат do:");
            System.out.println(n + "/" + n + "! = " + sum);

            sum = 0;
            factorial = 1;
            for (int j = 1; j <= n; j++) {
                factorial *= j;
                sum += j / factorial;
            }

            System.out.println("Результат for:");
            System.out.println(n + "/" + n + "! = " + sum);
        }
    }
}