import java.util.Scanner;
public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nUnit Converter Menu:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Kilometers to Miles");
            System.out.println("3. Kilograms to Pounds");
            System.out.println("4. Inches to Centimeters");
            System.out.println("5. Liters to Gallons");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            double input, result;
            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    input = sc.nextDouble();
                    result = (input * 9/5) + 32;
                    System.out.printf("%.2f°C = %.2f°F\n", input, result);
                    break;
                case 2:
                    System.out.print("Enter distance in Kilometers: ");
                    input = sc.nextDouble();
                    result = input * 0.621371;
                    System.out.printf("%.2f km = %.2f miles\n", input, result);
                    break;
                case 3:
                    System.out.print("Enter weight in Kilograms: ");
                    input = sc.nextDouble();
                    result = input * 2.20462;
                    System.out.printf("%.2f kg = %.2f lbs\n", input, result);
                    break;
                case 4:
                    System.out.print("Enter length in Inches: ");
                    input = sc.nextDouble();
                    result = input * 2.54;
                    System.out.printf("%.2f inches = %.2f cm\n", input, result);
                    break;
                case 5:
                    System.out.print("Enter volume in Liters: ");
                    input = sc.nextDouble();
                    result = input * 0.264172;
                    System.out.printf("%.2f L = %.2f gallons\n", input, result);
                    break;
                case 6:
                    System.out.println("Thank you for using the Unit Converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
}
