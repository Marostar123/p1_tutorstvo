
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01, 02, 03: ro"cno izdelani (in manj"si)
04--10: samodejno izdelani (in ve"cji)

Primeri 01, 02 in 03 vsebujejo isti dnevnik, razlikujejo se le po klicih metod.

01, 04--05: steviloMalicarjev
02, 06--07: kolikoRekreacije
03, 08--10: prisotnost
*/

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
    }

    public abstract static class Dogodek {
        private int oseba;
        private Cas cas;
        private boolean odhod;

        protected Dogodek(int oseba, Cas cas, boolean odhod) {
            this.oseba = oseba;
            this.cas = cas;
            this.odhod = odhod;
        }

        public int vrniOsebo() {
            return this.oseba;
        }

        public Cas vrniCas() {
            return this.cas;
        }

        public boolean jeOdhod() {
            return this.odhod;
        }
    }

    public static class Malica extends Dogodek {
        public Malica(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Rekreacija extends Dogodek {
        public Rekreacija(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class SluzbenaPot extends Dogodek {
        public SluzbenaPot(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Dnevnik {
        private int stZaposlenih;
        private Dogodek[] dogodki;

        public Dnevnik(int stZaposlenih, Dogodek[] dogodki) {
            this.stZaposlenih = stZaposlenih;
            this.dogodki = dogodki;
        }

        public int steviloMalicarjev() {
            int vs = 0;
            for (Dogodek d : dogodki) {
                if (d instanceof Malica && d.jeOdhod())
                    vs++;
            }
            return vs;
        }

        public int kolikoRekreacije(int oseba) {
            int vs = 0;
            Cas zacetek = null, konec;
            for (Dogodek d : dogodki) {
                if (d instanceof Rekreacija && d.vrniOsebo() == oseba) {
                    if (d.jeOdhod()) {
                        zacetek = d.vrniCas();
                    } else {
                        konec = d.vrniCas();
                        vs += konec.razlikaVMin(zacetek);
                    }
                }
            }
            return vs;
        }

        public boolean[] prisotnost(Cas cas) {
            boolean[] pris = new boolean[stZaposlenih];

            Arrays.fill(pris, true);

            for (Dogodek d : dogodki) {
                if (cas.compareTo(d.vrniCas()) < 0)
                    break;

                if (d.jeOdhod()) {
                    pris[d.vrniOsebo()] = false;
                } else {
                    pris[d.vrniOsebo()] = true;
                }
            }

            return pris;
        }
    }
}
