package string;

public class Main {

    public static void main(String[] args) {

        System.out.println(isUniqueChars("hello world"));
        System.out.println(isUniqueChars("abcs world"));

    }

    /**
     * Implement an algorithm to determine if a string has all unique
     * characters. What if you can not use additional data structures?
     * 
     * @return
     */
    public static boolean isUniqueChars(String cad) {
        int cond = 0;
        int val;
        for (int i = 0; i < cad.length(); i++) {
            val = cad.charAt(i);
            if ((cond & 1 << val) > 0) {
                return false;
            } else {
                cond = cond | 1 << val;
            }
        }
        return true;
    }
}
