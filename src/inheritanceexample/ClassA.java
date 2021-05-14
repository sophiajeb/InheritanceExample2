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
public class ClassA {
    
    private String name = "George";
    
    private String Age = "38";
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "ClassA{" + "name=" + name + ", Age=" + Age + '}';
    }
    
    
}
