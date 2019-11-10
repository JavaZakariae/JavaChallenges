package challenge31_40;

import java.util.function.BiFunction;

/**
 *
 * Method references
 * BiFunction and its apply method.
 */
public class Challenge_37 {

    public static void main( String[] args ) {
        BiFunction<Integer, Integer, Integer> add = Challenge_37::add;
        int result = add.apply(10,20);

        BiFunction<Double, Float, Integer> substract = Challenge_37::substract;
        result+= substract.apply(10D, (float)10D);
        System.out.println("result = " + result);
    }

    static int add(double a, double b){
        return  (int)(a+b);
    }

    static int substract(double a, double b){
        return  (int)(a-b+a);
    }

}
