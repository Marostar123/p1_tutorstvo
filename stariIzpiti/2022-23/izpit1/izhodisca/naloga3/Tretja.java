
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01..03: toString
04..06: equals
07..10: hashCode

01, 04, 07: ročno izdelani; isti podatki v vseh treh razredih
*/

import java.util.*;

public class Tretja {

    public static class Tablica {
        private char[] kraj;
        private int stevilo;
        private boolean zacasna;

        public Tablica(char[] kraj, int stevilo, boolean zacasna) {
            this.kraj = new char[]{kraj[0], kraj[1]};
            this.stevilo = stevilo;
            this.zacasna = zacasna;
        }

        @Override
        public String toString() {
            return String.format("%s%s %d-%d", kraj[0], kraj[1], stevilo / 100, stevilo % 100);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this)
                return true;
            if (!(obj instanceof Tablica))
                return false;

            return this.toString().equals(obj.toString()) && this.zacasna == ((Tablica) obj).zacasna;
        }

        @Override
        public int hashCode() {
            int res = zacasna? 1: 0;
            res <<= 16;
            res += ((int) kraj[0]) * (int) Math.pow(2, 8) + (int) kraj[1];
            res <<= 14;
            res += stevilo;
            return res;
        }
    }
}
