package challenge01_10;

import java.util.List;

/**
 *  The stream could be used only one time; used means applying terminal operation on the stream.
 *
 *
 *  void forEachOrdered(Consumer<? super T> action);
 *  perform the action on the stream preserving the order of the stream components.
 *  even if we use parallel to parallelize the operations.
 */
public class Challenge_10 {

    public static void main( String[] args ) {

        final List<Simpson> simpsons = List.of(new Simpson(10), new Simpson(15),
                new Simpson(11), new Simpson(20),
                new Simpson(22));

        simpsons.stream().parallel().filter(s->s.age>10)
                .map(simpson -> simpson+",")
                .forEachOrdered(System.out::println);

        System.out.println();

        simpsons.stream().parallel().filter(s->s.age>10)
                .map(simpson -> simpson+",")
                .forEach(System.out::println);


    }

    private static class Simpson {
        int age;
        public Simpson( int age ) {this.age = age;}
        @Override
        public String toString() {return ""+this.age;}
    }
}
