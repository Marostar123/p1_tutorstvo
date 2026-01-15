public class Krogla extends GeometrijskoTelo {
    private int polmer;

    public Krogla(int r) {
        this.polmer = r;

        this.povrsina = (int) Math.round(4 * Math.PI * r * r);

        this.prostornina = (int) Math.round(4 * Math.PI * r * r * r / 3);
    }

    @Override
    public void izpis() {
        System.out.println("krogla");
        System.out.printf("r = %d\nV = %d\nP = %d\n", this.polmer, this.prostornina, this.povrsina);
        System.out.println("======");
    }
}
