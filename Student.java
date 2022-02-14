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
public class Student extends Person {
    
    private int freshman = 0;
    private int sophomore = 1;
    private int junior = 2;
    private int senior = 3;
    
    public Student(String name){
        super(name);
    }
    public String toString(){
        return "the class name is "+ getClass().getName() + " and the person name is "+getName();
    }
}
