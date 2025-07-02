package za.co.wethinkcode;

import java.util.Map;
import java.util.Scanner;

public class searchContact {
    Map<String,Integer> contacts;

    searchContact(Map<String,Integer>contacts){
        this.contacts = contacts;
    }

    public Map<String,Integer> search(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Search contact: ");
        String search = scanner.next();

        if (contacts.containsKey(search)){
            System.out.println(contacts.get(search));
        }else{
            System.out.println("No such contact");
        }
        return contacts;
    }


}
