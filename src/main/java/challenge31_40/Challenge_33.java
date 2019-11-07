package challenge31_40;

import java.util.*;

/**
 * TreeSet implementation regarding sorting criterion.
 */
public class Challenge_33 {
    public static void main( String[] args ) {
        Set<Simpson> set = new TreeSet<>();
        set.add(new Simpson("Homer"));
        set.add(new Simpson("Marge"));
        set.add(new Simpson("Lisa"));
        set.add(new Simpson("Bart"));
        set.add(new Simpson("Maggie"));

        ArrayList<Object> list = new ArrayList<>();
        list.addAll(set);
        Collections.reverse(list);
        list.forEach(System.out::println);
    }

    static class Simpson implements Comparable<Simpson>{
        String name;

        public Simpson( String name ) {
            this.name = name;
        }
        @Override
        public String toString() {
            return this.name;
        }

        /**
         *  the trick
         */
        @Override
        public int compareTo( Simpson simpson ) {
            return simpson.name.compareTo(this.name);
        }
    }
}
