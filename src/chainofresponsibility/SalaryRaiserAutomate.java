package chainofresponsibility;

import java.util.Scanner;

/**
 *
 * @author aleksandrpasharin
 */
public class SalaryRaiserAutomate {
    
    private final SalaryRaiser salaryRaiser = Manager.getInstance();
    
    public double raiseSalary(double salary, double raise){
        return this.salaryRaiser.handleRaise(salary, raise);
    }

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        SalaryRaiserAutomate palkkaKorotusKone = new SalaryRaiserAutomate();
        
        System.out.println("Anna nykyinen palkka");
        double salary = Double.parseDouble(lukija.nextLine());
        
        System.out.println("Anna korotus");
        double raise = Double.parseDouble(lukija.nextLine());
        
        System.out.println("Uusi palkka on " + palkkaKorotusKone.raiseSalary(salary, raise));
        
    }
    
}
