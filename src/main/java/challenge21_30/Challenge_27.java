package challenge21_30;

import java.util.HashSet;
import java.util.Set;

/**
 * equals and hashcode regarding the use of the HashSet data structure.
 *
 */
public class Challenge_27 {

    public static void main( String[] args ) {
        System.out.println(new Simpson("Bart").equals(new Simpson("Bart")));
        final Simpson overriddenSimpson = new Simpson("Homer") {
            @Override
            public int hashCode() {
                return (43 + 777) + 1;
            }
        };

        System.out.println(new Simpson("Homer").equals(overriddenSimpson));

        var set = new HashSet<>(Set.of(new Simpson("Homer"), new Simpson("Marge")));
        set.add(new Simpson("Homer"));
        set.add(overriddenSimpson);

        System.out.println(set.size());
    }

    private static class Simpson {
        private String name;

        public Simpson( String name ) {
            this.name = name;
        }

        @Override
        public boolean equals( Object obj ) {
            Simpson otherSimpson = (Simpson) obj;
            return this.name.equals(otherSimpson.name)
                    && this.hashCode()==otherSimpson.hashCode();
        }

        @Override
        public int hashCode() {
            return (43+777);
        }
    }
}
