public class Ulomek {
    private int stevec;
    private int imenovalec;

    private int gcd(int a, int b) {
        int delitelj = 1;
        for (int i = 1; i <= Math.abs(a); i++) {
            if (a % i == 0 && b % i == 0) {
                delitelj = i;
            }
        }

        return delitelj;
    }

    public Ulomek(int a, int b) {
        this.stevec = a / gcd(a, b);
        this.imenovalec = b / gcd(a, b);
        if (b < 0) {
            this.stevec *= -1;
            this.imenovalec *= -1;
        }
    }

    public String toString() {
        return String.format("%d/%d", this.stevec, this.imenovalec);
    }

    public boolean jeEnakKot(Ulomek u) {
        return this.stevec == u.stevec && this.imenovalec == u.imenovalec;
        // return this.toString().equals(u.toString());
        // return (float)(this.stevec) / this.imenovalec == (float)(u.stevec) / u.imenovalec;
    }

    public Ulomek negacija() {
        return new Ulomek(-this.stevec, this.imenovalec);
    }

    public Ulomek obrat() {
        return new Ulomek(this.imenovalec, this.stevec);
    }

    public Ulomek vsota(Ulomek u) {
        return new Ulomek(this.stevec * u.imenovalec + u.stevec * this.imenovalec, this.imenovalec * u.imenovalec);
    }

    public Ulomek razlika(Ulomek u) {
        return new Ulomek(this.stevec * u.imenovalec - u.stevec * this.imenovalec, this.imenovalec * u.imenovalec);
    }

    public Ulomek zmnozek(Ulomek u) {
        return new Ulomek(this.stevec * u.stevec, this.imenovalec * u.imenovalec);
    }

    public Ulomek kolicnik(Ulomek u) {
        return new Ulomek(this.stevec * u.imenovalec, this.imenovalec * u.stevec);
    }

    public Ulomek potenca(int eksponent) {
        Ulomek u = new Ulomek((int)Math.pow(this.stevec, Math.abs(eksponent)), (int)Math.pow(this.imenovalec,
                Math.abs(eksponent)));
        if (eksponent < 0)
            u = u.obrat();

        return u;
    }

    public boolean jeManjsiOd(Ulomek u) {
        if (this.razlika(u).stevec >= 0) {
            return false;
        } else {
            return true;
        }
    }
}
