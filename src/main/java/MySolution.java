import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by daaron on 7/24/16.
 */
public class MySolution {

    public static List<Integer> solveProblem(int[] a, int[] b) {
        // Resulting list to eventually be returned:
        List<Integer> result = new ArrayList<Integer>();

        // Creating a list of all possible sums:
        List<Integer> allSums = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                allSums.add(a[i] + b[j]);
            }
        }

        // Organizes the list of all sums:
        Collections.sort(allSums);

        // Adds the largest sums to the resulting list:
        int indexToAdd = allSums.size() - a.length;
        int times = 0;
        while (times < a.length) {
            result.add(allSums.get(indexToAdd));
            indexToAdd++;
            times++;
        }

        return result;
    }


}
