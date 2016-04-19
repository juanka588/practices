package bit;

public class BitwiseExercises {

    /**
     * You are given two 32-bit numbers, N and M, and two bit positions, i and
     * j. Write a method to set all bits between i and j in N equal to M (e.g.,
     * M becomes a substring of N located at i and starting at j).
     */
    public static int updateBits(int n, int m, int i, int j) {
        int result;
        System.out.println(Integer.toString(n, 2));
        System.out.println(Integer.toString(m, 2));
        int mask = ~(((1 << j) - 1) << i);
        System.out.println(Integer.toString(mask, 2));
        result = n & mask;
        System.out.println(Integer.toString(result, 2));
        result = result | (m << i);
        System.out.println(Integer.toString(result, 2));
        return result;
    }

}
