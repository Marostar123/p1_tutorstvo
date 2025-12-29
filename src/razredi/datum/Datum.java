public class Datum {
    private int dan;
    private int mesec;
    private int leto;

    private Datum(int dan, int mesec, int leto) {
        this.dan = dan;
        this.mesec = mesec;
        this.leto = leto;
    }

    private static boolean jePrestopno(int leto) {
        if (leto % 4 != 0)
            return false;
        if (leto % 100 == 0 & leto % 400 != 0)
            return false;
        return true;
    }

    public static Datum ustvari(int dan, int mesec, int leto) {
        if (leto > 2999 || leto < 1583)
            return null;
        if (mesec < 1 || mesec > 12)
            return null;
        int[] stDni = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (dan < 1)
            return null;
        if (dan > stDni[mesec] && (!Datum.jePrestopno(leto) || mesec != 2 || dan > 29))
            return null;

        return new Datum(dan, mesec, leto);
    }

    public String toString() {
        return String.format("%02d.%02d.%d", this.dan, this.mesec, this.leto);
    }

    public boolean jeEnakKot(Datum datum) {
        return this.dan == datum.dan && this.mesec == datum.mesec && this.leto == datum.leto;
    }

    public boolean jePred(Datum datum) {
        if (this.leto < datum.leto)
            return true;
        if (this.leto > datum.leto)
            return false;

        if (this.mesec < datum.mesec)
            return true;
        if (this.mesec > datum.mesec)
            return false;

        return this.dan < datum.dan;
    }

    public Datum naslednik() {
        Datum d = Datum.ustvari(this.dan + 1, this.mesec, this.leto);
        if (d != null)
            return d;

        d = Datum.ustvari(1, this.mesec + 1, this.leto);
        if (d != null)
            return d;

        d = Datum.ustvari(1, 1, this.leto + 1);
        return d;
    }

    public Datum predhodnik() {
        Datum d = Datum.ustvari(this.dan - 1, this.mesec, this.leto);
        if (d != null)
            return d;

        for (int i = 31; i > 27; i--) {
            d = Datum.ustvari(i, this.mesec - 1, this.leto);
            if (d != null)
                return d;
        }

        d = Datum.ustvari(31, 12, this.leto - 1);
        return d;
    }

    public Datum cez(int stDni) {
        Datum novDatum = this;

        if (stDni > 0) {
            for (int i = 0; i < stDni; i++) {
                novDatum = novDatum.naslednik();
            }
        }
        else {
            for (int i = 0; i < -stDni; i++) {
                novDatum = novDatum.predhodnik();
            }
        }

        return novDatum;
    }

    public int razlika(Datum datum) {
        if (this.jeEnakKot(datum))
            return 0;

        if (this.jePred(datum)) {
            Datum novDatum = this;
            int i = 0;
            while (novDatum != null) {
                if (novDatum.jeEnakKot(datum))
                    return i;
                i--;
                novDatum = novDatum.naslednik();
            }
            return 0;
        }

        else {
            Datum novDatum = this;
            int i = 0;
            while (novDatum != null) {
                if (novDatum.jeEnakKot(datum))
                    return i;
                i++;
                novDatum = novDatum.predhodnik();
            }
            return 0;
        }
    }
}


