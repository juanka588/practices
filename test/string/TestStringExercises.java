package string;

import junit.framework.TestCase;

public class TestStringExercises extends TestCase {

    protected void setUp() throws Exception {
    }

    public void testIsUniqueChars() {
        assertFalse(StringsExercises.isUniqueCharsAZ("Not yet implemented"));
        assertTrue(StringsExercises.isUniqueCharsAZ("Nuyi"));
        assertTrue(StringsExercises.isUniqueChars("@#156248è!çà^$`ù=:"));
    }

    public void testReverse() {
        assertEquals("juan" + StringsExercises.END_CHAR, StringsExercises.reverse("nauj"));
    }

    public void testDuplicate() {
        String cad = "juuannu";
        cad = StringsExercises.removeDuplicates(cad.toCharArray());
        assertEquals("juan", cad.replaceAll("\u0000", ""));
    }

    public void testAnagram() {
        String cad = "ana";
        String cad2 = "banana";
        assertTrue(StringsExercises.isAnagram(cad, cad2));

        assertFalse(StringsExercises.isAnagram(cad2, cad));

        cad = "anaban";
        cad2 = "banana";
        assertTrue(StringsExercises.isAnagram(cad, cad2));

        assertTrue(StringsExercises.areAnagrams(cad, cad2));
    }
}
