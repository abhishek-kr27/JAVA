public class Averageofnumber {
    public static void main(String[] args) {
        int[] numbers = {95, 82, 77, 79, 90};
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("The sum is  : " + sum);

        int length = numbers.length;
        System.out.println("Length of a numbers is : " + length);

        double average = (double) sum / numbers.length;
        
        System.out.println("The Average of a number is : " + average);
    }
}
