public class rightrotates {
    public static void main(String[] args) {
        int[] arr = {13, 8,27,2,9};
        int n=1; // How many position to  right rotates
        
        System.out.println("Original Array:");
        for (int number : arr) {
            System.out.print(number + "    ");
        } 
        
        for(int i=0;i<n;i++)
        {
            int last =arr[arr.length - 1];
            for ( int j = arr.length - 1; j>0; j--) 
            {
                arr[j] = arr[j - 1];
            }
            arr[0]=last;
        
        }
        System.out.println("\nThe result after right rotates is :");
        for(int i=0;i<arr.length;i++)
        System.out.print("\t" +arr[i]  );
        }
    }