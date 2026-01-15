
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01, 02: primera iz besedila
01, 03--06: u = 1
02, 07--10: u = 2
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int u = sc.nextInt();
        int stDraziteljev = sc.nextInt();
        int stIzdelkov = sc.nextInt();
        int stPonudb = sc.nextInt();

        int[] izdelkiCena = new int[stIzdelkov];
        int[] izdelkiDrazitelj = new int[stIzdelkov];

        Arrays.fill(izdelkiDrazitelj, -1);

        for (int i = 0; i < stPonudb; i++) {
            int d = sc.nextInt();
            int izd = sc.nextInt();
            int cena = sc.nextInt();

            if (cena > izdelkiCena[izd]) {
                izdelkiCena[izd] = cena;
                izdelkiDrazitelj[izd] = d;
            }
        }

        if (u == 1) {
            System.out.println(Arrays.toString(izdelkiCena));
        } else {
            int[] drazitelji = new int[stDraziteljev];

            for (int d: izdelkiDrazitelj) {
                if (d != -1)
                    drazitelji[d]++;
            }

            System.out.println(Arrays.toString(drazitelji));
        }
    }
}
