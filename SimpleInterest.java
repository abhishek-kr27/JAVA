import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args)    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal : ");
        double P = sc.nextDouble();
        
        System.out.println("Enter the Rate (in %) : ");
        double R= sc.nextDouble(); 

        System.out.println("Enter the Time period (in Year)  : ");
        double T= sc.nextDouble();

        // Calculate compound interest
        double SI = (P*R*T)/ 100;
        double A = SI+ P;
        
        System.out.println("Simple Interest: " + SI);
        System.out.println("Amount: " + A);
    }
}