import java.util.Scanner;

public class thing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of matrix");
        int n = sc.nextInt();
        int[][] m1 = new int[n][n];
        int[][] m2 = new int[n][n];
        int[][] s = new int[n][n];

        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                int k = n;
                s[i][j] = 0;
                while (k > 0) {
                    s[i][j] += m1[i][k - 1] * m2[k - 1][j];
                    k--;
                }
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println(s[i][j]);
            }
        }

    }
}