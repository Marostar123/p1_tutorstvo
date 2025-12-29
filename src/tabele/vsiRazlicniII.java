import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;




public class vsiRazlicniII {
    private static final int MAKS_STEVILO = 10000;

    public static void mainv0(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seme = sc.nextInt();
        int n = sc.nextInt();

        Random random = new Random(seme);

        int[] tabela = new int[n];

        for (int i = 0; i < n; i++) {
            tabela[i] = random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;
        }


        Arrays.sort(tabela);

        int stPonovitev = 1;
        int najvecjeStPonovitev = 1;

        int element = 0;

        // [2, 2, 2, 3, 3, ...]

        for (int i = 0; i < n - 1; i++) {
            if (tabela[i] == tabela[i + 1]) {
                stPonovitev++;
            } else {
                if (stPonovitev > najvecjeStPonovitev) {
                    najvecjeStPonovitev = stPonovitev;
                    element = tabela[i];
                }
                stPonovitev = 1;
            }
        }

        if (najvecjeStPonovitev == 1) {
            System.out.println("RAZLICNI");
        }
        else {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seme = sc.nextInt();
        int n = sc.nextInt();

        Random random = new Random(seme);

        int[] frekvence = new int[2 * MAKS_STEVILO + 1];

        for (int i = 0; i < n; i++) {
            int clen = random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;

            frekvence[clen + MAKS_STEVILO]++;
        }

        int najvecjeStPonovitev = 1;

        int element = 0;

        // [2, 2, 2, 3, 3, ...]

        for (int i = 0; i < frekvence.length; i++) {
            if (frekvence[i] > najvecjeStPonovitev) {
                najvecjeStPonovitev = frekvence[i];
                element = i - MAKS_STEVILO;
            }
        }

        if (najvecjeStPonovitev == 1) {
            System.out.println("RAZLICNI");
        }
        else {
            System.out.println(element);
        }
    }
}
