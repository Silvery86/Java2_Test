/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2_test;

import java.util.HashMap;
import java.util.Scanner;


/**
 *
 * @author Giang8692
 */
public class PhoneBook {
    HashMap<String, Contact> addressBook = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    
    public void addContact() {
        System.out.print("Enter the name of the contact: ");
        String name = scanner.nextLine();
        System.out.print("Enter the phone number of the contact: ");
        String phone = scanner.nextLine();

        Contact contact = new Contact(name, phone);
        addressBook.put(name, contact);
        System.out.println("Contact added successfully.");
    }

    public void findContact() {
        System.out.print("Enter the name of the contact to search: ");
        String name = scanner.nextLine();

        if (addressBook.containsKey(name)) {
            Contact contact = addressBook.get(name);
            System.out.println("Name: " + contact.getContactName());
            System.out.println("Phone: " + contact.getPhoneNumber());
        } else {
            System.out.println("Not found");
        }
    }

    public void displayContacts() {
        System.out.println("-----Address Book-----");
        System.out.println("Contact Name\t\tPhone Number");
    
        for (String name : addressBook.keySet()) {
            Contact contact = addressBook.get(name);
            System.out.println(contact.getContactName() + "\t\t\t" + contact.getPhoneNumber());
        }
    }
}
