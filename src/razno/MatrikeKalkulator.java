import java.util.Scanner;

public class MatrikeKalkulator {
    public static void vpisMatrike(int[][] M, char ime, Scanner sc) {
        char imeUpper = Character.toUpperCase(ime);
        char imeLower = Character.toLowerCase(ime);
        System.out.printf("Vpisi matriko %c\n%c00 %c01 ... %c0n\n%c10 %c11 ... %c1n\n...\n%cn0 %cn1 ... %cnn\n",
                imeUpper, imeLower, imeLower, imeLower, imeLower, imeLower, imeLower, imeLower, imeLower, imeLower);

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++)
                M[i][j] = sc.nextInt();
        }
    }

    public static void izpisMatrike(int[][] M) {
        for (int[] ints : M) {
            for (int el: ints)
                System.out.printf("%5d", el);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vpisi dimenzijo kvadratnih matrik:");

        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        vpisMatrike(A, 'A', sc);
        vpisMatrike(B, 'B', sc);

        System.out.println();
        System.out.println("Matrika A:");
        izpisMatrike(A);
        System.out.println("Matrika B:");
        izpisMatrike(B);


        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int vsota = 0;
                for (int k = 0; k < n; k++) {
                    vsota += A[i][k] * B[k][j];
                }
                C[i][j] = vsota;
            }
        }

        System.out.println("Zmnozek:");
        izpisMatrike(C);
    }
}
