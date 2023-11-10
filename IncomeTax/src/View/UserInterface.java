/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Calculate;
import Model.Children;
import Model.Elder;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner sc = new Scanner(System.in);
    Calculate cal = new Calculate();

    public void run() {
        System.out.println("Insert income:");
        long income = sc.nextLong();
        ArrayList<Children> childList = cal.inputChildren();
        ArrayList<Elder> elderList = cal.inputElder();
        
        // Calculate tax and deductions
        long taxAmount = cal.calculateTax(income, childList, elderList);
        long totalDeductions = cal.calculateDeductions(childList, elderList)+ 11000000;

        System.out.println("Income: " + income + " VND");
        System.out.println("Total Deductions: " + totalDeductions + " VND");

        System.out.println("Deductions for Children:");
        for (Children child : childList) {
            System.out.println("Age: " + child.getAge() + " years, Studying: " + child.isStudying() +
                    ", Deduction: " + child.getDeduction() + " VND");
        }

        // Print deductions for elders
        System.out.println("Deductions for Elders:");
        for (Elder elder : elderList) {
            if (elder.isGender()){
            System.out.println("Age: " + elder.getAge() + " years,  Grandma "  +
                    ", Deduction: " + elder.getDeduction() + " VND");
        }   else 
        {System.out.println("Age: " + elder.getAge() + " years,  Grandpa "  +
                    ", Deduction: " + elder.getDeduction() + " VND");}

    }
        
        System.out.println("The income after tax: " + (income - taxAmount) + " VND");
}
}
