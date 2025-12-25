import java.util.Comparator;
import java.util.SimpleTimeZone;

public abstract class Lik implements Comparable<Lik>{
    public abstract int prostornina();

    public abstract int povrsina();

    @Override
    public int compareTo(Lik o) {
        if (this.prostornina() < o.prostornina())
            return -1;
        if (this.prostornina() > o.prostornina())
            return 1;
        return 0;
    }

    public static Comparator<Lik> obratniVrstniRed() {
        return new PrimerjalnikObratno();
    }

    private static class PrimerjalnikObratno implements Comparator<Lik> {

        @Override
        public int compare(Lik o1, Lik o2) {
            return -o1.compareTo(o2);
        }
    }

    public abstract void izpis();
}
