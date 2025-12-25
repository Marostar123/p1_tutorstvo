public class Krogla extends Lik {
    private int r;

    public Krogla(int r) {
        super();
        this.r = r;
    }

    @Override
    public int prostornina() {
        return (int) (Math.round(4.0 / 3.0 * Math.PI * r * r * r));
    }

    @Override
    public int povrsina() {
        return (int) (Math.round(4.0 * Math.PI * r * r));
    }

    @Override
    public void izpis() {
        System.out.println("krogla");
        System.out.printf("r = %d\nV = %d\nP = %d\n", this.r, this.prostornina(), this.povrsina());
    }
}
