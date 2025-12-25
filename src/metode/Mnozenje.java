import java.util.Scanner;

public class Mnozenje {
    public static int sestevek(int a, int b) {
        return a + b;
    }

    public static int mnozenje(int a, int b) {
        if (b == 0)
            return 0;
        return a + mnozenje(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        int vsota = 0;

//        for (int i = 0; i < b; i++) {
////            vsota = vsota + a;
//            vsota = sestevek(vsota, a);
//        }

        System.out.println(mnozenje(a, b));
    }
}
