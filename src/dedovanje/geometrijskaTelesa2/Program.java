import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        GeometrijskoTelo[] telesa = new GeometrijskoTelo[n];

        for (int i = 0; i < n; i++) {
            int tip = sc.nextInt();

            if (tip == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                telesa[i] = new Kvader(a, b, c);
            }
            else if (tip == 2) {
                int a = sc.nextInt();

                telesa[i] = new Kocka(a);
            }
            else {
                int r = sc.nextInt();

                telesa[i] = new Krogla(r);
            }
        }

        Arrays.sort(telesa);

        for (GeometrijskoTelo t: telesa)
            t.izpis();
    }

}
