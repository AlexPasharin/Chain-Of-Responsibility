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
public final class ChiefExecutive extends SalaryRaiser{
    
    public static final ChiefExecutive INSTANCE = new ChiefExecutive();

    public ChiefExecutive() {
        super(null);
    }

    @Override
    boolean raiseSalaryOneself(double raise) {
       return raise >= 0.05; 
    }
    
    public static ChiefExecutive getInstance(){
        return INSTANCE;
    }
}
