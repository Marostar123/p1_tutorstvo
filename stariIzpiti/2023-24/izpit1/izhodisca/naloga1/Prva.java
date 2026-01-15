
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

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int a = (int) Math.sqrt(p);

            boolean jeSkorajKvadrat = false;
            int najmnanjse = ((int) Math.sqrt(2 * p)) / 2;

            while (a > najmnanjse) {
                if (p % a == 0) {
                    jeSkorajKvadrat = true;
                    break;
                }
                a--;
            }

            System.out.println(jeSkorajKvadrat ? "DA" : "NE");
        }
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
