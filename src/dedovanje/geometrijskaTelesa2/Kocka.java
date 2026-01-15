public class Kocka extends Kvader{
    public Kocka(int a) {
        super(a, a, a);
    }

    @Override
    public void izpis() {
        System.out.println("kocka");
        System.out.printf("a = %d\nV = %d\nP = %d\n", this.a, this.prostornina,
                this.povrsina);
        this.izpisiMrezo();
        System.out.println("======");
    }
}
