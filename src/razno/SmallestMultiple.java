public class SmallestMultiple {
    // https://projecteuler.net/problem=5
    public static void main(String[] args) {
        int[] faktorji = new int[21];
        for (int i = 0; i <= 20; i++) {
            faktorji[i] = 0;
        }

        for (int i = 1; i <= 20; i++) {
            int[] prafaktorji = prafaktorji(i);
            for (int j = 0; j <= 20; j++) {
                faktorji[j] = Math.max(faktorji[j], prafaktorji[j]);
            }
        }

        int vs = 1;
        for (int i = 1; i <= 20; i++) {
            vs *= (int) Math.pow(i, faktorji[i]);
        }

        System.out.println(vs);
    }

    public static int[] prafaktorji(int n) {
        int[] prafaktorji = new int[21];
        for (int i = 0; i <= 20; i++) {
            prafaktorji[i] = 0;
        }

        int d = 2;
        while (n > 1) {
            if (n % d != 0) {
                d++;
                continue;
            }

            prafaktorji[d]++;
            n /= d;
        }

        return prafaktorji;
    }
}
