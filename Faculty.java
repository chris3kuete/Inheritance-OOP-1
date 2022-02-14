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
public class Faculty extends Employee {

    public String rank;
    public java.util.TimeZone time;
    
    public Faculty(String name){
        super(name);
    }
    public String toString() {
    return "the class name is "+ getClass().getName()+" person name is "+ getName();

    }
}
