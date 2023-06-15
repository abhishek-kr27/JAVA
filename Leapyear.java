import java.util.Scanner;
class Leapyear
{
	public static void main(String arg[])	
	{
	    int year;
        System.out.println("Enter the Year : ");
        Scanner sc = new Scanner(System.in);
        year=sc.nextInt();

        if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
        {
            System.out.println("This Year is Leap Year ");
        }

        else{
            System.out.println("This year not Leap Year");
        }

    }
}