import java.util.Scanner;

public class Qtoquit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (press 'q' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equals("q")) {
                break;
            }
            try{
            int number = Integer.parseInt(input);
            sum = sum+number;
            product = product * number;
            count++;
            } 
            catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
    }

    if (count > 0) {
        double average = (double) sum / count;
        System.out.println("Average of the numbers: " + average);
        System.out.println("Product of the numbers: " + product);
    } else {
        System.out.println("No numbers were entered.");
    }
    scanner.close();
    }
}