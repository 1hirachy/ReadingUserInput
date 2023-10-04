import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException var3) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi, " + name + ", Thanks for taking this course!");
        String datOfBirth = System.console().readLine("What year you were born? ");
        int age = currentYear - Integer.parseInt(datOfBirth);
        return "So you are " + age + " year old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Whats your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi, " + name + ", Thanks for taking this course!");
        System.out.println("What year were you born? ");
        boolean validDOB = false;
        int age = 0;

        do {
            try {
                System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear);
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            } catch (NumberFormatException var6) {
                System.out.println("Characters not allowed!! Try Again.");
            }
        } while (!validDOB);

        return "So you are " + age + " year old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        return dob >= minimumYear && dob <= currentYear ? currentYear - dob : -1;
    }
}
