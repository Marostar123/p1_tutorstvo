
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int zd, pr = sc.nextInt();
//        int vs = 0;
//        while (pr != 0 || sc.hasNextInt()) {
//            zd = sc.nextInt();
//            if (zd == 0) {
//                vs++;
//            } else {
//                if (zd >= pr && pr != 0) {
//                    while (sc.hasNextInt() && sc.nextInt() != 0);
//                    zd = 0;
//                }
//            }
//            pr = zd;
//        }
//
//        System.out.println(vs);

        int a = -1;
        while (a != 0 || sc.hasNextInt()) {
            a = sc.nextInt();
        }

        System.out.println("bruh");
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
