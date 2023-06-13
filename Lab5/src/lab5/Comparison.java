package lab5;

import java.util.ArrayList;
import java.util.List;

public class Comparison {
    public static void main(String[] args) {
        List<Accommodation> accommodations = new ArrayList<>();

        // Додавання примірників класу в масив accommodations
        accommodations.add(new Accommodation("Львів, вул. Шевченка, 10", 2, 1000, false, "", 3));
        accommodations.add(new Accommodation("Львів, вул. Городоцька, 20", 1, 900, false, "", 24));

        System.out.println("Всі квартири:");
        for (Accommodation accommodation : accommodations) {
            accommodation.displayDetails();
        }

        // Порівняння двох квартир
        Accommodation accommodation1 = accommodations.get(0);
        Accommodation accommodation2 = accommodations.get(1);

        int result = accommodation1.compareTo(accommodation2);
        if (result == 1) {
            System.out.println("\nПерша квартира дорожча за другу");
        } else if (result == -1) {
            System.out.println("\nДруга квартира дорожча за першу");
        } else {
            System.out.println("\nЦіна квартир однакова. Порівнюємо за кількістю кімнат.");
            if (accommodation1.getNumberOfRooms() < accommodation2.getNumberOfRooms()) {
                System.out.println("Перша квартира має меншу кількість кімнат за другу");
            } else if (accommodation1.getNumberOfRooms() > accommodation2.getNumberOfRooms()) {
                System.out.println("Друга квартира має меншу кількість кімнат за першу");
            } else {
                System.out.println("Квартири мають однакову кількість кімнат");
            }
        }
    }
}
