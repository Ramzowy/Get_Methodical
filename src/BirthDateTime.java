import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year (1950-2010): ", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month (1-12): ", 1, 12);
        int max = switch (birthMonth)
        {
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 31;
        };

        int birthDay = SafeInput.getRangedInt(in, "Enter your birth day (1-" + max + "): ", 1, max);
        int hours = SafeInput.getRangedInt(in, "Enter your birth hours (1-24): ", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter your birth minutes (1-59): ", 1, 59);

        System.out.println("Your Birth Year is: " + birthYear);
        System.out.println("Your Birth Month is: " + birthMonth);
        System.out.println("Your Birth Day is: " + birthDay);
        System.out.println("Your Birth Hour is: " + hours);
        System.out.println("Your Birth Minute is: " + minutes);
    }
}
