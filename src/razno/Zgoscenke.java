import java.util.Scanner;

public class Zgoscenke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stZgoscenk = 0, velikostZgoscenke = 0;

        stZgoscenk = sc.nextInt();
        velikostZgoscenke = sc.nextInt();

        int velikostTrenutneZgoscenke = 0;
        int trenutnaZgoscenka = 1;

        while (sc.hasNextInt() && trenutnaZgoscenka <= stZgoscenk) {
            int velikostDatoteke = sc.nextInt();

            // Datoteka prevelika za zgoscenko
            if (velikostTrenutneZgoscenke + velikostDatoteke > velikostZgoscenke) {
                velikostTrenutneZgoscenke = velikostDatoteke;
                trenutnaZgoscenka++;
            }
            else {
                velikostTrenutneZgoscenke += velikostDatoteke;
            }

            System.out.printf("%d EP -> zgoscenka %d (%d EP)\n", velikostDatoteke, trenutnaZgoscenka,
                    velikostTrenutneZgoscenke);
        }
    }
}
