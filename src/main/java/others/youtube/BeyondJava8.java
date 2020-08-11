package others.youtube;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Life Beyond Java 8, by Trisha Gee / JetBrains Technology Day for Java (2020)
 * https://www.youtube.com/watch?v=gKestt55Q4M
 */
public class BeyondJava8 {

    public static void main( String[] args ) {
        //unmodifiableList();
        //unmodifiableMap();
        //collectToUnmodifiableList();
        predicateNot();

    }

    private static void predicateNot() {
        List.of(1,2,3,4,5).stream()
                .filter(Predicate.not(x->x>3)) //also using not(x->x>3)
                .forEach(System.out::println);
    }

    //collecting to an  unmodifiable List
    private static void collectToUnmodifiableList() {
        List<String> modifiableList = new ArrayList();
        modifiableList.add("A");modifiableList.add("B");modifiableList.add("C");
        List<String> unmodifiableList = modifiableList.stream()
                .collect(Collectors.toUnmodifiableList());
    }

    //creating an unmodifiableMap
    private static void unmodifiableMap() {
        final Map<String, Integer> entries = Map.ofEntries(
                Map.entry("A", 0),
                Map.entry("B", 1),
                Map.entry("C", 2)
        );
        entries.forEach(( s, i ) -> System.out.println(s+ " => "+ i));
    }

    //will throw an unsupportedOperationException
    public static void unmodifiableList(){
        //the old way
        List<String> strings = Arrays.asList("A", "B");
        List<String> stringList = Collections.unmodifiableList(strings);
        stringList.set(0, "C");
        //the new one
        List<String> stringList2 = List.of("A", "B");
        stringList2.set(0, "C");
    }

}
