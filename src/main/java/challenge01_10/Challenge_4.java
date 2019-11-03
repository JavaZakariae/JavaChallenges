package challenge01_10;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 *  Java 9 feature: takeWhile, dropWhile
 *
 *  from https://blog.indrek.io/articles/whats-new-in-java-9-streams/
 *
 *  takeWhile
 *      Stream.of(2, 4, 6, 8, 9, 10, 12)
 *            .takeWhile(n -> n % 2 == 0)
 *            .forEach(System.out::print);
 *  // prints out:
 *  // 2 4 6 8
 *  Whenever we break the prediction we stop iteration.
 *
 *
 *  dropWhile
 *      Stream.of(2, 4, 6, 8, 9, 10, 12)
 *            .dropWhile(n -> n % 2 == 0)
 *            .forEach(System.out::println);
 *  // prints out:
 *  // 9 10 12
 *  Whenever we break the prediction we stop iteration.
 */
public class Challenge_4 {

    public static void main( String[] args ) {
        final List<Integer> list = List.of(9, 7, 1, 8, 5);
        final Set<Integer> set = Set.of(9, 6, 5, 7, 8);

        final Stream<Integer> filteredList = list.stream()
                .takeWhile(i -> i > 5) //9 7
                .dropWhile(i -> i > 8);//7

        final Stream<Integer> filteredSet = set.stream()
                .takeWhile(i -> i > 1)//9 6 5 7 8    as we don't have order in the Set data structure we will have a nondeterministic result
                .dropWhile(i -> i > 7);// 6 5 7 8

        Stream.of(filteredList, filteredSet)
                // 7, 6 5 7 8
                .flatMap(h->h)
                .forEach(System.out::print);
    }

}
