package challenge21_40;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  Regular expressions
 *  * 0 or more
 *  + 1 or more
 *  ? 0 or 1
 *  . any character
 *
 */
public class challenge_25 {
    public static void main( String[] args ) {
        testRegex("lisa@gmail.com");
        testRegex("misterburns$gmail9net.com");
        testRegex("homer07_simpson@hotmail*com");
        testRegex("barney@???????{com");
        testRegex("@&lenny%com");
        testRegex("flanders@duff.");

    }

    static void testRegex(final String msg){
        final String pattern = "^[A-Z0-9]*[@|$][&]?[a-z0-9]+.[a-z]{2,6}$";
        final Pattern compiledPattern = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        final Matcher matcher = compiledPattern.matcher(msg);
        if (matcher.find()){
            System.out.println("Founded value "+ matcher.group(0));
        }else {
            System.out.println("No match");
        }
    }

}
