public class Posta {
    private int stevilka;
    private String naziv;

    public Posta(int stevilka, String naziv) {
        this.stevilka = stevilka;
        this.naziv = naziv;
    }

    public int vrniStevilko() {
        return stevilka;
    }

    public String vrniNaziv() {
        return naziv;
    }

    public String toString() {
        return  Integer.toString(stevilka) + " " + naziv;
    }

    public boolean equals(Posta other) {
        return stevilka == other.stevilka && naziv.equals(other.naziv);
    }
}
