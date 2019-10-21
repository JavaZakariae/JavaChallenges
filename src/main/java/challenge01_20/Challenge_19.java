package challenge01_20;

import java.util.Set;

/**
 *
 * java.lang.IllegalArgumentException: duplicate element will be thrown when we pass duplicate element
 * to the Set.of() method.
 */
public class Challenge_19 {

    public static void main( String[] args ) {
        Set<Warrior> warriors = Set.of(new Warrior("Ezio"), new Warrior("Ezio"),
                new Warrior("Kratoes"), new Warrior("Cloud"), new Warrior("Aucard"));
        warriors.stream()
                .distinct()
                .forEach(warrior -> System.out.println(warrior.name));
    }

    static class Warrior {
        private String name;

        public Warrior( String name ) {
            this.name =  name;
        }

        @Override
        public int hashCode() {
            return this.name.length();
        }

        @Override
        public boolean equals( Object obj ) {
            return this.name.equals(((Warrior) obj).name);
        }
    }
}
