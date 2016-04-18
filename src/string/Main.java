package string;

import sun.net.www.content.audio.basic;

public class Main {

    public static final char END_CHAR = '.';

    /**
     * Implement an algorithm to determine if a string has all unique
     * characters. What if you can not use additional data structures?
     * 
     * @return restricted for a-z letters
     */
    public static boolean isUniqueCharsAZ(String cad) {
        int cond = 0;
        int val;
        for (int i = 0; i < cad.length(); i++) {
            val = cad.charAt(i) - 'a';
            if ((cond & 1 << val) > 0) {
                return false;
            } else {
                cond = cond | 1 << val;
            }
        }
        return true;
    }

    public static boolean isUniqueChars(String cad) {
        boolean[] cond = new boolean[256];
        int val;
        for (int i = 0; i < cad.length(); i++) {
            val = cad.charAt(i);
            if (cond[val] == true) {
                return false;
            } else {
                cond[val] = true;
            }
        }
        return true;
    }

    /***
     * Write code to reverse a C-Style String. (C-String means that “abcd” is
     * represented as five characters, including the null character.)
     */
    public static String reverse(String source) {
        char[] chars = source.toCharArray();
        int size = chars.length;
        char temp;
        for (int i = 0; i < size / 2; i++) {
            temp = chars[i];
            chars[i] = chars[size - i - 1];
            chars[size - i - 1] = temp;
        }
        return new String(chars) + END_CHAR;
    }

    /***
     * Design an algorithm and write code to remove the duplicate characters in
     * a string without using any additional buffer. NOTE: One or two additional
     * variables are fine. An extra copy of the array is not. FOLLOW UP Write
     * the test cases for this method
     * 
     */
    public static String removeDuplicates(char[] source) {
        if (source == null) {
            return null;
        }
        char look;
        for (int i = 0; i < source.length; i++) {
            look = source[i];
            for (int j = i + 1; j < source.length; j++) {
                if (look == source[j]) {
                    source[j] = 0;
                }
            }
        }
        return new String(source);

    }

    /***
     * Write a method to decide if two strings are anagrams or not.
     */
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        boolean cond = isAnagram(str1, str2);
        cond = cond && isAnagram(str2, str1);
        return cond;
    }

    /***
     * is anagram str1 of str2
     */
    public static boolean isAnagram(String str1, String str2) {
        boolean[] used = new boolean[str2.length()];
        boolean[] done = new boolean[str1.length()];
        char c;
        boolean cond;
        for (int i = 0; i < str1.length(); i++) {
            cond = false;
            c = str1.charAt(i);
            for (int j = 0; j < used.length; j++) {
                if (!used[j]) {
                    if (c == str2.charAt(j)) {
                        used[j] = true;
                        cond = true;
                        break;
                    }
                }
            }
            if (cond) {
                done[i] = true;
            } else {
                return false;
            }
        }
        cond = true;
        for (int i = 0; i < done.length; i++) {
            cond = cond && done[i];
        }
        return cond;
    }

    /**
     * Write a method to replace all spaces in a string with ‘%20’.
     */
    public static String replaceSpaces(String cad) {
        return cad.replaceAll("\\s", "%20");
    }
}
