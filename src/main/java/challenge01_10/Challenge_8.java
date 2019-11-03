package challenge01_10;

import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 *        Pattern.compile(" ")
 *               .splitAsStream(My Name is)
 *        will produces the Stream<String> result = ["My","Name","is"]
 *        ;
 *
 */
public class Challenge_8 {

    public static void main( String[] args ) {
        String str = "Luke DarthVader ObiWan QuiGonJinn Palpatine";
        //this function, given a String produces a Stream of String based on the Pattern used
        Function<String, Stream<String>> lineSplitter = l-> Pattern.compile(" ")
                                                                  .splitAsStream(l);
        final Stream<String> stringStream = Stream.of(str);
        stringStream.flatMap(lineSplitter)
              .sorted((o1, o2)->o2.compareTo(o1))
              .forEachOrdered(System.out::println);
    }
}
