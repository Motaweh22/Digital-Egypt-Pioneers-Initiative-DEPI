/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgermasr;

/**
 *
 * @author Motawea M
 */
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Sandwich sandwich;
    private List<Addition> additions = new ArrayList<>();

    public Order(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public void addAddition(Addition addition) {
        additions.add(addition);
    }

    public void printOrder() {
        System.out.println(sandwich.getName());
        for (Addition addition : additions) {
            System.out.println(addition.getName());
        }
    }

    public void printReceipt() {
        double total = sandwich.getPrice();
        System.out.println("Receipt:");
        System.out.println("1 " + sandwich.getName() + " $" + sandwich.getPrice());
        for (Addition addition : additions) {
            total += addition.getPrice();
            System.out.println("1 " + addition.getName() + " $" + addition.getPrice());
        }
        System.out.println("Total $" + total);
    }
}

