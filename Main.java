import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, /");
        String symbol = scanner.nextLine();

        System.out.println("Please Enter first number:");
        double number1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Please Enter second number:");
        double number2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Result:");

        switch (symbol) {

            case "+":
                System.out.printf("%s + %s = %s\n", number1, number2, number1 + number2);
                break;
            case "-":
                System.out.printf("%s - %s = %s\n", number1, number2, number1 - number2);
                break;
            case "*":
                System.out.printf("%s * %s = %s\n", number1, number2, number1 * number2);
                break;
            case "/":
                System.out.printf("%s / %s = %s\n", number1, number2, number1 / number2);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

    }
}
