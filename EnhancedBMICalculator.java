import java.util.Scanner;
/*
 * MIT License
 * Copyright (c) 2024 Purohit1999
 */


/**
 * A professional and enhanced BMI Calculator.
 * This program calculates the Body Mass Index (BMI) based on user input for weight and height.
 * It also provides health suggestions based on BMI category.
 */
public class EnhancedBMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Enhanced BMI Calculator!");
        System.out.println("---------------------------------------");

        // Prompting the user for input
        System.out.print("Enter your weight in kilograms (e.g., 70.5): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();

        // Calculating BMI
        double bmi = calculateBMI(weight, height);
        String bmiCategory = getBMICategory(bmi);

        // Displaying the results
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Category: " + bmiCategory);

        // Providing health suggestions
        System.out.println("Health Suggestion: " + getHealthSuggestion(bmiCategory));

        // Closing scanner
        scanner.close();

        // Ending message
        System.out.println("---------------------------------------");
        System.out.println("Thank you for using the Enhanced BMI Calculator!");
    }

    /**
     * Calculates the Body Mass Index (BMI).
     *
     * @param weight Weight in kilograms
     * @param height Height in meters
     * @return Calculated BMI
     */
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    /**
     * Determines the BMI category based on the BMI value.
     *
     * @param bmi Calculated BMI
     * @return BMI category as a string
     */
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    /**
     * Provides health suggestions based on the BMI category.
     *
     * @param category BMI category
     * @return Health suggestion as a string
     */
    public static String getHealthSuggestion(String category) {
        switch (category) {
            case "Underweight":
                return "Consider a balanced diet with more calories to reach a healthier weight.";
            case "Normal weight":
                return "Great job! Maintain your healthy lifestyle.";
            case "Overweight":
                return "Incorporate regular exercise and a balanced diet to shed excess weight.";
            case "Obese":
                return "Consult a healthcare provider for a tailored weight management plan.";
            default:
                return "No suggestions available.";
        }
    }
}

