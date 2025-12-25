import java.util.Scanner;

public class TelefonskiImenik2 {
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
            String ime = sc.next();

            String telefonska = "NEZNANA";

            for (int j = 0; j < n; j++) {
                if (imena[j].equals(ime)) {
                    telefonska = stevilke[j];
                }
            }

            System.out.println(telefonska);
        }

    }
}
