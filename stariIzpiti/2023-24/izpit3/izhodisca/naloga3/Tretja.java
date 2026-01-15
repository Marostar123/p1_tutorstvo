
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--03: klici metode konec
04--06: klici metode zadnjiFilm
07--09: klici metode infoDovoljPogosto
10--12: klici metode sportVesDan

01, 04, 07, 10: ro"cno izdelani

Po potrebi lahko razred Tretja in njegove notranje razrede dopolnite z
lastnimi elementi (atributi, metodami in notranjimi razredi).
*/

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // dopolnite, "ce "zelite metode testirati ro"cno
    }

    //=========================================================================

    public static abstract class Oddaja {
        private String naziv;
        private int trajanje;

        protected Oddaja(String naziv, int trajanje) {
            this.naziv = naziv;
            this.trajanje = trajanje;
        }

        public abstract String vrsta();

        public String vrniNaziv() {
            return this.naziv;
        }

        public int vrniTrajanje() {
            return this.trajanje;
        }

        @Override
        public String toString() {
            return String.format("%s | %s | %d", this.vrsta(), this.naziv, this.trajanje);
        }
    }

    //=========================================================================

    public static class Film extends Oddaja {
        public Film(String naziv, int trajanje) {
            super(naziv, trajanje);
        }

        @Override
        public String vrsta() {
            return "Film";
        }
    }

    //=========================================================================

    public static class Info extends Oddaja {
        public Info(String naziv, int trajanje) {
            super(naziv, trajanje);
        }

        @Override
        public String vrsta() {
            return "Info";
        }
    }

    //=========================================================================

    public static class Sport extends Oddaja {
        public Sport(String naziv, int trajanje) {
            super(naziv, trajanje);
        }

        @Override
        public String vrsta() {
            return "Sport";
        }
    }

    //=========================================================================

    public static class Program {
        private Oddaja[] oddaje;

        public Program(Oddaja[] oddaje) {
            this.oddaje = oddaje;
        }

        @Override
        public String toString() {
            return Arrays.toString(this.oddaje);
        }

        public Cas konec(Cas zacetek) {
            int vs = 0;
            for (Oddaja oddaja : oddaje) {
                vs += oddaja.vrniTrajanje();
            }
            return zacetek.plus(0, vs);
        }

        public Film zadnjiFilm() {
            Film zadnji = null;
            for (Oddaja oddaja : oddaje) {
                if (oddaja instanceof Film) {
                    zadnji = (Film) oddaja;
                }
            }
            return zadnji;
        }

        public boolean infoDovoljPogosto(int maksRazmak) {
            int razmak = 0;
            boolean mimo = false;
            for (Oddaja oddaja : oddaje) {
                if (oddaja instanceof Info) {
                    mimo = true;
                    if (razmak > maksRazmak) {
                        return false;
                    }
                    razmak = 0;
                }
                else if (mimo)
                    razmak += oddaja.vrniTrajanje();
            }
            return true;
        }

        public static Program sportVesDan(String osnova, int trajanje) {
            int stOddaj = 1440 / trajanje;
            Oddaja[] oddajeSport = new Oddaja[stOddaj];
            for (int i = 0; i < stOddaj; i++) {
                oddajeSport[i] = new Sport(String.format("%s_%d", osnova, i + 1), trajanje);
            }
            return new Program(oddajeSport);
        }
    }
}
