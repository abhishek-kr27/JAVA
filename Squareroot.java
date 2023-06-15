import java.util.Scanner;

public class Squareroot {
	public static void main(String[] args) {
	 	        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :  ");
        double n =sc.nextDouble();
        
        double A = Math.pow((n),0.5);

		System.out.print("The squareroot of  "+n+"  is :   " );
        System.out.print(+A);
	  }
	 }   