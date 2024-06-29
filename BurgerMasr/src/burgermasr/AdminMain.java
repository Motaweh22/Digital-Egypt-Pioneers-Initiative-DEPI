/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgermasr;

/**
 *
 * @author Motawea M
 */
import java.util.Scanner;

public class AdminMain {
    private Menu menu = new Menu();
    private Additions additions = new Additions();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Admin Menu:");
        System.out.println("1. View Menu");
        System.out.println("2. View Additions");
        System.out.println("3. Add New Item to Menu");
        System.out.println("4. Add New Addition");
        
        int option = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        switch (option) {
            case 1:
                menu.showMenu();
                break;
            case 2:
                additions.showAdditions();
                break;
            case 3:
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println("Enter price:");
                double price = scanner.nextDouble();
                menu.addSandwich(new CustomSandwich(name, price));
                break;
            case 4:
                System.out.println("Enter name:");
                String addName = scanner.nextLine();
                System.out.println("Enter price:");
                double addPrice = scanner.nextDouble();
                additions.addAddition(new Addition(addName, addPrice));
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
    }
}

