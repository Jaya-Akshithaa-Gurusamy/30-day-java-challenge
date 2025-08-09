import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basePrice = 120;
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter show time (Morning/Evening/Night): ");
        String show = sc.nextLine();
        System.out.print("Are you a member? (Y/N): ");
        char isMember = sc.next().charAt(0);
        double price = basePrice;
        if (age < 12) {
            price *= 0.5;
        } else if (age > 60) {
            price *= 0.7;
        }
        if (show.equalsIgnoreCase("Evening")) {
            price += 30;
        } else if (show.equalsIgnoreCase("Night")) {
            price += 20;
        }
        if (isMember == 'Y' || isMember == 'y') {
            price *= 0.9;
        }
        System.out.printf("Final Ticket Price: ₹%.2f", price);
    }
}
