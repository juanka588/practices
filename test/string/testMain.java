package string;

import junit.framework.TestCase;

public class testMain extends TestCase {

    protected void setUp() throws Exception {
    }

    public void testIsUniqueChars() {
        assertFalse(Main.isUniqueCharsAZ("Not yet implemented"));
        assertTrue(Main.isUniqueCharsAZ("Nuyi"));
        assertTrue(Main.isUniqueChars("@#156248è!çà^$`ù=:"));
    }

    public void testReverse() {
        assertEquals("juan" + Main.END_CHAR, Main.reverse("nauj"));
    }

    public void testDuplicate() {
        String cad = "juuannu";
        cad = Main.removeDuplicates(cad.toCharArray());
        assertEquals("juan", cad.replaceAll("\u0000", ""));
    }

    public void testAnagram() {
        String cad = "ana";
        String cad2 = "banana";
        assertTrue(Main.isAnagram(cad, cad2));

        assertFalse(Main.isAnagram(cad2, cad));

        cad = "anaban";
        cad2 = "banana";
        assertTrue(Main.isAnagram(cad, cad2));

        assertTrue(Main.areAnagrams(cad, cad2));
    }
}
