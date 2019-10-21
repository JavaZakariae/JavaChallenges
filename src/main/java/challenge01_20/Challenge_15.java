package challenge01_20;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 *  The stream can be used only one time.
 *  I mean by used, applying a terminal operation.
 *
 *
 */
public class Challenge_15 {
    public static void main( String[] args ) {
        IntStream intStream1 = List.of(1,2,3,4,5,6)
                                    .stream().mapToInt(n->n);
        IntStream intStream2 = intStream1;

        OptionalInt optionalIntMin = intStream1.min();
        OptionalInt optionalIntMax = intStream2.max();

        int sum = optionalIntMax.orElse(5)+ optionalIntMin.orElse(5);
        System.out.println(sum);
    }
}
