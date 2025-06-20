package za.co.wethinkcode;

import java.util.Scanner;

public class SuperCar extends Car{
    int speed;

    public SuperCar(String make, String model, int year,int speed) {
        super(make, model, year);
        this.speed = speed;
    }

    @Override
    public SuperCar drive(){
        System.out.println("Speeding...");
        return this;
    }

    public static SuperCar build(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Make: ");
        String make = scanner.next();

        System.out.print("Model: ");
        String model = scanner.next();

        System.out.print("Year: ");
        int year = scanner.nextInt();

        System.out.print("Top Speed: ");
        int speed = scanner.nextInt();

        SuperCar car = new SuperCar(make,model,year,speed);
        System.out.println(car.drive().toString());
        return car;
    }
    @Override
    public String toString() {
        return "Car Specs:\n" +
                "\t Make: " + make + '\n' +
                "\t Model: " + model + '\n' +
                "\t Year: " + year + '\n' +
                "\t Top Speed: " + speed +" km/p" + '\n';


    }
}
