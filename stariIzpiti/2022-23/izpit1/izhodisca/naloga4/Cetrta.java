
/*
Samodejno testiranje:
tj.exe Cetrta.java . .

Testni primeri:

01, 02: primera iz besedila
03..06: u = 1
07..10: u = 2
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int u = sc.nextInt();

        if (u == 1)
            ukaz1(n, sc);
        if (u == 2)
            ukaz2(n, sc);
    }

    private static void ukaz1(int n, Scanner sc) {
        Set<String> ponudniki = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String p = sc.next();
            ponudniki.add(p);

            sc.next();sc.nextInt();
        }

        ArrayList<String> ponudnikiList = new ArrayList<>(ponudniki);
        ponudnikiList.sort(null);

        for (String p: ponudnikiList)
            System.out.println(p);
    }

    private static void ukaz2(int n, Scanner sc) {
        Map<String, Integer> ponudniki = new HashMap<>();
        String artikel = sc.next();

        for (int i = 0; i < n; i++) {
            String p = sc.next();
            String a = sc.next();

            if (a.equals(artikel))
                ponudniki.put(p, sc.nextInt());
            else
                sc.nextInt();
        }

        List<String> ponudnikiList = new ArrayList<>(ponudniki.keySet());

        ponudnikiList.sort((p1, p2) -> ponudniki.get(p1) - ponudniki.get(p2));

        for (String p: ponudnikiList)
            System.out.println(p);
    }
}
