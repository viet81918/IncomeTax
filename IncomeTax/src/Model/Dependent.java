/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author conch
 */
public class Dependent {
   Elder grandpa;
   Elder grandma;
   Children child1 ;
   Children child2;
   double income;
   double tax;
   double deduction = 11000000 ;

    public Dependent() {
    }
   
    public Dependent(Elder grandpa, Elder grandma, Children child1, Children child2, double income) {
        this.grandpa = grandpa;
        this.grandma = grandma;
        this.deduction += grandpa.deduction;
          this.deduction += grandma.deduction;
        this.child1 = child1;
        this.child2 = child2;
        this.deduction += child1.getDeduction();
        this.deduction += child2.getDeduction();
        this.income = income;
    }

    public Elder getGrandpa() {
        return grandpa;
    }

    public void setGrandpa(Elder grandpa) {
        this.grandpa = grandpa;
    }

    public Elder getGrandma() {
        return grandma;
    }

    public void setGrandma(Elder grandma) {
        this.grandma = grandma;
    }

    public Children getChild1() {
        return child1;
    }

    public void setChild1(Children child1) {
        this.child1 = child1;
    }

    public Children getChild2() {
        return child2;
    }

    public void setChild2(Children child2) {
        this.child2 = child2;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
   
}
