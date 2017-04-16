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
public final class UnitBoss extends SalaryRaiser{
    
    public static final UnitBoss INSTANCE = new UnitBoss();

    private UnitBoss() {
        super(ChiefExecutive.getInstance());
    }

    @Override
    boolean raiseSalaryOneself(double raise) {
        return raise > 0.02 && raise < 0.05;
    }
    
    public static UnitBoss getInstance(){
        return INSTANCE;
    }
    
}
