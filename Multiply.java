import java.util.Scanner;
class Multiply
{
	public static void main(String arg[])	
	{
	    int num1, num2,mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        num1 =sc.nextInt();

        System.out.println("Enter the Second  Number : ");
        num2=sc.nextInt();

        mul = num1*num2;
        System.out.println("Multiplication of two numbers is : "+mul);

    }
}