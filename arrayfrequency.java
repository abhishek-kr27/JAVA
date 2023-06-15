public class arrayfrequency {
    public static void main(String[] args) {
        
        int[] arr = {10,5,8,9,10,10,5,20,20};

    System.out.println(" The Array are  : ");
       for (int i=0;i<arr.length;i++)
       System.out.print("\t" +arr[i]);

       // Frequency of Element
       System.out.println("\n The frequency of an elements given below: ");
       for(int i=0 ; i<arr.length;i++){
        int x =arr[i];
        int count=0;
        if(x==-1)continue;
        
        for(int j=0;j<arr.length;j++){
            if(arr[j]==x)
            {
                count++;
                arr[j]=-1;
            }
        }
        System.out.println("Frequency of "+x+" is "+count);
       }    
    }    
}