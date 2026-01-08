public class Filozof {
    private String ime;
    private boolean drziLevo = false;
    private boolean drziDesno = false;

    private Filozof leviSosed;
    private Filozof desniSosed;

    public Filozof(String ime) {
        this.ime = ime;
    }

    public String vrniIme() {
        return this.ime;
    }

    public void nastaviSoseda(Filozof levi, Filozof desni) {
        this.leviSosed = levi;
        this.desniSosed = desni;
    }

    public boolean jeLeviSosedOd(Filozof f) {
        return this.desniSosed == f;
    }

    public boolean jeDesniSosedOd(Filozof f) {
        return this.leviSosed == f;
    }

    public Filozof[] vrniSoseda() {
        return new Filozof[]{this.leviSosed, this.desniSosed};
    }

    public int kolikoPalicicDrzi() {
//        int vs = 0;
//        if (drziLevo)
//            vs++;
//
//        if (drziDesno)
//            vs++;
//
//        return vs;

        if (drziLevo && drziDesno)
            return 2;

        if (drziLevo || drziDesno)
            return 1;

        return 0;
    }

    public boolean primiLevo() {
        if (drziLevo)
            return true;

        if (leviSosed.drziDesno)
            return false;

        drziLevo = true;

        return true;
    }

    public boolean primiDesno() {
        if (drziDesno)
            return true;

        if (desniSosed.drziLevo)
            return false;

        drziDesno = true;

        return true;
    }

    public void izpustiLevo() {
        drziLevo = false;
    }

    public void izpustiDesno() {
        drziDesno = false;
    }

    public static int steviloJedcev(Filozof[] filozofi) {
        int vs = 0;

        for (Filozof f: filozofi) {
            if (f.kolikoPalicicDrzi() == 2)
                vs++;
        }

        return vs;
    }

    public int steviloFilozofov() {
        Filozof trenutni = this.desniSosed;
        int vs = 1;

        while (trenutni != this) {
            trenutni = trenutni.desniSosed;
            vs++;
        }

        return vs;
    }
}
