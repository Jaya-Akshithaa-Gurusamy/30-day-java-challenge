import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the price of the product: ");
        double price = sc.nextDouble();
        
        System.out.print("Enter the discount for the product: ");
        int disper = sc.nextInt();
        
        System.out.print("Enter the tax for the product: ");
        int taxper = sc.nextInt();
        
        double disval = (disper / 100.0) * price;
        double taxval = (taxper / 100.0) * (price - disval);
        double finalval = (price - disval) + taxval;
        
        System.out.printf("The final price of the product is ₹%.2f", finalval);
    }
}
