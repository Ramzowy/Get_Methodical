import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        boolean done = false;
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;

        System.out.println("Welcome to the $10 Store!");

        do {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item ", 0.5,10);
            totalCost = totalCost + itemPrice;

            done = SafeInput.getYNConfirm(in, "Are you done? " );

        } while (!done);
        System.out.printf("Total cost: $%.2f%n", totalCost);
    }

}

