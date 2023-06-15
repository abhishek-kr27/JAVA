import java.util.Scanner;

public class Sumofnaturalnumber {
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :  ");
        int num  = sc.nextInt();
		
        int sum=0;
		for (int i =1; i <= num; i++)
		 {
			sum=sum+i;
        }
		System.out.print("The sum of first "+num+" natural number is :   " );
        System.out.print(+sum);
	  }
	 }   