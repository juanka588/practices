package bitwise;

import bit.BitwiseExercises;
import junit.framework.TestCase;

public class TestBitwiseExercises extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testUpdateBits() {
        int n = Integer.parseInt("10000000000", 2), m = Integer.parseInt("10101", 2), i = 2, j = 6;
        int result = BitwiseExercises.updateBits(n, m, i, j);
        assertEquals(Integer.parseInt("10001010100", 2), updateBits(n, m, i, j));
        assertEquals(Integer.parseInt("10001010100", 2), result);
    }

    public int updateBits(int n, int m, int i, int j) {
        int max = ~0; /* All 1’s */

        // 1’s through position j, then 0’s
        int left = max - ((1 << j) - 1);

        // 1’s after position i
        int right = ((1 << i) - 1);

        // 1’s, with 0s between i and j
        int mask = left | right;

        // Clear i through j, then put m in there
        return (n & mask) | (m << i);
    }

}
