public class Pismo {
    private Posta izvorna;
    private Posta ciljna;
    private boolean jePriporoceno;
    private int razdalja;

    private static int r;
    private static int c;
    private static int p;

    public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja) {
        this.izvorna = izvorna;
        this.ciljna = ciljna;
        this.jePriporoceno = jePriporoceno;
        this.razdalja = razdalja;
    }

    public String toString() {
        return String.format("%s -> %s (%d km) [%c]", izvorna.toString(), ciljna.toString(), razdalja, jePriporoceno?
                'P': 'N');
    }

    public boolean izviraOd(Posta posta){
        return izvorna.equals(posta);
    }

    public boolean staIzvorInCiljIsta() {
        return izvorna.equals(ciljna);
    }

    public boolean imaIstiCiljKot(Pismo pismo) {
        return ciljna.equals(pismo.ciljna);
    }

    public static boolean imataIstiCilj(Pismo p1, Pismo p2) {
        return p1.ciljna.equals(p2.ciljna);
    }

    public int cena() {
        int vsota = (razdalja / r + 1) * c;

        if (jePriporoceno)
            vsota += p;

        return vsota;
    }

    public static void nastaviKonstanteZaCeno(
            int enotaRazdalje, int enotaCene, int priporocnina) {
        r = enotaRazdalje;
        c = enotaCene;
        p = priporocnina;
    }

    public boolean jeDrazjeOd(Pismo pismo) {
        return this.cena() > pismo.cena();
    }

    public static Pismo vrniDrazje(Pismo p1, Pismo p2) {
        if (p1.jeDrazjeOd(p2))
            return p1;

        return p2;
    }

    public Pismo izdelajPovratno() {
        return new Pismo(ciljna, izvorna, jePriporoceno, razdalja);
    }
}
