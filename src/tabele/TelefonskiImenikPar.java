import java.util.Scanner;

public class TelefonskiImenikPar {
    public static ParStringov najdiPar(ParStringov[] imenik, String iskano) {
        for (ParStringov p: imenik) {
            if (iskano.equals(p.ime()))
                return p;
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ParStringov[] imenik = new ParStringov[n];

        for (int i = 0; i < n; i++) {
            String ime = sc.next();
            String stevilka = sc.next();
            imenik[i] = new ParStringov(ime, stevilka);
        }

        for (int i = 0; i < imenik.length / 2; i++) {
            ParStringov t = imenik[i];
            imenik[i] = imenik[imenik.length - 1 - i];
            imenik[imenik.length - 1 - i] = t;
        }

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            String iskano = sc.next();

            ParStringov vrednost = najdiPar(imenik, iskano);

            if (vrednost == null)
                System.out.println("NEZNANA");
            else
                System.out.println(vrednost.stevilka());
        }
    }

    private static class ParStringov {
        final private String ime;
        final private String stevilka;


        public ParStringov(String ime, String stevilka) {
            this.ime = ime;
            this.stevilka = stevilka;
        }

        public String ime() {
            return ime;
        }

        public String stevilka() {
            return stevilka;
        }
    }
}
