package challenge01_20;

import java.util.function.Function;

/**
 * In this Challenge, We learn:
 *    * String.join() method:   String message = String.join("-", "Java", "is", "cool");
 *                                      message = "Java-is-cool";
 *    * Function<String, String> function ----> function.apply() : given an argument of type String the function
 *                                                                 return a String.
 *    * the overridden method in a anonymous class could be called only if we reference the object:
 *      new Jedi(){
 *          overriddenMethod(){...}
 *      };
 *      the above method will be never used, unless we write
 *      new Jedi(){
 *            overriddenMethod(){...}
 *      }.overriddenMethod();
 *      Or if the method is not private--->to verify
 *
 *      To check
 *      https://howtodoinjava.com/java9/java9-private-interface-methods/
 *      https://www.journaldev.com/12850/java-9-private-methods-interfaces
 *      https://dzone.com/articles/default-and-private-methods-in-interfaces
 *
 */
public class Challenge_2 {

    interface Jedi{
        String MASTER = "Yoda";

        default String attack(){
            return jump(stringInput-> String.join(stringInput, useSaber(), this.useForce()));
        }

        private String jump( Function<String, String> function){
            return function.apply("Luke");
        }

        private static String useSaber(){return "S";}

        private String useForce(){return "F";}
    }

    public static void main( String[] args ) {
        System.out.println(new Jedi(){
            public String useForce(){return "X";}}.attack()+ Jedi.useSaber() + Jedi.MASTER);
    }
    //SLukeXSYoda default
    //SLukeFSYoda private
}
