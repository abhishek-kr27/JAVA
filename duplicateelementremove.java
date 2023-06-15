public class duplicateelementremove {
    public static void main(String[] args) {
        
        int[] arr = {27, 8,27,2,9,19, 8, 53, 2};
        System.out.println("\n The Array is   : ");
        for (int i=0;i<arr.length;i++)
        System.out.print("\t" +arr[i]);

       // Duplicate Element
       for(int i=0 ; i<arr.length; i++)
       {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                arr[i]=-1;
            }
        }
        }
               System.out.println("\n After removing duplicate elements the  array is   : ");
               for(int i=0;i<arr.length;i++)
               if(arr[i]!=-1)
               {
                System.out.print("\t" +arr[i]);
               }
       }    
    }    