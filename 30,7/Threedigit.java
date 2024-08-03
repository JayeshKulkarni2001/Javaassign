import java.util.Scanner;
public class Threedigit {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        int sum = hundreds + tens + units;
        System.out.println("Sum of the digits: " + sum);
    }
}