package lab5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddToList {
    public static void main(String[] args) {
        List<Accommodation> accommodations = loadFromFile("LoadFromFileAccommodations.txt");

        System.out.println("Всі квартири:");
        displayAccommodations(accommodations);

        // Додавання нових об'єктів
        accommodations.add(new Accommodation("Львів, вул. Хмельницького, 7", 2, 1300, false, "", 6));
        accommodations.add(new Accommodation("Львів, вул. Франка, 25", 3, 1800, true, "2023-07-10", 12));

        for (Accommodation accommodation : accommodations) {
            accommodation.displayDetails();
        }
        // Запис списку об'єктів у файл
        saveToFile(accommodations, "updated_accommodations.txt");
    }

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

    public static void saveToFile(List<Accommodation> accommodations, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Accommodation accommodation : accommodations) {
                writer.write(accommodation.getAddress());
                writer.newLine();
                writer.write(Integer.toString(accommodation.getNumberOfRooms()));
                writer.newLine();
                writer.write(Double.toString(accommodation.getRentalCost()));
                writer.newLine();
                writer.write(Boolean.toString(accommodation.isRented()));
                writer.newLine();
                writer.write(accommodation.getRentalDate());
                writer.newLine();
                writer.write(Integer.toString(accommodation.getRentalTerm()));
                writer.newLine();
            }
            System.out.println("Дані успішно записано у файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Помилка при записі у файл: " + e.getMessage());
        }
    }

    public static void displayAccommodations(List<Accommodation> accommodations) {
        for (Accommodation accommodation : accommodations) {
            accommodation.displayDetails();
        }
    }
}
