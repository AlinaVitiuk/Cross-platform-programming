package lab5;

public class Accommodation {
    private String address;
    private int numberOfRooms;
    private double rentalCost;
    private boolean isRented;
    private String rentalDate;
    private int rentalTerm;

    public Accommodation(String address, int numberOfRooms, double rentalCost, boolean isRented, String rentalDate, int rentalTerm) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.rentalCost = rentalCost;
        this.isRented = isRented;
        this.rentalDate = rentalDate;
        this.rentalTerm = rentalTerm;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public String getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(String rentalDate) {
        this.rentalDate = rentalDate;
    }

    public int getRentalTerm() {
        return rentalTerm;
    }

    public void setRentalTerm(int rentalTerm) {
        this.rentalTerm = rentalTerm;
    }

    // Other methods

    public void rentAccommodation() {
        isRented = true;
    }

    public void returnAccommodation() {
        isRented = false;
    }

    public void displayDetails() {
        System.out.println("Адреса: " + address);
        System.out.println("Кількість кімнат: " + numberOfRooms);
        System.out.println("Ціна оренди ($): " + rentalCost);
        System.out.println("Статус оренди: " + (isRented ? "орендована" : "не орендована"));
        if (isRented) {
            System.out.println("Кінець оренди: " + rentalDate);
        }
        System.out.println("Термін оренди (у місяцях): " + rentalTerm);
        System.out.println("----------------------------------------");
    }


    //PART 2
    public int compareTo(Accommodation other) {
        // Порівняння за ціною
        if (this.rentalCost > other.rentalCost) {
            return 1; // this > other
        } else if (this.rentalCost < other.rentalCost) {
            return -1; // this < other
        }

        // Якщо ціни однакові, порівнюємо за кількістю кімнат
        if (this.numberOfRooms > other.numberOfRooms) {
            return 2; // this > other
        } else if (this.numberOfRooms < other.numberOfRooms) {
            return -2; // this < other
        }

        return 0; // this == other
    }
}
