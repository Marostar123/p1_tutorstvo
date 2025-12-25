import java.util.Scanner;

public class Neki {
    public static void ravnovrstnica() {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();

        int stTipk = sc.nextInt();

        for (int i = 0; i < stTipk; i++) {

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

        if (b == 1)
            ravnovrstnica();

        /*
        int vrsticaPrej;
        int stolpecPrej;
        int skupaj = 0;
        int tipka = sc.nextInt();

        if (b == 1) {
            vrsticaPrej = vrsticaRavnovrstnica(...);
            stolpecPrej = stolpecRavnovrstnica(...);
        }
        if (b == 2) {
            vrsticaPrej = vrsticeKvadratnica(...);
            stolpecPrej = stolpecKvadratnica(...);
        }
        // b = 3, b = 4

        for (int i = 1; i < stTipk; i++) {
            tipka = sc.nextInt();
            int vrstica;
            int stolpec;

            if (b == 1) {
                vrstica = vrsticaRavnovrstnica(...);
                stolpec = stolpecRavnovrstnica(...);
            }
            if (b == 2) {
                vrstica = vrsticeKvadratnica(...);
                stolpec = stolpecKvadratnica(...);
            }
            // b = 3, b = 4

            skupaj += Math.abs(vrstica - vrsticaPrej) + Math.abs(stolpec - stolpecPrej);

            vrsticaPrej = vrstica;
            stolpecPrej = stolpec;
        }

        System.out.println(skupaj);
        */
    }
}
