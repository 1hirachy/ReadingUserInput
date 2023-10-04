

import java.util.Scanner;

public class MinAndMaxNumber {
    public MinAndMaxNumber() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0.0;
        double max = 0.0;
        int loopCount = 0;

        while(true) {
            System.out.println("Enter a number, or any Character to exit:");
            String nextEntry = scanner.nextLine();

            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount != 0 && !(validNum < min)) {
                    if (loopCount == 0 || validNum > max) {
                        max = validNum;
                    }
                } else {
                    min = validNum;
                }

                ++loopCount;
            } catch (NumberFormatException var10) {
                if (loopCount > 0) {
                    System.out.println("Min = " + min + " Max = " + max);
                } else {
                    System.out.println("No valid data entered");
                }

                return;
            }
        }
    }
}
