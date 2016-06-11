package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int num) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int candidate = 2; num > 1; candidate++) {
            while (num % candidate == 0) {
                primeFactors.add(candidate);
                num /= candidate;
            }
        }
        return primeFactors;
    }
}
