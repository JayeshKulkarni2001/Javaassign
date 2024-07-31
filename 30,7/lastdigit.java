import java.util.Scanner;

public class lastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int number = sc.nextInt();
        sc.close();
        if (number < 10000 || number > 99999) {
            System.out.println("invalid");
            return;
        }
        int firstDigit = number / 10000;
        int secondLastDigit = (number / 10) % 10;
        int sum = firstDigit + secondLastDigit;
        System.out.println(sum);
    }
}
