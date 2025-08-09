import java.util.Scanner;
public class Day3_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result;
        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            if (num2 != 0)
                result = num1 / num2;
            else {
                System.out.println("Error: Division by zero!");
                return;
            }
        } else {
            System.out.println("Invalid operation!");
            return;
        }
        System.out.println("Result: " + result);
    }
}
