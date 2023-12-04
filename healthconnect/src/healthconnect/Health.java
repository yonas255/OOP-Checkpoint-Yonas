/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthconnect;
import java.util.ArrayList;
/**
 *
 * @author yonas
 */
public class Health {

    private String gender;
    private int age;
    private double weight;
    private double height;
    private ArrayList<String> exerciseRecommendations;
    private ArrayList<String> nutritionRecommendations;

    public Health(String gender, int age, double weight, double height) {
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.exerciseRecommendations = new ArrayList<>();
        this.nutritionRecommendations = new ArrayList<>();
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void addExerciseRecommendation(String recommendation) {
        exerciseRecommendations.add(recommendation);
    }

    public void addNutritionRecommendation(String recommendation) {
        nutritionRecommendations.add(recommendation);
    }

    public ArrayList<String> getExerciseRecommendations() {
        return exerciseRecommendations;
    }

    public ArrayList<String> getNutritionRecommendations() {
        return nutritionRecommendations;
    }
}
