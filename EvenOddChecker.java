import java.util.Scanner;

public class EvenOddChecker {

    public static int getIntegerInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        return integer;
    }

    public static String checkEvenOrOdd(int integer) {
        if (integer % 2 == 0) {
            return integer + " is an Even number.";
        } else {
            return integer + " is an Odd number.";
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            int userInput = getIntegerInput();
            String result = checkEvenOrOdd(userInput);
            System.out.println(result);
            if (i == 0) {
                System.out.println();
            }
        }
    }
}