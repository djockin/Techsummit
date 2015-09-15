package om.rzr.summit.workshop;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Cracker Class
 */
public class CrackerFactoryTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CrackerFactoryTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CrackerFactoryTest.class );
    }

    /**
     * CrackerFactory Test
     */
    public void testCrackerFactory()
    {
    	Cracker thisCracker = CrackerFactory.getCracker();
        assertTrue( thisCracker instanceof Cracker );
        assertEquals("Saltine", thisCracker.toString());
    }
}
