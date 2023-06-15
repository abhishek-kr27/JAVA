import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args)    
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of times interest is compounded per year:: ");
        n=sc.nextInt();
        
        System.out.println("Enter the Principal : ");
        double P =sc.nextDouble();
        
        System.out.println("Enter the Rate (in %) : ");
        double R=sc.nextDouble(); 

        System.out.println("Enter the Time period (in Year)  : ");
        double T=sc.nextDouble();

        // Calculate compound interest
        double A = P* Math.pow((1+ (R/(n*100))), (n*T));
        double CI = A - P;
        
        System.out.println("Compound Interest: " + CI);
        System.out.println("Amount: " + A);
    }
}