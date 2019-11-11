package challenge31_40;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *  If we son't initialize the t instance variable, it will be equals to null;
 *  the null value can create many problems as the example below
 *
 */
public class Challenge_40 <T> {

    T t;

    public static void main( String[] args ) {
        doStuffWithNullValue(null);
        
        if (null instanceof Object)
            System.out.println("null is instance of object");
        if(null instanceof AtomicInteger)
            System.out.println("null is instance of AtomicInteger");
        if(null instanceof StackOverflowError)
            System.out.println("null is instance of StackOverflowError");
        if (new ArrayList<>() instanceof Cloneable)
            if (new String() instanceof CharSequence)
                if (new Challenge_40<>().t instanceof Object)
                    System.out.println("Exception");

    }

    private static void doStuffWithNullValue( Integer number ) {
        if (number instanceof Integer)
            System.out.println("Do some logic .....");
    }
}
