import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CheckItTest {

    @Test
    public void testCheckIt_PredicateCoverage() {
        // Test case 1: a = true, b = true, c = true
        assertEquals("P is true", CheckIt.checkIt(true, true, true));

        // Test case 2: a = false, b = false, c = false
        assertEquals("P isn't true", CheckIt.checkIt(false, false, false));


    }

    @Test
    public void testCheckIt_ClauseCoverage() {
        // Test case 1: a = true, b = true, c = true
        assertEquals("P is true", CheckIt.checkIt(true, true, true));


        // Test case 5: a = false, b = false, c = false
        assertEquals("P isn't true", CheckIt.checkIt(false, false, false));

    }
    // Test cases for a evaluating to true
    @Test
    public void CACCtest1() {
        assertEquals("P is true", CheckIt.checkIt(true, true, true));
        assertEquals("P isn't true", CheckIt.checkIt(false, true, false));
    }
    @Test
    public void CACCtest2() {
        assertEquals("P is true", CheckIt.checkIt(true, true, true));
        assertEquals("P isn't true", CheckIt.checkIt(false, false, true));
    }
    @Test
        public void CACCtest3() {
        assertEquals("P is true", CheckIt.checkIt(true, true, true));
        assertEquals("P isn't true", CheckIt.checkIt(false, false, false));
    }
    // Test cases for a evaluating to false
    @Test
    public void CACCtest4() {
        assertEquals("P is true", CheckIt.checkIt(true, false, false));

        assertEquals("P isn't true", CheckIt.checkIt(false, true, false));


    }
    @Test
    public void CACCtest5() {
        assertEquals("P is true", CheckIt.checkIt(true, false, false));

        assertEquals("P isn't true", CheckIt.checkIt(false, false, true));


    }
    @Test
    public void CACCtest6() {
        assertEquals("P is true", CheckIt.checkIt(true, false, false));

        assertEquals("P isn't true", CheckIt.checkIt(false, false, false));


    }
    @Test
    public void RACCtest1() {
        assertEquals("P is true", CheckIt.checkIt(true, false, false));

        assertEquals("P isn't true", CheckIt.checkIt(false, false, false));


    }
    @Test
    public void RACCtest2() {
        assertEquals("P is true", CheckIt.checkIt(true, true, false));

        assertEquals("P isn't true", CheckIt.checkIt(false, true, false));


    }
    @Test
    public void RACCtest3() {
        assertEquals("P is true", CheckIt.checkIt(true, false, true));

        assertEquals("P isn't true", CheckIt.checkIt(false, false, true));


    }


}
