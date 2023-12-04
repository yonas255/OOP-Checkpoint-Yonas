/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthconnect;

/**
 *
 * @author yonas
 */
public class Nutrition {

    private boolean allergies;
    private boolean vegetarian;
    private boolean vegan;
    private boolean omnivore;

    public Nutrition(boolean allergies, boolean vegetarian, boolean vegan, boolean omnivore) {
        this.allergies = allergies;
        this.vegetarian = vegetarian;
        this.vegan = vegan;
        this.omnivore = omnivore;
    }

    public boolean isAllergies() {
        return allergies;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public boolean isVegan() {
        return vegan;
    }

    public boolean isOmnivore() {
        return omnivore;
    }
}
