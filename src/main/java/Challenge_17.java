import java.util.stream.IntStream;

/**
 * iterate---> generate an infinite stream
 * dropWhile drop element from stream and break when the predicate is evaluated to false.
 * takeWhile add element to the result  and break when the predicate is evaluated to false..
 */
public class Challenge_17 {

    public static void main( String[] args ) {

        IntStream.iterate(10, i->i-2)
                 .limit(5)
                 .skip(1)
                 .dropWhile(i-> i<6)
                 .sorted()
                 .takeWhile(i-> i>2)
                 .forEach(System.out::println);
    }
}
