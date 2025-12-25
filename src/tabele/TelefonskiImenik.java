import java.util.Scanner;

public class TelefonskiImenik {
    public static int najdiIndeks(String[] imena, String iskano) {
        for (int i = imena.length - 1; i >= 0; i--) {
            if (iskano.equals(imena[i]))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] imena = new String[n];
        String[] stevilke = new String[n];

        for (int i = 0; i < n; i++) {
            imena[i] = sc.next();
            stevilke[i] = sc.next();
        }

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            String iskano = sc.next();

            int indeks = najdiIndeks(imena, iskano);

            if (indeks == -1)
                System.out.println("NEZNANA");
            else
                System.out.println(stevilke[indeks]);
        }
    }
}
