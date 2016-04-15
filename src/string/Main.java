package string;

import java.util.Collections;

public class Main {

    public static final char END_CHAR = '.';

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

    /***
     * Write code to reverse a C-Style String. (C-String means that “abcd” is
     * represented as five characters, including the null character.)
     */
    public static String reverse(String source) {

        char chars[] = source.toCharArray();
        int size = chars.length;
        char temp;
        for (int i = 0; i < size / 2; i++) {
            temp = chars[i];
            chars[i] = chars[size - i - 1];
            chars[size - i - 1] = temp;
        }
        return new String(chars)+END_CHAR;

    }
}
