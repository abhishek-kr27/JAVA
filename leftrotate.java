public class leftrotate {
    public static void main(String[] args) {
        int[] arr = {13, 8,27,2,9};
        int n=1; // How many position to  left rotates
        
        System.out.println("Original Array:");
        for (int number : arr) {
            System.out.print(number + "    ");
        } 
        
        for(int i=0;i<n;i++)
        {
            int first =arr[0], j=0;
            for ( j =0; j < arr.length - 1; j++) 
            {
                arr[j] = arr[j + 1];
            }
            arr[j]=first;
        
        }
        System.out.println("\nThe result after left rotates is :");
        for(int i=0;i<arr.length;i++)
        System.out.print("\t" +arr[i]  );
        }
    }