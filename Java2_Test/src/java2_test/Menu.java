/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2_test;

import java.util.Scanner;

/**
 *
 * @author Giang8692
 */
public class Menu {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nAddress Book");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1 -> {
                    String response;
                    do{
                        phoneBook.addContact();
                        do {
                            System.out.print("Do you want to add another number? (Y/N) ");
                            response = scanner.nextLine();
                        } while (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N"));
                        if (!response.equalsIgnoreCase("Y")) {
                            break;
                        }
                    }while(response.equalsIgnoreCase("Y"));
                }
                case 2 -> {
                    String response;
                    do{
                        phoneBook.findContact();
                        do {
                            System.out.print("Do you want to find another number? (Y/N) ");
                            response = scanner.nextLine();
                        } while (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N"));
                        if (!response.equalsIgnoreCase("Y")) {
                            break;
                        }
                    }while(response.equalsIgnoreCase("Y"));
                }
                case 3 -> phoneBook.displayContacts();
                case 4 -> System.out.println("Exiting... Good bye!");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
      
    

   
}
