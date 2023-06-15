public class sum {
    public static void main(String[] args) {
        int[] numbers = {95, 82, 77, 79, 90};
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("The sum of element of an Array is  : " + sum);
    }
}
