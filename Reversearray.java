public class Reversearray {
    public static void main(String[] args) {
        int[] arr = {13, 8,27,2,9};
        
        System.out.println("Original Array:");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        
        System.out.println("\nReversed Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
