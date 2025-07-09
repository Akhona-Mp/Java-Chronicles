package za.co.wethinkcode;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {
        Map<String,Integer> contacts = new HashMap<>();
        System.out.print(
                "Select an option:\n"+
                "1. Add a new contact\n"+
                "2. View all contacts\n"+
                "3. Search contact by name\n"+
                "4. View history of added contacts\n"+
                "5. Remove contact\n"+
                "6. Exit"
                );

        while(true){
            System.out.println("Option: ");

            try {
                Scanner input = new Scanner(System.in);
                int option = input.nextInt();
                if (option == 1) {
                    addContact user = new addContact(contacts);
                    contacts = user.add();
                }else if (option == 2) {
                    System.out.println(contacts);
                }else if (option == 3) {
                    removeContact user = new removeContact(contacts);
                    contacts = user.remove();
                }else if (option == 4) {
                    searchContact user = new searchContact(contacts);
                    contacts = user.search();
                }else if (option == 5) {

                }else if (option == 6) {
                    System.out.println("Phone shutting down!");
                    System.exit(1);
                }else {
                    System.out.println("Invalid option.");
                }
            }catch(InputMismatchException | NullPointerException e){
                System.out.println("Invalid Option!");
        }
    }}
}
