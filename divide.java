import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the dividend: ");
            int dividend = scanner.nextInt();

            System.out.println("Enter the divisor: ");
            int divisor = scanner.nextInt();

            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
    }
}
