public class Palindrom {
    // https://projecteuler.net/problem=4
    public static void main(String[] args) {
        for (int i = 999 * 999; i >= 0; i--) {
            if (jePalindrom(i)) {
                for (int j = 999; j >= 100; j--) {
                    if (i % j != 0)
                        continue;
                    if (i / j > 1000)
                        break;

                    System.out.println(i);
                    System.out.printf("%d %d\n", j, i / j);
                    return;
                }
            }
        }
    }

    public static boolean jePalindrom(int n) {
        String s1 = Integer.toString(n);
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }

        return s1.compareTo(s2) == 0;
    }
}
