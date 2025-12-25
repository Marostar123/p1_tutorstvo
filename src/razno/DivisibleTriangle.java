import java.util.HashMap;
import java.util.Map;

// https://projecteuler.net/problem=12

public class DivisibleTriangle {
    public static void main(String[] args) {
        HashMap<Long, Long> dp = new HashMap<>();
        HashMap<Long, HashMap<Long, Long>> factorsStored = new HashMap<>();

        long vsota = 1;
        long maxDeliteljev = 0;
        long maxSt = 0;

        for (int i = 2; i <= 1000000; i++) {
            vsota += i;
            factors(vsota, factorsStored);

            long stDeliteljev = 1;
            for (Long st: factorsStored.get(vsota).values()) {
                stDeliteljev *= st + 1;
            }

            if (stDeliteljev > maxDeliteljev) {
                maxDeliteljev = stDeliteljev;
                maxSt = vsota;
            }

            if (stDeliteljev > 500) {
                System.out.println(vsota);
                break;
            }
        }

        System.out.println(maxDeliteljev);
        System.out.println(maxSt);
    }


    public static void factors(long aOrig, HashMap<Long, HashMap<Long, Long>> factorsStored) {
        long aNew = aOrig;
        HashMap<Long, Long> f = new HashMap<>();
        long i = 2;
        while (aNew > 1) {
            if (i > Math.sqrt(aOrig) + 1)
                break;
            if (aNew % i != 0) {
                i++;
                continue;
            }
            if (!f.containsKey(i))
                f.put(i, Integer.toUnsignedLong(1));
            else
                f.put(i, f.get(i) + 1);
            aNew /= i;
            if (factorsStored.containsKey(aNew))
                break;
        }

        if (aNew != 1) {
            if (factorsStored.containsKey(aNew)) {
                for (Map.Entry<Long, Long> entry : factorsStored.get(aNew).entrySet()) {
                    if (!f.containsKey(entry.getKey()))
                        f.put(entry.getKey(), entry.getValue());
                    else
                        f.put(entry.getKey(), f.get(entry.getKey()) + entry.getValue());
                }
            } else {
                f.put(aOrig, Integer.toUnsignedLong(1));
            }
        }

        factorsStored.put(aOrig, f);
    }
}
