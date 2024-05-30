import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.println("Calculator");
        while (true) {
        try {
            System.out.print("Enter first number: ");
            number1 = sc.nextInt();
            System.out.print("Enter second number: ");
            number2 = sc.nextInt();

            sum = number1 + number2;

            System.out.println("Result: " + sum);

            break;
        } catch (InputMismatchException e) {
            System.out.println("Only numbers!");
            sc.nextLine();
        }
        }
    }
}
