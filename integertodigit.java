import java.util.Scanner;
public class integertodigit
{
	public static void main(String[] arg)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer  :  ");
        int num  = sc.nextInt();

		while(num!=0){
            System.out.print("The digit is   :  ");
			System.out.println(num%10);
			num=num / 10;
		}
	}
}