package lab5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadFromFile {
    public static List<Accommodation> loadFromFile(String fileName) {
        List<Accommodation> accommodations = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String address = line;
                int numberOfRooms = Integer.parseInt(reader.readLine());
                double rentalCost = Double.parseDouble(reader.readLine());
                boolean isRented = Boolean.parseBoolean(reader.readLine());
                String rentalDate = reader.readLine();
                int rentalTerm = Integer.parseInt(reader.readLine());

                Accommodation accommodation = new Accommodation(address, numberOfRooms, rentalCost, isRented, rentalDate, rentalTerm);
                accommodations.add(accommodation);
            }
            System.out.println("Дані успішно зчитано з файлу: " + fileName);
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні з файлу: " + e.getMessage());
        }
        return accommodations;
    }
    public static void main(String[] args) {
        List<Accommodation> accommodations = new ArrayList<>();

        String fileName = "LoadFromFileAccommodations.txt";

        // Зчитування об'єктів з файлу
        List<Accommodation> loadedAccommodations = loadFromFile(fileName);

        // Виведення зчитаних об'єктів
        System.out.println("Зчитані об'єкти:");
        for (Accommodation accommodation : loadedAccommodations) {
            accommodation.displayDetails();
        }
    }
}
