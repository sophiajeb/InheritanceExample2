/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author sophia
 */
public class InheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClassB classB = new ClassB();
        
        System.out.println("Name : " + classB.getName());
        System.out.println("Age : " + classB.getAge());
    }
    
}
