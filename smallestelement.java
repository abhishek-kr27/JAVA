public class smallestelement{
    public static void main(String[] args) {
        
        int[] arr = {13, 8,27,2,9,19, 28, 53, 45};

    System.out.println(" The Array are  : ");
       for (int i=0;i<arr.length;i++)
       System.out.print("\t" +arr[i]);

       // LARGEST ELEMENT
       System.out.println("\n The smallest elements of array is  : ");
       int smallest = arr[0];
       for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.print("\t" +smallest);   
    }    
}