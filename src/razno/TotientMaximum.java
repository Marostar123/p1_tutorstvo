import java.util.HashMap;
import java.util.Map;

public class TotientMaximum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> dp = new HashMap<>();
        HashMap<Integer, HashMap<Integer, Integer>> factorsStored = new HashMap<>();

        int max = 2;

        for (int i = 2; i <= 1000000; i++) {
            factors(i, factorsStored);
            int prime = factorsStored.get(i).keySet().iterator().next();
            int power = factorsStored.get(i).get(prime);

            if (factorsStored.get(i).size() == 1) {
                dp.put(i, getPhi(prime, power));
            }
            else {
                dp.put(i, getPhi(prime, power) * dp.get(i / (int) Math.pow(prime, power)));
            }

            if (((double) i) / dp.get(i) > ((double) max) / dp.get(max))
                max = i;
        }

        System.out.println(max);
    }

    public static int getPhi(int prime, int power) {
        return (int) (Math.pow(prime, power) - Math.pow(prime, power - 1));
    }

    public static void factors(int aOrig, HashMap<Integer, HashMap<Integer, Integer>> factorsStored) {
        int aNew = aOrig;
        HashMap<Integer, Integer> f = new HashMap<>();
        int i = 2;
        while (aNew > 1) {
            if (i > Math.sqrt(aOrig) + 1)
                break;
            if (aNew % i != 0) {
                i++;
                continue;
            }
            if (!f.containsKey(i))
                f.put(i, 1);
            else
                f.put(i, f.get(i) + 1);
            aNew /= i;
            if (factorsStored.containsKey(aNew))
                break;
        }

        if (aNew != 1) {
            if (factorsStored.containsKey(aNew)) {
                for (Map.Entry<Integer, Integer> entry : factorsStored.get(aNew).entrySet()) {
                    if (!f.containsKey(entry.getKey()))
                        f.put(entry.getKey(), entry.getValue());
                    else
                        f.put(entry.getKey(), f.get(entry.getKey()) + entry.getValue());
                }
            } else {
                f.put(aOrig, 1);
            }
        }

        factorsStored.put(aOrig, f);
    }
}
