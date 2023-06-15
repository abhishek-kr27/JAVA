public class copyarray {
    public static void main(String[] args) {
        
        int arr1 [] = new int[]  {13, 8,27,2,9,19, 28, 53, 45};
        int arr2 [] = new int[arr1.length];

    System.out.println(" The Array is  : ");
       for (int i=0;i<arr1.length;i++)
       System.out.print("\t" +arr1[i]);

       // COPY ARRAY
       for(int i=0 ; i<arr1.length;i++)
        arr2[i]=arr1[i];
       
       System.out.println("\n The COPY ARRAY is  : ");
       for(int i=0;i<arr2.length;i++)
       System.out.print("\t" +arr2[i]);
       
    }    

}