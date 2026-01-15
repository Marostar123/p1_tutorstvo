public class Kvader extends GeometrijskoTelo {
    protected int a;
    private int b;
    private int c;

    public Kvader(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        this.povrsina = 2 * a * b + 2 * a * c + 2 * b * c;
        this.prostornina = a * b * c;
    }

//    private void ponoviVrstico(int kolikokrat) {
//        for (int i = 0; i < kolikokrat; i++) {
//            izpisiVrstico();
//            System.out.println();
//        }
//    }

    private void izpisiVrstico(int kolikokrat, String znak, int stVrtsic) {
        for (int i = 0; i < stVrtsic; i++){
            for (int j = 0; j < kolikokrat; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }

    private void izpisiString(int kolikokrat, String kaj) {
        for (int i = 0; i < kolikokrat; i++)
            System.out.print(kaj);
    }

    public void izpisiMrezo() {
        for (int j = 0; j < c; j++) {
            izpisiString(c,"  ");
            izpisiString(b - 1, "* ");
            System.out.println("*");
        }

        for (int j = 0; j < a; j++){
            izpisiString(c, "+ ");
            izpisiString(b, "o ");
            izpisiString(c - 1, "+ ");
            System.out.println("+");
        }

        for (int j = 0; j < c; j++) {
            izpisiString(c,"  ");
            izpisiString(b - 1, "* ");
            System.out.println("*");
        }

        for (int j = 0; j < a; j++) {
            izpisiString(c, "  ");
            izpisiString(b - 1, "o ");
            System.out.println("o");
        }
    }

    @Override
    public void izpis() {
        System.out.println("kvader");
        System.out.printf("a = %d\nb = %d\nc = %d\nV = %d\nP = %d\n", this.a, this.b, this.c, this.prostornina, this.povrsina);
        this.izpisiMrezo();
        System.out.println("======");
    }
}
