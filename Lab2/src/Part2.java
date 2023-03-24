import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        double a, b, c, d;
        System.out.println("Данно нерівності: ах^2-bx>c.");
        System.out.println("Введіть коефіцієнти нерівності: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        a = scanner.nextDouble();
        System.out.println("b = ");
        b = scanner.nextDouble();
        System.out.println("c = ");
        c = scanner.nextDouble();
        d = b * b + 4 * a * c;

        if (a == 0) {
            double x = -c / b;
            if (b > 0) System.out.printf("x є (-inf; " + x + ")");
            if (b < 0) System.out.printf("x є (" + x + " ; +inf)");
            if (b == 0) System.out.println("x немає коренів");
        } else {
            if (d < 0) {
                if (a < 0) System.out.println("x немає коренів");
                    //a < 0
                else System.out.println("x має безліч коренів");
            } else {
                if (d == 0) {
                    double x0 = b / 2 * a;
                    if (a < 0) System.out.println("x немає коренів");
                    else System.out.printf("x є (-inf; " + x0 + ") u (" + x0 + "; +inf)");
                }
                //d > 0
                else {
                    double x1 = (b - Math.sqrt(d)) / (2 * a);
                    double x2 = (b + Math.sqrt(d)) / (2 * a);
                    if (a < 0) {
                        if (x1 > x2) System.out.printf("x є (" + x2 + "; " + x1 + ")");
                        else System.out.printf("x є (" + x1 + "; " + x2 + ")");
                    } else {
                        if (x1 > x2) System.out.printf("x є (-inf; " + x2 + ") u (" + x1 + "; +inf)");
                        else System.out.printf("x є (-inf; " + x1 + ") u (" + x2 + "; +inf)");
                    }
                }
            }
        }
    }
}