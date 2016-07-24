import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daaron on 7/24/16.
 */
public class Tests {

    @Test
    public void testMySolution() {
        int[] a = {1, 5, 9};
        int[] b = {6, 3, 9};

        List<Integer> result = new ArrayList<Integer>();
        result.add(14);
        result.add(15);
        result.add(18);

        Assert.assertArrayEquals(result.toArray(), MySolution.solveProblem(a, b).toArray());
    }


}
