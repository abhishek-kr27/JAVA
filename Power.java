import java.util.Scanner;

public class Power {
    public static void main(String[] args)    
    {
        int a,n,P=1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
         a =sc.nextInt();
        
        System.out.println("Enter the Power : ");
         n=sc.nextInt(); 

         for(int i=1 ; i<=n;i++)
         {
            P=a*P;
         }
        
        System.out.println("The output is : " + P);
    
    }
}