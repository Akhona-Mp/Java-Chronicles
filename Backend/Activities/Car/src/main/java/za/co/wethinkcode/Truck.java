package za.co.wethinkcode;

import java.util.Scanner;

public class Truck extends Car{

    public Truck(String ford, String raptor, int i) {
        super(ford, raptor, i);
    }

    public Truck honk(){
        System.out.println("honk honk .....");
        return this;
    }

    public static Truck build(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Make: ");
        String make = scanner.next();

        System.out.print("Model: ");
        String model = scanner.next();

        System.out.print("Year: ");
        int year = scanner.nextInt();

        Truck car = new Truck(make,model,year);
        System.out.println(car.honk().toString());
        return car;
    }

    @Override
    public String toString() {
        return "Car Specs:\n" +
                "\t Make: " + make + '\n' +
                "\t Model: " + model + '\n' +
                "\t Year: " + year + '\n';
    }
}

