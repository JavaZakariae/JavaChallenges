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
 *
 */
public class Challenge_2 {

    interface Jedi{
        String MASTER = "Yoda";

        //default String attack(){return jump(jedi-> String.join(jedi, useSaber(), useForce())); }
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
}
