package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        if(n > 1) {
            primeFactors.add(n);
        }
        return primeFactors;
    }
}
