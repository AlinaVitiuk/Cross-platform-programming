import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Part1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введіть перше число:");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        float x1 = Integer.parseInt(reader1.readLine());
        System.out.println("Введіть друге число:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        float x2 = Integer.parseInt(reader2.readLine());
        System.out.println("Введіть третє число:");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        float x3 = Integer.parseInt(reader3.readLine());
        int k=0;
        if (x1 < 0) k++;
        if (x2 < 0) k++;
        if (x3 < 0) k++;

        if (k > 0) System.out.println("Кількість від'ємних чисел: " + k );
        else System.out.println("Серед введених чисел відсутні від'ємні:");
    }
}