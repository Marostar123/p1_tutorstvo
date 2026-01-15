
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01: primer iz besedila
02--06: vse besede v okviru istega dokumenta so med seboj razli"cne
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        boolean[] besedaVDokumentu = new boolean[b];
        int[] stRazlicnih = new int[b];

        Arrays.fill(stRazlicnih, 0);

        int novaB;

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            Arrays.fill(besedaVDokumentu, false);
            for (int j = 0; j < k; j++) {
                novaB = sc.nextInt();
                if (!besedaVDokumentu[novaB]) {
                    besedaVDokumentu[novaB] = true;
                    stRazlicnih[novaB]++;
                }
            }
        }


        int maxInd = 0;
        for (int i = 1; i < b; i++) {
            if (stRazlicnih[i] > stRazlicnih[maxInd]) {
                maxInd = i;
            }
        }

        System.out.println(maxInd);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
