import java.util.Arrays;

public class Arraysort {
    public static void main(String[] args) {
        int[] arr = {13, 8,27,2,9};
        
        System.out.println("Original Array:");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        
        Arrays.sort(arr);
        
        System.out.println("\nSorted Array in Ascending Order:");
        for (int number : arr) {
            System.out.print(number + " ");
        }
    }
}
