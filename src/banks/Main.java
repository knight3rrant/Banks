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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Accountant accountant = new Accountant("John", 26, "Accountant");
        Manager manager = new Manager("Doe", 39, "Manager"); 
        
        manager.setSalary(30000.00);
        accountant.setSalary(20000.00);
        manager.setBonus(10000);
        manager.showInfo();
        accountant.showInfo();
    }
    
}
