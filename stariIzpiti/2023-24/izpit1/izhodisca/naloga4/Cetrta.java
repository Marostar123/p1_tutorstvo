
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02--03: prva skupina
04--05: druga skupina
06--07: tretja skupina
08--11: "cetrta skupina

POZOR: uporabljate lahko samo primitivne tipe, tipni parameter T in tip
Iterator<T>.
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static <T extends Comparable<T>> Iterator<T> zlitje(Iterator<T> a, Iterator<T> b) {
        return new Iterator<T>() {
            private T naslednjiA = null;
            private T naslednjiB = null;

            @Override
            public boolean hasNext() {
                return a.hasNext() || b.hasNext() || naslednjiA != null || naslednjiB != null;
            }

            @Override
            public T next() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                if (naslednjiA == null && a.hasNext()) {
                    naslednjiA = a.next();
                }
                if (naslednjiB == null && b.hasNext()) {
                    naslednjiB = b.next();
                }

                if (naslednjiA == null) {
                    T temp = naslednjiB;
                    naslednjiB = null;
                    return temp;
                }
                if (naslednjiB == null) {
                    T temp = naslednjiA;
                    naslednjiA = null;
                    return temp;
                }

                if (naslednjiA.compareTo(naslednjiB) < 0) {
                    T temp = naslednjiA;
                    naslednjiA = null;
                    return temp;
                }
                T temp = naslednjiB;
                naslednjiB = null;
                return temp;
            }
        };
    }

    // pomo"zne metode (po potrebi) ...
}
