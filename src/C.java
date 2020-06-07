import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long R = scanner.nextLong();
        int N = scanner.nextInt();

        long[] a = new long[N];

        for (int i = 0; i < N; i++) {
            a[i] = A*(long)Math.pow(R,i);
        }

        if (a[N-1] <= (long)Math.pow(10,9))
            System.out.println(a[N-1]);
        else {
            System.out.println("large");
        }
    }
}
