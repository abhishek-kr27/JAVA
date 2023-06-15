import java.util.Scanner;

public class AlternatePrime {
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
        System.out.print("Alternate Prime no. between 1 to  ");
        int num  = sc.nextInt();
			
        // Alternate prime number
        int count,position=0; 
		for (int i = 2; i <= num; i++)
		 {
			count=0;
			for (int j = 2; j <= i / 2; j++){
				if (i % j == 0)  {
					count++;
					break;
                }
	         }  
	             if (count == 0) {
                    if (position%2==0)
                    System.out.print("\t" +i);
                    position++;
                }
	 }
	}
}