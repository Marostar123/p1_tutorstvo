public class Kvader extends Lik{

    protected int a;
    private int b;
    private int c;

    public Kvader(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int prostornina() {
        return a * b * c;
    }

    @Override
    public int povrsina() {
        return 2 * a * b + 2 * a * c + 2 * b * c;
    }

    @Override
    public void izpis() {
        System.out.println("kvader");
        System.out.printf("a = %d\nb = %d\nc = %d\nV = %d\nP = %d\n", this.a, this.b, this.c, this.prostornina(),
                this.povrsina());
        this.mreza();
    }

    protected void mreza() {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++)
                System.out.print("  ");
            for (int j = 0; j < b - 1; j++)
                System.out.print("* ");
            System.out.println("*");
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++)
                System.out.print("+ ");
            for (int j = 0; j < b; j++)
                System.out.print("o ");
            for (int j = 0; j < c - 1; j++)
                System.out.print("+ ");
            System.out.println("+");
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++)
                System.out.print("  ");
            for (int j = 0; j < b - 1; j++)
                System.out.print("* ");
            System.out.println("*");
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++)
                System.out.print("  ");
            for (int j = 0; j < b - 1; j++)
                System.out.print("o ");
            System.out.println("o");
        }
    }
}
