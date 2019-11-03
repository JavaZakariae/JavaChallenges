package challenge11_20;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * // TODO: 16/10/2019 How the generic functionality is executed
 *
 */
public class Challenge_16 {
    public static void main( String[] args ) {
        SimpsonFactory<Simpson> simpsonFactory = new SimpsonFactory<>(new Simpson("homer"));
        List list = simpsonFactory.addToList(new ArrayList<>(), new ArrayList<>());
        System.out.println(((List<Simpson>) list).get(0).name);
    }

    static class Simpson {
        String name;
        public Simpson( String name ) {
            this.name=name;
        }
    }

    static class SimpsonFactory<T> {
        T t;
        public SimpsonFactory(T t){this.t=t;}

        public List<T> addToList( List<T> simpson1, List<? super Simpson> simpson2){
            simpson1.add(t);
            simpson2.add(new Simpson("Maggie"));
            return simpson1;
        }
    }
}
