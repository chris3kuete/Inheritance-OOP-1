/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11.pkg2;

/**
 *
 * @author sa
 */
public class Employee extends Person{
    private String office;
    private double salary;
    private java.util.Date dateHired;
    
    public Employee(String name){
        super(name);
    }
    
    public String toString(){
        return "the class name is "+ getClass().getName()+" person name is "+ getName();
    }
}
