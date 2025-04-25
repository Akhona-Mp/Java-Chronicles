package za.co.wethinkcode;
import java.security.KeyStore;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 0 ;

    public static void main(String[] args) {

        boolean isRunning = true;
        int choice;

        while (isRunning) {

            System.out.println("**************************");
            System.out.println("Banking Program");
            System.out.println("**************************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("**************************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw();
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");

            }
        }
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.printf("R%.2f\n",balance);
    }

    static double deposit(){
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount cant be negative");
            return 0;
        }else{
            return amount;
        }

    }

    static double withdraw(){
        double amount;
        System.out.print("Enter amount to withdraw");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("Insufficient funds");
            return 0;
        }else if (amount > 0){
            System.out.println("Insufficient funds");
            return 0;
        }else{
            return amount;
        }
    }

}