package challenge51_60;

import java.util.function.*;

/**
 * @FunctionalInterface
 * Predicate<T>   {boolean test(T t){}}
 * Function<T, R> {R apply(T T){}}
 * Consumer<T>    {void accept(T t){}}
 * Supplier<T>  {T get(){}}
 * UnaryOperator<T> extends Function<T,T>
 * BinaryOperator<T> extends BiFunction<T,T,T> extends Function<T,T,T>
 *
 */
public class Challenge_53 {

    public static void main( String[] args ) {

        Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> number -> number > pivot;

        Supplier<Integer> moeSupplier = () -> {return 5;};
        Consumer<Object> homerConsumer = System.out::println;

        UnaryOperator<Integer> carlOperator = (c) -> Integer.valueOf(c);
        BinaryOperator<Integer> barneyOperator = Integer::sum;

        var beersSum = carlOperator.apply(5) + barneyOperator.apply(2, 2);//9

        System.out.println(moeSupplier.get());//5
        System.out.println(beersSum);//9
        homerConsumer.accept(isGreaterThan.apply(moeSupplier.get()).test(beersSum));


    }

}
