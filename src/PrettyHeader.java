public class PrettyHeader {
    public static void prettyHeader(String msg) {

        int totalWidth = 60;
        int msgWidth = msg.length();

        if (msgWidth >= totalWidth - 6) {
            System.out.println("Message is too long to fit in the header.");
            return;
        }

        int sideStars = (totalWidth - msgWidth - 6) / 2;

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }

        System.out.println();

        System.out.print("***");
        for (int i = 0; i < sideStars; i++) {
            System.out.print(" ");
        }

        System.out.print(msg);
        for (int i = 0; i < sideStars; i++) {
            System.out.print(" ");
        }

        if ((msgWidth % 2) == 1) {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        prettyHeader("Message Centered Here ");
    }
}

