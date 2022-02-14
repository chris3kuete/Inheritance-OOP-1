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
public class Person {

    private String name ;
    private int phoneNum;
    private String email;

    public Person(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String toString(){
        return "the class name is "+ getClass().getName() + " and the person name is "+ name;
    }
}
