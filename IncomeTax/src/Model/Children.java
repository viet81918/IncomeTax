/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author conch
 */
public class Children {
    boolean studying ;
    int age;
    long deduction ;

    public Children(boolean studying, int age) {
        this.studying = studying;
        this.age = age;
        if (age < 18) this.deduction = 4400000 ;
        else if (studying) this.deduction = 6000000;
        else if (!studying || age > 22 ) this.deduction=0;
    }
    

    public boolean isStudying() {
        return studying;
    }

    public void setStudying(boolean studying) {
        this.studying = studying;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getDeduction() {
        return deduction;
    }

    public void setDeduction(long deduction) {
        this.deduction = deduction;
    }
    
    
}
