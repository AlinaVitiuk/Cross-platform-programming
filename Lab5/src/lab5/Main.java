package lab5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Accommodation> accommodations = new ArrayList<>();

        // Додавання примірників класу в масив accommodations
        accommodations.add(new Accommodation("Львів, вул. Шевченка, 10", 2, 1200, false, "", 3));
        accommodations.add(new Accommodation("Львів, вул. Стрийська, 5", 3, 1500, true, "2023-06-01", 12));
        accommodations.add(new Accommodation("Львів, вул. Городоцька, 20", 1, 800, false, "", 24));
        accommodations.add(new Accommodation("Львів, вул. Коперника, 15", 2, 1100, true, "2023-06-15", 6));
        accommodations.add(new Accommodation("Львів, вул. Сахарова, 7", 4, 1800, false, "", 10));
        accommodations.add(new Accommodation("Львів, вул. Замарстинівська, 30", 2, 1000, false, "", 3));
        accommodations.add(new Accommodation("Львів, вул. Наукова, 12", 3, 1400, true, "2023-06-10", 12));
        accommodations.add(new Accommodation("Львів, вул. Бандери, 25", 1, 900, false, "", 9));
        accommodations.add(new Accommodation("Львів, вул. Січових Стрільців, 8", 2, 1300, false, "", 24));
        accommodations.add(new Accommodation("Львів, вул. Вітовського, 3", 3, 1600, true, "2023-07-01", 12));
        accommodations.add(new Accommodation("Львів, вул. Куліша, 18", 2, 1100, false, "", 1));
        accommodations.add(new Accommodation("Львів, вул. Личаківська, 40", 1, 850, true, "2023-06-20", 6));
        accommodations.add(new Accommodation("Львів, вул. Левицького, 6", 4, 2000, false, "", 36));
        accommodations.add(new Accommodation("Львів, вул. Богдана Хмельницького, 22", 2, 1300, true, "2023-07-05", 9));
        accommodations.add(new Accommodation("Львів, вул. Галицька, 17", 3, 1500, false, "", 3));

        System.out.println("Всі квартири:");
        for (Accommodation accommodation : accommodations) {
            accommodation.displayDetails();
        }

        System.out.println("\nВільні квартири:");
        for (Accommodation accommodation : accommodations) {
            if (!accommodation.isRented()) {
                accommodation.displayDetails();
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть максимальну ціну оренди: ");
        double maxRentalCost = scanner.nextDouble();
        System.out.print("Кількість кімнат: ");
        int desiredNumberOfRooms = scanner.nextInt();

        System.out.println("\nВільні квартири, кількість кімнат - " + desiredNumberOfRooms + "максимальна ціна оренди в $ - " + maxRentalCost + ":");
        for (Accommodation accommodation : accommodations) {
            if (!accommodation.isRented() && accommodation.getNumberOfRooms() == desiredNumberOfRooms && accommodation.getRentalCost() <= maxRentalCost) {
                accommodation.displayDetails();
            }
        }
    }
}

