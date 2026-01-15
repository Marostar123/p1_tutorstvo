
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01: primer iz besedila
02..04: vsaka beseda je sestavljena iz ene same "crke
01, 05..10: splo"sni primeri

01, 02, 05, 06: ro"cno izdelani
*/

import java.util.*;

public class Druga {

    public static boolean krizankaOK(char[][] besede, char[][] polozaji) {
        char[][] krizanka = new char[20][20];

        for (int i = 0; i < 20; i++) {
            Arrays.fill(krizanka[i], (char) 0);
        }

        for (int i = 0; i < besede.length; i++) {
            int y = ((int) polozaji[i][0]) - ((int) '0');
            int x = ((int) polozaji[i][1]) - ((int) '0');

            switch (polozaji[i][2]) {
                case 'n':
                    for (int j = 0; j < besede[i].length; j++) {
                        if (krizanka[y + j][x] != 0) {
                            if (krizanka[y + j][x] != besede[i][j])
                                return false;
                        } else {
                            krizanka[y + j][x] = besede[i][j];
                        }
                    }
                    break;
                default:
                    for (int j = 0; j < besede[i].length; j++) {
                        if (krizanka[y][x + j] != 0) {
                            if (krizanka[y][x + j] != besede[i][j])
                                return false;
                        } else {
                            krizanka[y][x + j] = besede[i][j];
                        }
                    }
            }
        }

        return true;
    }
}
