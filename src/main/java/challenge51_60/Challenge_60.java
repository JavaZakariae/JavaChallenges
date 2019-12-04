package challenge51_60;

import java.util.List;
import java.util.function.Predicate;

/**
 *  stream reduce operation.
 *  filter and allmatch regarding the intermediate operation behaviour.
 *  // TODO: 04/12/2019 understand all the overloaded reduce methods.
 *
 *  Optional<T> reduce(BinaryOperator<T> accumulator)
 *  T reduce(T identity, BinaryOperator<T> accumulator)
 *
 *  Identity : initial value of the reduction, and in the same time
 *  a default result if the stream is empty.
 *
 *  Accumulator : A function that takes two parameters, BinaryOperator<T> extends BiFunction<T,T,T>
 *          the two parameters are : the partial result of the reduction operation
 *          and the next element of the stream.
 */
public class Challenge_60 {
    public static void main( String[] args ) {
        List<String> list = List.of("Neo", "Morpheus", "Oracle", "Trinity", "Neo");
        Predicate<String> neoSearch = str -> {
            System.out.println("Agent Smith is looking for Neo...");
            return str.contains("Neo");
        };
        var binaryNumbers = List.of(1, 0, 1, 1).stream();
        Integer binarySum = binaryNumbers.reduce(Integer::sum).orElseThrow(StackOverflowError::new);

        boolean neoFound = list.stream().filter( s -> s.length() >= binarySum).allMatch(neoSearch);
        System.out.println(neoFound);
    }
}
