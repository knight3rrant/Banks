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
public class Manager extends Worker{
    
    
    public Manager(String n, int a, String d) {
        super(n, a, d);
       
    }

    public void setBonus (double b) {
        bonus = b;
        salary+=bonus;
        
    }
    
}
