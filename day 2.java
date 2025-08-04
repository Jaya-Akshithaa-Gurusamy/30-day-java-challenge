import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of the item: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter GST percentage: ");
        double gstPercentage = sc.nextDouble();
        System.out.print("Enter service charge percentage: ");
        double servicePercentage = sc.nextDouble();
        System.out.print("Are you a member? (Y/N): ");
        char memberInput = sc.next().charAt(0);
        boolean isMember = (memberInput == 'Y' || memberInput == 'y');
        double subtotal = price * quantity;
        double gstAmount = (gstPercentage / 100.0) * subtotal;
        double serviceCharge = (servicePercentage / 100.0) * subtotal;
        double totalBeforeDiscount = subtotal + gstAmount + serviceCharge;
        double discount = 0;
        if (subtotal > 200 && isMember) 
            discount = 20; 
        double finalBill = totalBeforeDiscount - discount;
        if (quantity >= 5 || subtotal >= 300) 
            System.out.println("🎉 You’re eligible for a free dessert!");
        System.out.printf("Final Bill Amount: ₹%.2f\n", finalBill);
    }
}
