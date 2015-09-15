package om.rzr.summit.workshop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int a = 5;
        int b = 10;
        
        System.out.println(a + " + " + b + " = " + MathUtil.add(a,b));
        System.out.println(a + " - " + b + " = " + MathUtil.subtract(a,b));
        
        Cracker thisCracker = CrackerFactory.getCracker();
        
        System.out.println("Got Cracker: " + thisCracker);
    }
   }

