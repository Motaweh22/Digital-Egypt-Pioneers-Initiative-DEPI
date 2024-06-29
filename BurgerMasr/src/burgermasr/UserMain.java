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

public class UserMain {
    private Menu menu = new Menu();
    private Additions additions = new Additions();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our restaurant");
        menu.showMenu();

        System.out.println("Please select option:");
        int option = scanner.nextInt();

        System.out.println("Do you like to add any additions?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int addOption = scanner.nextInt();

        Order order = new Order(menu.getSandwich(option));
        if (addOption == 1) {
            additions.showAdditions();
            System.out.println("Please select options (like this 1,2):");
            scanner.nextLine(); // consume newline
            String[] additionOptions = scanner.nextLine().split(",");
            for (String add : additionOptions) {
                order.addAddition(additions.getAddition(Integer.parseInt(add.trim())));
            }
        }

        System.out.println("Your order is:");
        order.printOrder();

        System.out.println("1. Confirm");
        System.out.println("2. Back to Menu");
        int confirmOption = scanner.nextInt();

        if (confirmOption == 1) {
            order.printReceipt();
        } else {
            start();
        }
    }
}

