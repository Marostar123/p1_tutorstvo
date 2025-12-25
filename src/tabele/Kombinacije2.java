import java.util.Scanner;
import java.util.Arrays;

public class Kombinacije2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] tabela = new int[k];
        rekurzija(n, k, 0, tabela, 1);
    }

    public static void rekurzija(int n, int k, int indeks, int[] tabela, int i) {
        if (k == indeks) {      // Smo na koncu tabele
            System.out.println(Arrays.toString(tabela));
            return;
        }

        for (; i <= n; i++) {
            tabela[indeks] = i;
            rekurzija(n, k, indeks + 1, tabela, i + 1);
        }
    }
}
