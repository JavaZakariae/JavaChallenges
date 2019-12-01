package challenge51_60;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *  Laziness of lambda expression
 *  Supplier --> get
 *  Function --> apply
 *  Consumer --> accept
 *
 */
public class Challenge_55 {

    private static int drunkenness;

    public static void main( String[] args ) {
        Supplier<Integer> moebSupplier = () -> drunkenness = 5;
        drunkenness = 10;
        Function<Integer, Integer> processBeer = beerProcessor -> drunkenness = (beerProcessor + 2);
        Consumer<Integer> homerBeerConsumer = System.out::println;

        homerBeerConsumer.accept(moebSupplier.get()+ processBeer.apply(drunkenness));
    }
}
