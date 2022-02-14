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
public class Exercise112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n ="Chris";
        
       Person p = new Person(n);
       Student s = new Student(n);
       Employee e = new Employee(n);
       Faculty f = new Faculty(n);
       Staff st = new Staff(n);
       
        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(st.toString());
    }
    
}
