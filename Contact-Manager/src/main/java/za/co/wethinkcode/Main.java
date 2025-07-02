package za.co.wethinkcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
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
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();

            if (option == 1) {
                addContact use = new addContact(contacts);
                contacts = use.add();
            }else if (option == 2) {
                System.out.println(contacts);
            }else if (option == 3) {
                removeContact use = new removeContact(contacts);
                contacts = use.remove();
            }else if (option == 4) {
                searchContact use = new searchContact(contacts);
                contacts = use.search();
            }else if (option == 5) {

            }else if (option == 6) {

            }else{
            ;
        }


    }}
}
