import java.util.Scanner;

public class StetjeKlicev {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        long n = sc.nextLong();

        System.out.println(funkcija(a, b, n));
    }

    public static long funkcija(int a, int b, long n) {
        if (n == 0)
            return 1;

        return 1 + funkcija(a, b, n / a) + funkcija(a, b, n / b);
    }
}
