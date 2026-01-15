
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01, 02: ro"cno izdelana
03--10: samodejno izdelani

01, 03--06: klici metode alternirajoceMonotono
02, 07--10: klici metode generator
*/

import java.util.*;
import java.util.function.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static <T> boolean alternirajoceMonotono(List<T> zaporedje, Comparator<T> prim) {
        for (int i = 2; i < zaporedje.size(); i += 2) {
            if (prim.compare(zaporedje.get(i - 2), zaporedje.get(i)) >= 0)
                return false;
        }
        for (int i = 3; i < zaporedje.size(); i += 2) {
            if (prim.compare(zaporedje.get(i - 2), zaporedje.get(i)) <= 0)
                return false;
        }
        return true;
    }

    public static Supplier<Integer> generator(int a, int b) {
        return new Supplier<Integer>() {
            int indeks = 0;
            @Override
            public Integer get() {
                indeks++;
                if (indeks % 2 == 1) {
                    return a + ((indeks - 1) / 2) * b;
                }
                return a - ((indeks) / 2) * b;
            }
        };
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
