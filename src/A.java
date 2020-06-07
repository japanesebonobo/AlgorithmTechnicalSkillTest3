import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String output = scanner.next();

        if (input.equals(output)) {
            System.out.println("same");
        } else if (input.equalsIgnoreCase(output)) {
            System.out.println("case-insensitive");
        } else {
            System.out.println("different");
        }
    }
}
