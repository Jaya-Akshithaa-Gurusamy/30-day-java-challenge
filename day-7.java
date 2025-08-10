import java.util.Scanner;

public class Day7BankSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double balance = 5000.0; 
        int choice;
        
        System.out.println("Welcome to Java Bank!");

        do {
            // Display menu
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: 
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful! New balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;
                    
                case 2: 
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful! New balance: ₹" + balance);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        System.out.println("Invalid withdrawal amount!");
                    }
                    break;
                    
                case 3: 
                    System.out.println("Your current balance is: ₹" + balance);
                    break;
                    
                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while (choice != 4);
        
        sc.close();
    }
}
