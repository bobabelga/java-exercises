package bmiCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Person {
    private String name;
    private double weight,height;

    public Person(String name) {
        this.name = name;
    }

    private void collectData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in pounds : ");
        weight = scanner.nextDouble();
        System.out.println("Enter your height in inches : ");
        height = scanner.nextDouble();
    }
    public void calculateBMI () {
        collectData();
        double bmi = weight /Math.pow(height,2) * 703;
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        System.out.printf("Hi %s Your BMI is : " + decimalFormat.format(bmi),name);
    }
}
