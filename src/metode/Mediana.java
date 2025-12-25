import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= min(b, c) && a <= maks(b, c))
            System.out.println(a);
        else if (b >= min(a, c) && b <= maks(a, c))
            System.out.println(b);
        else
            System.out.println(c);
    }

    public static int min(int a, int b) {
        if (a <= b)
            return a;
        return b;
    }
    public static int maks(int a, int b) {
        if (a >= b)
            return a;
        return b;
    }
}
