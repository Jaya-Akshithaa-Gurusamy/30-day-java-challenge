import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretnumber = (int) (Math.random() * 100) + 1;
        int maxattempts = 10;
        System.out.println("Number Guessing Game – Rules ");
        System.out.println("The computer will pick a random number between 1 and 100.");
        System.out.println("You have a maximum of " + maxattempts + " attempts to guess it.");
        System.out.println("After each guess, you'll be told if it's too high or too low.");
        System.out.println("If you can't guess in 5 attempts, you lose!");
        System.out.println("Tip: Use hints to narrow down your guesses.\n");
        for (int i = 1; i <= maxattempts; i++) {
            System.out.print("Attempt " + i + " - Enter your guess: ");
            int userinput = sc.nextInt();
            if (userinput > secretnumber) {
                System.out.println("Too high!");
            } else if (userinput < secretnumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! The number was " + secretnumber);
                return;
            }
            if (i == maxattempts) {
                System.out.println("Out of attempts! The correct number was " + secretnumber + ". Better luck next time!");
            }
        }
    }
}
