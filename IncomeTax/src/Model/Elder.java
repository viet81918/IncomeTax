/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author conch
 */
public class Elder {
    int age; 
    long deduction;
    boolean gender;
    public Elder(int age, boolean gender) {
        this.age = age;
        this.gender = gender;
        if (gender && age > 55 ) this.deduction = 4400000;
        else if (!gender && age > 60 ) this.deduction = 4400000;
        else this.deduction =0;
    }

    public long getDeduction() {
        return deduction;
    }

    public void setDeduction(long deduction) {
        this.deduction = deduction;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
