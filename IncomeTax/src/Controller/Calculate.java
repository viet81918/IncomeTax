/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Children;
import Model.Dependent;
import Model.Elder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author conch
 */
public class Calculate {

    Scanner sc = new Scanner(System.in);

    public ArrayList<Children> inputChildren() {
        ArrayList<Children> arr = new ArrayList<>();
        System.out.println("Input number of children :");
        int children = sc.nextInt();

        for (int i = 0; i < children; i++) {
            System.out.println("Input age :");
            int age = sc.nextInt();
       
            System.out.println("Studying : (Yes / No)");
            boolean studying = sc.nextBoolean();
            arr.add(new Children(studying, age));
        }
        return arr;
    }

    public ArrayList<Elder> inputElder() {
        ArrayList<Elder> arr = new ArrayList<>();
        for (int i = 0; i <= 1; i++) {
            System.out.println("Input age of Elder :");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Gender : (True for Grandma / False for Grandpa)");
            boolean gender = sc.nextBoolean();
            arr.add(new Elder(age, gender));
        }
        return arr;
    }

    public long calculateTax(long totalIncome, ArrayList<Children> childrenList, ArrayList<Elder> elderList) {
        long totalDeduction = calculateDeductions(childrenList, elderList) ;
        long taxableIncome = totalIncome - totalDeduction - 11000000;
        long taxAmount;
        if (taxableIncome <= 11000000) {
            taxAmount = (long) 0.0;
        } else if ( taxableIncome <= 17000000) {
            taxAmount = (long) (taxableIncome  * 0.05);
        } else if (taxableIncome <= 21000000) {
            taxAmount = (long) ((taxableIncome ) * 0.1);
        } else {
            taxAmount = (long)((taxableIncome ) * 0.2);
        }
        return taxAmount;
    }

    public long calculateDeductions(ArrayList<Children> childrenList, ArrayList<Elder> elderList) {
        long totalDeduction = (long) 0.0;
        // Sort the childrenList by deduction amount in descending order
        childrenList.sort(Comparator.comparing(Children::getDeduction).reversed());
        // Calculate deductions for children (up to 2 children)
        for (int i = 0; i < Math.min(childrenList.size(), 2); i++) {
            totalDeduction += childrenList.get(i).getDeduction();
        }

        // Calculate deductions for elders
        for (Elder elder : elderList) {
            totalDeduction += elder.getDeduction();
        }

        return totalDeduction;
    }

}
