package challenge51_60;

/**
 *  // TODO: 05/12/2019  erasure explanation
 */
public class Challenge_57 {

    static <T> T cast(Object anyPokemon){return (T) anyPokemon;}

    public static void main( String[] args ) {
        Object charmander = 10;
        int pikachu = 10;
        Integer wartortle = 10;

        Integer newtwo = (Integer)89898989;

        Integer pokeball1 = cast(charmander);
        Integer pokeball2 = cast(pikachu);
        Integer pokeball3 = cast(wartortle);
        String  pokeball4 = cast(newtwo);

        System.out.printf("p1= %d, p2= %d, p3= %d, p4= %s", pokeball1, pokeball2, pokeball3, pokeball4);
    }
}
