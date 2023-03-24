
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HelloUser {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Як вас звати?");
        BufferedReader input = new BufferedReader(
                new InputStreamReader (System.in));
        String userName = input.readLine();
        System.out.println("Привіт, " + userName + "!");

        int now = 2023;
        System.out.println("Скільки вам років?");
        int age = Integer.parseInt(input.readLine());
        System.out.println("Ви народилися в " + (now - age) + " році.");
    }
}

