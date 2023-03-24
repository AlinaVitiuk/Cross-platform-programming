import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.abs;

public class PerimeterArea {
    public static void main(String[] args) throws IOException
    {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Дано координати двох протилежних вершин прямокутника: (x1, y1), (x2, y2).");
        System.out.println("Сторони прямокутника паралельні осям координат. ");

        System.out.println("Введіть координати першої точки:");
        System.out.println("x1 = ");
        int x1 = Integer.parseInt(input.readLine());
        System.out.println("y1 = ");
        int y1 = Integer.parseInt(input.readLine());

        System.out.println("Введіть координати другої точки:");
        System.out.println("x2 = ");
        int x2 = Integer.parseInt(input.readLine());
        System.out.println("y2 = ");
        int y2 = Integer.parseInt(input.readLine());

        System.out.println("(х1, у1) = " + "(" + x1 + ", " + y1 + ")");
        System.out.println("(х2, у2) = " + "(" + x2 + ", " + y2 + ")");

        int a = Math.abs(x1-x2);
        int b = Math.abs(y1-y2);
        int p = 2*(a+b);
        int s = a*b;
        System.out.println("Периметер прямокутника: " + p + ".");
        System.out.println("Площа прямокутника: " + s + ".");
    }
}
