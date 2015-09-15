package om.rzr.summit.workshop;

import java.util.Random;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Cracker Class
 */
public class MathUtilTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MathUtilTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MathUtilTest.class );
    }

    /**
     * Addition Method Test
     */
    public void testAdd()
    {
    	Random random = new Random();
    	int a = random.nextInt(100);
    	int b = random.nextInt(100);
    	assertEquals(a+b,MathUtil.add(a, b));
    }

    /**
     * Subtraction Method Test
     */
    public void testSubtraction()
    {
    	Random random = new Random();
    	int a = random.nextInt(100);
    	int b = random.nextInt(100);
    	assertEquals(a-b,MathUtil.subtract(a, b));
    }

}
