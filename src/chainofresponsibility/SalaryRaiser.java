/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author aleksandrpasharin
 */
abstract class SalaryRaiser {
    
    private final SalaryRaiser successor;
    
    protected SalaryRaiser(SalaryRaiser sr){
        this.successor = sr;
    }
    
    public final double handleRaise(double salary, double raise){
        if(raiseSalaryOneself(raise))
            return salary * (1 + raise);
        else 
            return successor.handleRaise(salary, raise);
    }
    
    abstract boolean raiseSalaryOneself(double raise);
    
}
