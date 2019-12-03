package challenge51_60;

import java.util.List;
import java.util.stream.Stream;

/**
 *  unlike forEach, peek is an intermediate operation.
 *  peek return a stream of T, forEach return void, both
 *  receive a consumer lambda expression as an input argument.
 *
 */
public class Challenge_58 {

    public static void main( String[] args ) {

        List<String> list = List.of("Yoda", "Luke", "Anakin", "Obi Wan", "Luke");
        list.stream()
                .skip(1)
                .filter(jedi->jedi.startsWith("Lu"))
                .limit(4)
                .distinct()
                .map(String::length)
                .flatMap(jedi-> Stream.of(jedi))
                .peek(System.out::println);
    }
}
