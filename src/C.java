import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long R = scanner.nextLong();
        long N = scanner.nextLong();

        long value;

        if (R == 1) {
            System.out.println(A);
            System.exit(0);
        }

        if (N >= 31) {
            System.out.println("large");
            System.exit(0);
        }


        value = A * (long) Math.pow(R, N-1);

        if (value <= (long) Math.pow(10, 9)) {
            System.out.println(value);
        } else {
            System.out.println("large");
        }
    }
}
