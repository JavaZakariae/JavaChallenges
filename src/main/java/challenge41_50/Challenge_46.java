package challenge41_50;

import java.util.List;
import java.util.stream.Stream;

/**
 *  Stream.ofNullable(someObject) return Stream of someObject if someObject!=null.
 *  it returns emptyStream if  someObject==null.
 *
 *  Stream.ofNullable is very helpful to avoid nullPointerException.
 *
 */
public class Challenge_46 {
    public static void main( String[] args ) {
        Soprano soprano = null;
        Stream.ofNullable(soprano)
                .filter(s->s.guns.get(0)==null)
                .forEach(s -> System.out.println(s.guns.size()));
    }
    private static class Soprano {
        List<String> guns;

        public Soprano( List<String> guns ) {
            this.guns = guns;
        }
    }
}
