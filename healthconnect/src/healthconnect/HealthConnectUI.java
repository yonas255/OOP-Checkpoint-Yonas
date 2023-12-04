/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package healthconnect;
import java.util.Scanner;
/**
 *
 * @author yonas
 */
public class HealthConnectUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for health characteristics
        System.out.print("Enter gender (Male/Female): ");
        String gender = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter height (in cm): ");
        double height = scanner.nextDouble();

        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();

        // Create a Health object
        Health person = new Health(gender, age, height, weight);

        // Display health information
        System.out.println("\nHealth Information:");
        System.out.println("Gender: " + person.getGender());
        System.out.println("Age: " + person.getAge());
        System.out.println("Height: " + person.getHeight());
        System.out.println("Weight: " + person.getWeight());

        // Create an Exercise object
        Exercise exercise = new Exercise("Evening", "Moderate");

        // Display exercise information
        System.out.println("\nExercise Information:");
        System.out.println("Free Time: " + exercise.getFreeTime());
        System.out.println("Activity Level: " + exercise.getActivityLevel());

        // Create a Nutrition object
        Nutrition nutrition = new Nutrition(true, false, false, true);

        // Display nutrition information
        System.out.println("\nNutrition Information:");
        System.out.println("Allergies: " + nutrition.isAllergies());
        System.out.println("Vegetarian: " + nutrition.isVegetarian());
        System.out.println("Vegan: " + nutrition.isVegan());
        System.out.println("Omnivore: " + nutrition.isOmnivore());

        // Add exercise and nutrition recommendations
        person.addExerciseRecommendation("Cardio exercises");
        person.addNutritionRecommendation("Include more fruits and vegetables");

        // Display personalized recommendations
        System.out.println("\nPersonalized Health Recommendations:");
        System.out.println("Exercise Recommendations: " + person.getExerciseRecommendations());
        System.out.println("Nutrition Recommendations: " + person.getNutritionRecommendations());
    }
}

    
    

