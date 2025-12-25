import java.util.Scanner;

public class DigitalneCrtice {
    public static int stCrtic(int a) {
        int vs = 0;

        int[] crtice = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        while (a > 0) {
            int enice = a % 10;
            vs += crtice[enice];
            a /= 10;
        }

        return vs;
    }

    public static int stCrtic2(int a) {
        int vs = 0;

        int[] crtice = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        String st = Integer.toString(a);

        for (int i = 0; i < st.length(); i++) {
            int stevka = st.charAt(i) - '0';
            vs += crtice[stevka];
        }

        return vs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] tabela = new int[n];

        for (int i = 0; i < n; i++) {
            tabela[i] = sc.nextInt();
        }

        int najvecCrtic = stCrtic2(tabela[0]);

        int stevilo = tabela[0];

        for (int i = 0; i < n; i++) {
            int noveCrtice = stCrtic2(tabela[i]);

            if (noveCrtice > najvecCrtic) {
                najvecCrtic = noveCrtice;
                stevilo = tabela[i];
            }
        }

        System.out.println(stevilo);
    }
}
