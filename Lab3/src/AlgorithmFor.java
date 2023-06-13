import java.util.Scanner;
public class AlgorithmFor {
    public static void main(String[] args) {
        System.out.println("Для заданого натурального числа N знайти суму N/N!");
        System.out.println("Введіть значення числа N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Введіть натуральне число більше за 0.");
        }
        else {
            double sum = 0;
            double factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
                sum += i / factorial;
            }

            System.out.println("Результат:");
            System.out.println(n + "/" + n + "! = " + sum);
        }
    }
}