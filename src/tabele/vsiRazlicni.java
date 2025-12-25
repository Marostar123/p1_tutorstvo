import java.util.Arrays;
import java.util.Scanner;

public class vsiRazlicni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] tabela = new int[n];

        for (int i = 0; i < n; i++) {
            tabela[i] = sc.nextInt();
        }

        boolean razlicni = true;

        int najmanjsi = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (tabela[i] == tabela[j] && i != j) {
                    if (tabela[i] < najmanjsi || razlicni == true)
                        najmanjsi = tabela[i];
                    razlicni = false;
                }
            }
        }

        if (razlicni)
            System.out.println("RAZLICNI");
        else
            System.out.println(najmanjsi);

//        Arrays.sort(tabela);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (tabela[i] == tabela[i + 1]) {
//                System.out.println(tabela[i]);
//                return;
//            }
//        }
//
//        System.out.println("RAZLICNI");
    }
}
