public class evenposition {
    public static void main(String[] args) {
        
        int[] arr = {13, 8,27,2,9,19, 28, 53, 45};

    System.out.println(" The Array are  : ");
       for (int i=0;i<arr.length;i++)
       System.out.print("\t" +arr[i]);

       // EVEN POSITION
       System.out.println("\n The even elements of array are  : ");
       for(int i=1 ; i<arr.length;i=i+2)
       System.out.print("\t" +arr[i]);
    
    }    

}