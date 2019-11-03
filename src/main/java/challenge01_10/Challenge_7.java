package challenge01_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *  Generic challenges
 */
public class Challenge_7 {

    public static void main( String[] args ) {

        List<String> firstResult  = Challenge_7.get(new ArrayList<>(), new String("2"));
        // "Homer will be resolved as an Object to adapt to the generic  arguments of the called method"
        List<Object> secondResult = Challenge_7.get("Homer", Double.valueOf("4"));
        Stream<Object> stream = Stream.concat(firstResult.stream(), secondResult.stream());
        stream.forEach(System.out::println);
    }

    public static <T> List<T> get( List<T> list, T t){
        list.add(t);
        return list;
    }

    public static <T, R extends T> List<T> get(T type1,R type2){
        List<T> list = new ArrayList<>();
        list.add(type1);
        list.add(type2);
        return list;
    }
}
