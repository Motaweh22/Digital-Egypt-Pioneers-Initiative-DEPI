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

public class Menu {
    private List<Sandwich> sandwiches = new ArrayList<>();

    public Menu() {
        sandwiches.add(new BeefBurger());
        sandwiches.add(new ChickenBurger());
        sandwiches.add(new CheeseBurger());
    }

    public void showMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < sandwiches.size(); i++) {
            System.out.println((i + 1) + ". " + sandwiches.get(i).getName() + " - $" + sandwiches.get(i).getPrice());
        }
    }

    public Sandwich getSandwich(int index) {
        return sandwiches.get(index - 1);
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }
}

