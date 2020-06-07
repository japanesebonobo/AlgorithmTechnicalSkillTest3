import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        int Q = Integer.parseInt(scanner.next());

        int[] score = new int[M];
        Arrays.fill(score,N);

        int[][] answerFlag = new int[N][M];

        int[] totalScore = new int[N];

        int[] n = new int[Q];
        int[] m = new int[Q];

        for (int i = 0; i < Q; i++) {
            int flag = Integer.parseInt(scanner.next());
            if (flag == 1) {
                n[i] = Integer.parseInt(scanner.next());
                m[i] = 0;
            } else {
                n[i] = Integer.parseInt(scanner.next());
                m[i] = Integer.parseInt(scanner.next());
            }
        }

        for (int i = 0; i < Q; i++) {
            if (m[i] >= 1) {
                score[m[i]-1] -= 1;
                answerFlag[n[i]-1][m[i]-1] = 1;
                totalScore[n[i]-1] += score[m[i]-1];
                for (int j = 0; j < N; j++) {
                    if (answerFlag[j][m[i]-1] == 1 && j != n[i]-1) {
                        totalScore[j] -= 1;
                    }
                }
            } else {
                System.out.println(totalScore[n[i]-1]);
            }
        }
    }
}
