import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;

import static primeFactors.PrimeFactors.generate;

public class PrimeFactorsTest extends TestCase {

    private List<Integer> list(int... args) {
        List<Integer> list = new ArrayList<>();
        for (int i : args) {
            list.add(i);
        }
        return list;
    }

    public void testOne() throws Exception {
        assertEquals(list(), generate(1));
    }

    public void testTwo() throws Exception {
        assertEquals(list(2), generate(2));
    }

    public void testThree() throws Exception {
        assertEquals(list(3),generate(3));
    }

    public void testFour() throws Exception {
        assertEquals(list(2,2),generate(4));
    }

}
