
/*
Samodejno testiranje:
tj.exe Prva.java . .

Testni primeri:

01: primer iz besedila
02..04: na vhodu je 42 "stevil
01, 05..10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pr = sc.nextInt();
        int zd = sc.nextInt();
        int max = pr + zd;
        pr = zd;

        while (sc.hasNextInt()) {
            zd = sc.nextInt();
            if (pr + zd > max)
                max = pr + zd;
            pr = zd;
        }

        System.out.println(max);
    }
}
