
package chainofresponsibility;

/**
 *
 * @author aleksandrpasharin
 */
public final class Manager extends SalaryRaiser{
    
    public static final Manager INSTANCE = new Manager();

    private Manager() {
        super(UnitBoss.getInstance());
    }

    @Override
    boolean raiseSalaryOneself(double raise) {
        return raise <= 0.02;
    }
    
    public static Manager getInstance(){
        return INSTANCE;
    }
    
}
