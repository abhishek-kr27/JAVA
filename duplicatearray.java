public class duplicatearray {
    public static void main(String[] args) {
        
        int[] arr = {27, 8,27,2,9,19, 8, 53, 2};

        System.out.println("\n The Array are  : ");
        for (int i=0;i<arr.length;i++)
        System.out.print("\t" +arr[i]);

       // Duplicate Element
       System.out.println("\n The duplicate elements of array are  : ");
       for(int i=0 ; i<arr.length;i++)
       {
        for(int j=i+1 ; j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                System.out.println(arr[j]);
            }
        }
       }    
    }    
}