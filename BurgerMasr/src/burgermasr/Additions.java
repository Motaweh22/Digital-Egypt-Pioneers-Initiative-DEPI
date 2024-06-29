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

public class Additions {
    private List<Addition> additions = new ArrayList<>();

    public Additions() {
        additions.add(new Addition("Ketchup", 5));
        additions.add(new Addition("Mayonnaise", 10));
        additions.add(new Addition("Tomatoes", 5));
        additions.add(new Addition("Cheese", 10));
    }

    public void showAdditions() {
        System.out.println("Additions:");
        for (int i = 0; i < additions.size(); i++) {
            System.out.println((i + 1) + ". " + additions.get(i).getName() + " - $" + additions.get(i).getPrice());
        }
    }

    public Addition getAddition(int index) {
        return additions.get(index - 1);
    }

    public void addAddition(Addition addition) {
        additions.add(addition);
    }
}

