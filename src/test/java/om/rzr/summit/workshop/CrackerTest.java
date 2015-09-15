package om.rzr.summit.workshop;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Cracker Class
 */
public class CrackerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CrackerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CrackerTest.class );
    }

    /**
     * Cracker Test
     */
    public void testCracker()
    {
    	Cracker thisCracker = new Cracker();
        assertTrue( thisCracker instanceof Cracker );
        assertEquals("Saltine", thisCracker.toString());
    }
}
