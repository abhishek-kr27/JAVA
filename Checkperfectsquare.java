import java.util.Scanner;

public class Checkperfectsquare {
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :  ");
        int num  = sc.nextInt();
		
		int count=0;
		for (int i = 1; i <= num; i++)
		 {
				if (i*i == num) {
					count++;
	   }
	  }  
	  if (count == 1)
		System.out.print(num+ " is a perfect square. ");
	  else
	    System.out.print(num+ " is  not a perfect square.");
	  }
	 }   