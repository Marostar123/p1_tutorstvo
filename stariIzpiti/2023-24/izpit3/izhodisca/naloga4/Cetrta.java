
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode skupne
06--10: klici metode poDolziniBrezDuplikatov

01, 02, 06, 07: ro"cno izdelani
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite, "ce "zelite metodi testirati ro"cno
    }

    public static <T> Set<T> skupni(List<List<T>> s) {
        Set<T> res = new HashSet<>(s.get(0));
        for (List<T> list : s) {
            res.retainAll(list);
        }
        return res;
    }

    public static <T> void poDolziniBrezDuplikatov(List<List<T>> s) {
        s.sort((l1, l2) -> {
            Set<T> s1 = new HashSet<>(l1);
            Set<T> s2 = new HashSet<>(l2);
            return s1.size() - s2.size();
        });
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
