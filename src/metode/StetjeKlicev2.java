import java.util.Scanner;

public class StetjeKlicev2 {
    public static int funkcija(int n, int a, int b) {
        if (n == 0)
            return 1;

        int f1 = funkcija(n / a, a, b);
        int f2 = funkcija(n / b, a, b);

        return f1 + f2 + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, n;

        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();

        int vrednost = funkcija(n, a, b);

        System.out.println(vrednost);
    }
}
