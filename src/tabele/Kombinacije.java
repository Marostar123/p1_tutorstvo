import java.util.Arrays;
import java.util.Scanner;

public class Kombinacije {
    public static void rekurzija(int n, int k, int indeks, int[] tabela) {
        if (indeks == k) {
            System.out.println(Arrays.toString(tabela));
            return;
        }

        int zacetek = 0;
        if (indeks != 0)
            zacetek = tabela[indeks - 1];

        for (int i = zacetek + 1; i <= n; i++) {
//            if (i > n - (k - indeks) + 1)
//                break;
            tabela[indeks] = i;
            rekurzija(n, k, indeks + 1, tabela);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;

        n = sc.nextInt();
        k = sc.nextInt();

        rekurzija(n, k, 0, new int[k]);
    }
}
