/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banks;

/**
 *
 * @author knight
 */
public class Worker {

    protected String name;
    protected int age;
    protected String designation;
    protected String branch;
    protected double salary =0;
    protected double bonus=0;
    public Worker(String n, int a, String d) {
        name = n;
        age = a;
        designation = d;
        
    }

    public void setSalary(double s) {
        salary = s;
    }
    
    public void showInfo(){
        System.out.println("\n\nName: "+name+"\nAge: "+age+"\nDesignation: "+designation+"\nSalary: "+salary+"\nBonus: "+bonus);
    }
}
