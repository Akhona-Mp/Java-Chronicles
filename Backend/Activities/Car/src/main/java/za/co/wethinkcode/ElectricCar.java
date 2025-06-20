package za.co.wethinkcode;

import java.util.Scanner;

public class ElectricCar extends Car{
    int battery;

    public ElectricCar(String make, String model, int year,int battery) {
        super(make, model, year);
        this.battery = battery;
    }

    public ElectricCar charge(){
        System.out.println("Charging...");
        return this;
    }


    public static ElectricCar build(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Make: ");
        String make = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Year: ");
        int year = scanner.nextInt();

        System.out.print("Battery level: ");
        int battery = scanner.nextInt();

        ElectricCar car = new ElectricCar(make, model,year,battery);
        System.out.println(car.charge().toString());
        return car;
    }
    @Override
    public String toString() {

        return "Car Specs:\n" +
                "\t Make: " + make + '\n' +
                "\t Model: " + model + '\n' +
                "\t Year: " + year + '\n' +
                "\t Batter Level : " + battery + "%" + '\n';
    }


}
