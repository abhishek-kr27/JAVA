public class largestelement{
    public static void main(String[] args) {
        
        int[] arr = {13, 8,27,2,9,19, 28, 53, 45};

    System.out.println(" The Array are  : ");
       for (int i=0;i<arr.length;i++)
       System.out.print("\t" +arr[i]);

       // LARGEST ELEMENT
       System.out.println("\n The largest elements of array is  : ");
       int largest = arr[0];
       for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.print("\t" +largest);   
    }    
}