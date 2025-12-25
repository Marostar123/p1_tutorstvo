import java.util.Scanner;

public class Piramida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stVrstic = sc.nextInt();

        for (int i = 1; i <= stVrstic; i++) {
            for (int j = 0; j < stVrstic - i; j++)
                System.out.print(' ');
            System.out.println(1);
        }
    }
}
