package challenge11_20;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *  to be reviewed
 *
 */
public class Challenge_12 {

    static BiFunction<Integer,Integer,Integer> heisenberg = (a,b) -> a+b;

    static Function<Integer,Integer> jesse = a -> a-2;

    static BiFunction<Integer,Integer,Integer> saul =
                                                heisenberg.andThen(jesse);

    static BiConsumer<Integer, Integer> gustavo =
                                          (a,b) -> System.out.println(a+2/b+2);

    public static void main( String[] args ) {
        var firstLaunder = saul.apply(2,2);
        heisenberg.andThen(jesse);

        var secondLaunder = heisenberg.apply(2,2);
        gustavo.accept(firstLaunder, secondLaunder);
    }
}
