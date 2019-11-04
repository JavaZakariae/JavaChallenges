package challenge21_30;

import java.util.HashSet;
import java.util.Set;

/**
 *  HashSet functionality regarding the hashcode and the equals methods.
 */
public class Challenge_29 {
    public static void main( String[] args ) {
        Set<Borat> borats = new HashSet<>();
        borats.add(new Borat(1, "Kazakhistan"));
        borats.add(new Borat(2, "USAndA"));
        borats.add(new Borat(2, "England"));
    }

    static class Borat {
        int id;
        String country;

        public Borat( int id, String country ) {
            this.id = id;
            this.country = country;
        }

        @Override
        public int hashCode() {
            System.out.println("hashcode:"+ this.id+this.country);
            return this.id;
        }

        @Override
        public boolean equals( Object obj ) {
            System.out.println("equals:"+this.id+this.country);
            return ((Borat) obj).country.equals(this.country);
        }
    }
}
