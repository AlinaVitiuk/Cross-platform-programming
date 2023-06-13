import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        FileReader fA;
        File fB = new File("C:\\Users\\admin\\Desktop\\NULP\\Крос-платформне програмування\\Lab4\\B.txt");
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        //зчитування елементів масиву А з файлу
        try {
            fA = new FileReader("C:\\Users\\admin\\Desktop\\NULP\\Крос-платформне програмування\\Lab4\\A.txt");
            Scanner input = new Scanner(fA);
            for (int i = 0; i < 5; i++)
                for (int j = 0; j < 5; j++)
                    A[i][j] = input.nextInt();
            input.close();
        }
        //Вивід повідомлення про виняткові ситуації при зчитування файлу
        catch (FileNotFoundException e) {
            System.out.println("Файл з елементами масиву А не створено");
            return;
        }
        catch (InputMismatchException e) {
            System.out.println("Перевірте запис елементів масиву А у файлі");
            return;
        }
        catch (NoSuchElementException e) {
            System.out.println("У файлі недостатньо елементів для масиву 5х5");
            return;
        }
        //обчислення різниці середніх значень додатніх і від'ємних елементів
        int Negative = 0;
        int Positive = 0;
        int SumNegative = 0;
        int SumPositive = 0;
        for (int i=0; i<5; i++) {
            for (int j = 0; j < 5; j++) {
                if (A[i][j] < 0) {
                    SumNegative += A[i][j];
                    Negative++;
                }
                if (A[i][j] > 0) {
                    SumPositive += A[i][j];
                    Positive++;
                }
            }
        }
        System.out.println("Середнє значення додатніх елементів масиву А: " + SumPositive/Positive);
        System.out.println("Середнє значення від'ємних елементів масиву А: " + SumNegative/Negative);
        System.out.println("Різниця середніх значень додатніх та від'ємних елементів:" + (SumPositive/Positive-SumNegative/Negative));

        //створення масиву В. Масив В утворити з масиву А, замінивши в ньому всі елементи менші за -5 на протилежні.
        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++)
                if (A[i][j]<-5) B[i][j] = -A[i][j];
                else B[i][j] = A[i][j];
        try {
            FileWriter fileWrite = new FileWriter(fB);
            BufferedWriter writeBufer = new BufferedWriter(fileWrite);
            PrintWriter printB = new PrintWriter(writeBufer);
            for (int i=0; i<5; i++) {
                for (int j = 0; j < 5; j++) printB.print(B[i][j] + " ");
                    printB.println();
            }
            printB.close();
        }
        catch (IOException e) {
            System.out.println("Помилка при створенні файла з масивом В");
        }
    }
}
