import java.util.Scanner;

public class ValidNumbers {
    public ValidNumbers() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0.0;

        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();

            try {
                double number = Double.parseDouble(nextNumber);
                ++counter;
                sum += number;
            } catch (NumberFormatException var8) {
                System.out.println("Invalid Number!");
            }
        }

        System.out.println("The sum of the 5 numbers = " + sum);
    }
}
