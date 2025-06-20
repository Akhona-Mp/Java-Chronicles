package za.co.wethinkcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while(true){

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Operator(+,-,/,*): ");
            char operator = scanner.next().charAt(0);
            if(operator == '+'|| operator == '-'|| operator == '/'|| operator == '*'){

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                if(operator == '+'){
                    result = num1+ num2;
                }else if(operator == '-'){
                    result = num1 - num2;
                }else if(operator == '*'){
                    result = num1 * num2;
                }else if(operator == '/'){
                    if (num2 == 0){
                        System.out.println("Cannot devide by zero!");
                    }else {
                        result = num1/ num2;
                    }
                }
            }else if(operator == 'q'){
                break;
            }else{
                System.out.println("Invalid");
            }
            System.out.println("Result: " + result);

        }
    }
}