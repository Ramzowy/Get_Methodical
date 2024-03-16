import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(scanner, "\\d{3}-\\d{2}-\\d{4}", "Enter your SSN (e.g., 123-45-6789): ");
        System.out.println("You entered SSN: " + ssn);

        String studentMNumber = SafeInput.getRegExString(scanner, "(M|m)\\d{8}", "Enter your UC Student M number (e.g., M12345678): ");
        System.out.println("You entered UC Student M number: " + studentMNumber);

        String menuChoice = SafeInput.getRegExString(scanner, "[OoSsVvQq]", "Enter a menu choice (O for Open, S for Save, V for View, Q for Quit): ");
        System.out.println("You selected menu choice: " + menuChoice);





    }


}

