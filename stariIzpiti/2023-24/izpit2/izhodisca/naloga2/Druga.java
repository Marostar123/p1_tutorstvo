
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02: vse smeri so 1 ali 2, ostalo enako kot v besedilu
02--06: vse smeri so 1 ali 2
01, 07--10: splo"sni primeri

V vseh testnih primerih (javnih in skritih) so elementi tabele <rel>
"stevila z intervala [-1000, 1000].
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static int[][] visine(int[][] rel, int[][] smer) {
        int w = rel.length;
        int h = rel[0].length;

        boolean[][] visited = new boolean[w][h];

        int[][] rezultat = new int[w][h];

        visited[0][0] = true;

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (!visited[i][j]) {
                    rekurzija(rel, smer, visited, rezultat, new int[]{i, j});
                }
            }
        }

        return rezultat;
    }

    private static int[] prejsnji(int[] trenutni, int smer) {
        return switch (smer) {
            case 1 -> new int[]{trenutni[0], trenutni[1] - 1};
            case 2 -> new int[]{trenutni[0] - 1, trenutni[1]};
            case 3 -> new int[]{trenutni[0], trenutni[1] + 1};
            default -> new int[]{trenutni[0] + 1, trenutni[1]};
        };
    }

    public static boolean rekurzija(int[][] rel, int[][] smer, boolean[][] visited, int[][] rezultat, int[] trenutni) {
        int[] p = prejsnji(trenutni, smer[trenutni[0]][trenutni[1]]);
        if (visited[p[0]][p[1]] || rekurzija(rel, smer, visited, rezultat, p)) {
            rezultat[trenutni[0]][trenutni[1]] = rezultat[p[0]][p[1]] + rel[trenutni[0]][trenutni[1]];
            visited[trenutni[0]][trenutni[1]] = true;
        }
        return true;
    }
}
