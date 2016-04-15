package string;

import junit.framework.TestCase;

public class testMain extends TestCase {

    protected void setUp() throws Exception {
    }

    public void testIsUniqueChars() {
        assertFalse(Main.isUniqueChars("Not yet implemented"));
        assertTrue(Main.isUniqueChars("Nuyi"));
    }

    public void testReverse() {
        assertEquals("juan"+Main.END_CHAR,Main.reverse("nauj"));
    }

}
