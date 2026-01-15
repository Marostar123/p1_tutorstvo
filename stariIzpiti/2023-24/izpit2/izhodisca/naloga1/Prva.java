
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--10: splošni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int st = sc.nextInt();
            while (st % p == 0)
                st /= p;
            while (st % q == 0)
                st /= q;
            System.out.println(st == 1? "DA": "NE");
        }
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
