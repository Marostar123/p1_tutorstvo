import java.util.Scanner;

public class StetjeKlicevII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int[] memo = new int[n + 1];

        System.out.println(funkcija(a, b, n, memo));
    }

    public static int funkcija(int a, int b, int n, int[] memo) {

        // Element smo že izračunali
        if (memo[n] != 0)
            return 0;

        // Sicer označimo element kot izračunan
        memo[n] = 1;


        // In ga dejansko izračunamo
        if (n == 0)
            return 1;

        return 1 + funkcija(a, b, n / a, memo) + funkcija(a, b, n / b, memo);
    }
}
