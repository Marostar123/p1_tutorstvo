import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        Lik[] liki = new Lik[n];

        for (int i = 0; i < n; i++) {
            int e = sc.nextInt();

            if (e == 1)
                liki[i] = preberiKvader(sc);
            if (e == 2)
                liki[i] = preberiKocko(sc);
            if (e == 3)
                liki[i] = preberiKroglo(sc);
        }

        Arrays.sort(liki, Lik.obratniVrstniRed());

        for (Lik l: liki) {
            l.izpis();
            System.out.println("======");
        }
    }

    public static Lik preberiKvader(Scanner sc) {
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        return new Kvader(a, b, c);
    }

    public static Lik preberiKocko(Scanner sc) {
        int a;
        a = sc.nextInt();

        return new Kocka(a);
    }

    public static Lik preberiKroglo(Scanner sc) {
        int r;
        r = sc.nextInt();

        return new Krogla(r);
    }
}
