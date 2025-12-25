import java.util.Scanner;

public class NajblizjiElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] tabela = new int[n];

        for (int i = 0; i < n; i++) {
            tabela[i] = sc.nextInt();
        }

        int najmanjsaRazlika = 1_000_000_000;

        najmanjsaRazlika = Math.abs(tabela[0] - k);

        int indeks = 0;

        for (int i = 0; i < n; i++) {
            int novaRazlika = Math.abs(tabela[i] - k);
            if (novaRazlika < najmanjsaRazlika) {
                najmanjsaRazlika = novaRazlika;
                indeks = i;
            }
        }

        System.out.println(indeks);

//        System.out.println(najmanjsaRazlika);
    }
}
