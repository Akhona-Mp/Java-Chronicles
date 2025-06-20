package za.co.wethinkcode;
import java.util.Scanner;

public class Car {

        String make;
        String model;
        int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car drive(){
            System.out.println("Car is driving...");
            return this;
        }
    public static Car build(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Make: ");
        String make = scanner.next();

        System.out.print("Model: ");
        String model = scanner.next();

        System.out.print("Year: ");
        int year = scanner.nextInt();

        Car car = new Car(make,model,year);
        System.out.println(car.drive().toString());
        return car;
    }
    public String toString() {
        return "Car:\n" +
                "\t Make: " + make + '\n' +
                "\t Model: " + model + '\n' +
                "\t Year: " + year + '\n';

    }
}