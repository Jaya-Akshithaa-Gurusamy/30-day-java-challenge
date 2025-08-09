import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double baseAmount = 0.0;
        double tax = 0.0;
        double fixedCharge = 50;
        System.out.println("\n--- BILL BREAKDOWN ---");
        if (units <= 100) {
            baseAmount = units * 1.5;
            System.out.println("Units (" + units + ") x ₹1.5 = ₹" + (units * 1.5));
        } else if (units <= 200) {
            baseAmount = 100 * 1.5 + (units - 100) * 2.5;
            System.out.println("First 100 units x ₹1.5 = ₹150.0");
            System.out.println("Next " + (units - 100) + " units x ₹2.5 = ₹" + ((units - 100) * 2.5));
        } else {
            baseAmount = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
            System.out.println("First 100 units x ₹1.5 = ₹150.0");
            System.out.println("Next 100 units x ₹2.5 = ₹250.0");
            System.out.println("Remaining " + (units - 200) + " units x ₹4.0 = ₹" + ((units - 200) * 4.0));
        }
        System.out.println("Fixed meter charge = ₹" + fixedCharge);
        double totalBeforeTax = baseAmount + fixedCharge;
        if (totalBeforeTax > 500) {
            tax = totalBeforeTax * 0.18;
            System.out.println("Tax (18%) = ₹" + String.format("%.2f", tax));
        }
        double finalBill = totalBeforeTax + tax;
        System.out.printf("\nTotal Electricity Bill = ₹%.2f\n", finalBill);
    }
}
