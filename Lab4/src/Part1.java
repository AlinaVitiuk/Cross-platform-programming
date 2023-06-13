import java.util.Arrays;

public class Part1 {
    public static void main(String[] args) {
        double[] A = { -1.2, 3.4, -5.6, -7.8, 9.0, 11.2, -13.4, -15.6, 17.8, 19.0 };
        double[] B = GenerateArrayB();
        double[] C = replacePositiveElements(B, A);
        int countA = countElementsGreaterThanAverage(A);
        int countB = countElementsGreaterThanAverage(B);
        int countC = countElementsGreaterThanAverage(C);

        System.out.println("Масив A:");
        printArray(A);
        System.out.println("Масив B:");
        printArray(B);
        System.out.println("Масив C:");
        printArray(C);

        System.out.println("Кількість елементів, більших за їх середнє арифметичне:");
        System.out.println("Масив A: " + countA);
        System.out.println("Масив B: " + countB);
        System.out.println("Масив C: " + countC);
    }

    //заповнення масиву випадковими числами з відрізка [-2; 3]
    public static double[] GenerateArrayB() {
        double[] array = new double[10];
        int maximum = 3;
        int minimum = -2;
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*(maximum-minimum)+minimum;
        }
        return array;
    }

    //знаходження максимального елементу
    public static double findMax(double[] array) {
        double max = 0;
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //заміна додатніх елементів масиву на максимальний елемент
    public static double[] replacePositiveElements(double[] array, double[] maxArray) {
        //максимальний елемент масиву
        double max = findMax(maxArray);
        //заміна додатніх елементів масиву на максимальний елемент
        double[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > 0) {
                newArray[i] = max;
            }
        }
        return newArray;
    }

    //знаходження кількості елементів, більших за їх середнє арифметичне
    public static int countElementsGreaterThanAverage(double[] array) {
        //сума елементів масиву
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        //знаходжуння середнього арифметичного
        double average = sum / array.length;
        //кількість елементів, більших за їх середнє арифметичне.
        int count = 0;
        for (double num : array) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }

    //вивід масивів
    public static void printArray(double[] array) {
        Arrays.sort(array);
        for (double num : array) {
            System.out.printf("%.1f; ", num);
        }
        System.out.println();
    }
}

