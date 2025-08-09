import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double totalBill = 0.0;
        if (units <= 100) {
            totalBill = units * 1.5;
        } else if (units <= 200) {
            totalBill = 100 * 1.5 + (units - 100) * 2.5;
        } else {
            totalBill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
        }
        totalBill += 50;
        if (totalBill > 500) {
            totalBill += totalBill * 0.18;
        }
        System.out.printf("Total Electricity Bill: ₹%.2f", totalBill);
    }
}
