package za.co.wethinkcode;

import java.util.*;

public class addContact {
    Map<String, Integer> contacts;

    addContact(Map<String,Integer>contacts){
        this.contacts = contacts;
    }

    public Map<String,Integer> add() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your phone: ");
        Integer phone = scanner.nextInt();
        contacts.put(name,phone);

        System.out.println("Contact added successfully: \n "+name+" : "+ phone);
        return contacts;
    }

}
