import java.util.Scanner;

public class NajblizjiVeckratnik_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double kolicnik = ((double) b) / a;
        int zaokrozeno = zaokrozi(kolicnik);

        System.out.println(zaokrozeno * a);
    }

    private static int zaokrozi(double a) {
        int zaokrozenoDol = (int) a;
        if ((a - zaokrozenoDol) * 2 <= 1.0)
            return zaokrozenoDol;
        return zaokrozenoDol + 1;
    }
}
