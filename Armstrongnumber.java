import java.util.Scanner;
public class Armstrongnumber
{
	public static void main(String[] arg)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value  :  ");
        int start  = sc.nextInt();
        System.out.print("Enter the last value :  ");
        int last  = sc.nextInt();
        
	int i=start,a,arm,n;
	System.out.println("The Armstrong numbers between "+start+" to "+last+" are : ");
	while(i<last)   
    {
	n=i;
	arm=0;
	while(n>0)
	{
		a=n%10;
		arm=arm+(a*a*a);
		n=n/10;
	}
	if(arm==i)
		System.out.print("\t"   +i);
	i++;
	}
	}
}