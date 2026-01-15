public abstract class GeometrijskoTelo implements Comparable<GeometrijskoTelo> {
    protected int prostornina;
    protected int povrsina;

    public int getProstornina() {
        return prostornina;
    }

    public int getPovrsina() {
        return povrsina;
    }

    @Override
    public int compareTo(GeometrijskoTelo o) {
        if (this.prostornina < o.prostornina) {
            return 1;
        }
        if (this.prostornina == o.prostornina) {
            return 0;
        }
        return -1;
    }

    public abstract void izpis();
}
