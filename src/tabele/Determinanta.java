import java.util.Scanner;
import java.util.Vector;

public class Determinanta {
    public static boolean vsebuje(int[] tabela, int stevilo) {
        for (int s: tabela) {
            if (s == stevilo)
                return true;
        }

        return false;
    }

    public static int det(int[][] matrika, Vector<Integer> precrtaneVrstice, Vector<Integer> precrtaniStolpci) {
        int vrstica = 0;
        while (precrtaneVrstice.contains(vrstica)) {
            vrstica++;
        }

        if (vrstica >= matrika.length)
            return 1;

        precrtaneVrstice.add(vrstica);

        int vsota = 0;

        int tekociStolpec = 0;
        for (int i = 0; i < matrika[vrstica].length; i++) {
            if (precrtaniStolpci.contains(i))
                continue;

            Integer stolpec = i;

            precrtaniStolpci.add(stolpec);

            vsota += (int)Math.pow(-1, tekociStolpec) * matrika[vrstica][stolpec] * det(matrika, precrtaneVrstice,
                    precrtaniStolpci);

            tekociStolpec++;
            precrtaniStolpci.remove(stolpec);
        }

        // To je manjkalo
        precrtaneVrstice.remove(vrstica);

        return vsota;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrika = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrika[i][j] = sc.nextInt();
            }
        }

        System.out.println(det(matrika, new Vector<>(0), new Vector<>(0)));
    }
}
