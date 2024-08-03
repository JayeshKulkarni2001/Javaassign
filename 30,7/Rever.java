import java.util.Scanner;
public class Rever{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        int reversedNumber = (units * 100) + (tens * 10) + hundreds;
        System.out.println("Reversed number: " + reversedNumber);
        sc.close();
    }
}
