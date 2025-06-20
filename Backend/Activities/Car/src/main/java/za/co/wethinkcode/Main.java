package za.co.wethinkcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of car do you have?\n" +
                "1. Normal Car\n" +
                "2. SuperCar\n" +
                "3. Electric Car\n" +
                "4. Truck\n"
        );
        int carType = scanner.nextInt();

        if (carType == 1) {
            Car.build();
        } else if (carType == 2) {
            SuperCar.build();
        } else if (carType == 3) {
            ElectricCar.build();
        } else if (carType == 4) {
            Truck.build();
        } else {
            System.out.println("Invalid option!");
        }
    }
}
