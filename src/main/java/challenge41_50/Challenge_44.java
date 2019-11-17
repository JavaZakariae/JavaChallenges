package challenge41_50;

import java.util.function.Predicate;

/**
 *  String
 *  Predicate<String>
 *      and, or, negate ---> default implementation in the interface.
 *      boolean test(String s) should be overridden.
 */
public class Challenge_44 {
    public static void main( String[] args ) {
        var newSlay = "---";
        var jamesShot = "---";

        final Predicate<String> pyramidHeadAttack = new Predicate<String>() {
            @Override
            public boolean test( String s ) {
                return newSlay == new String(s).intern();
            }                                  //true
        }.and(new PyramidHead())               //&& false
         .or(james->james.equals(jamesShot))   //||true
         .negate();                             //!true--> false
        System.out.println(pyramidHeadAttack.test("---"));

    }

    static class PyramidHead implements Predicate<String> {
        @Override
        public boolean test( String s ) {
            return s.equals("--!");
        }
    }
}
