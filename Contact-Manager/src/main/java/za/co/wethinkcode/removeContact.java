package za.co.wethinkcode;

import java.util.Map;
import java.util.Scanner;

public class removeContact {
    Map<String,Integer> contacts;

    removeContact(Map<String,Integer>contacts){
        this.contacts = contacts;
    }

    public Map<String,Integer> remove(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.next();

        if(contacts.containsKey(name)){
            contacts.remove(name);
            System.out.println("Contact Removed");
        }else {
            System.out.println("Contact does not exist");
        }
        return contacts;
    }
}
