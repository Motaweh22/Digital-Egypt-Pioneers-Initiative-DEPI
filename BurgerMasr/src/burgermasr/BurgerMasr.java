/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burgermasr;
import java.util.Scanner;
/**
 *
 * @author Motawea M
 */
public class BurgerMasr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to BurgerMasr!");
        System.out.println("Are you a user or admin?");
        System.out.println("1. User");
        System.out.println("2. Admin");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            UserMain userMain = new UserMain();
            userMain.start();
        } else if (choice == 2) {
            AdminMain adminMain = new AdminMain();
            adminMain.start();
        } else {
            System.out.println("Invalid choice!");
        }
        scanner.close();
    }
    
}
