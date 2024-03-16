import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInt;
        double favDouble;

        favInt = SafeInput.getInt(in,"Enter your favourite integer");
        favDouble = SafeInput.getDouble(in,"Enter your favourite double");

        System.out.println("My favourite integer is " + favInt + " and my favourite double is " + favDouble);
    }
}
