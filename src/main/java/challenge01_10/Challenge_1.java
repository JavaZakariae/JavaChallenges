package challenge01_10;

import java.util.Optional;

/**
 * The original challenge could be found on :
 *    https://youtu.be/Tl1SWgL37Fs?list=PL3py5YSIGvPMgKXOVqnYn9nBoT_zvsvsi
 *
 * In this challenge, we can understand how orElse, orElseGet() works internally.
 *      T orElse(T other) : calling orElse will evaluate the other object.
 *      T orElseGet(Supplier<? extends T> other) only if there is no value present on the optional
 *                                  the other expression will be evaluated.
 *      Replacing += by + help a lot debug the program.
 **/

public class Challenge_1 {

    static String finalZionValue="" ;
    static int matrixCount = 0;

    public static void main( String[] args ) {
        Optional<String> optFromMatrix = Optional.ofNullable(finalZionValue);
        String agentSmith = "Virus";
        finalZionValue += Optional.ofNullable(agentSmith).orElse(getVisionFromOracle());

        String s = optFromMatrix.orElseGet(Challenge_1::getVisionFromOracle);
        finalZionValue = finalZionValue + s;

        finalZionValue+= matrixCount;
        String neo = null;

        try {
            Optional.ofNullable(neo).orElseThrow(IllegalArgumentException::new);
        }catch (Exception e){
        }
        System.out.println(finalZionValue);
    }

    private static String getVisionFromOracle() {
        matrixCount++;
        finalZionValue = "KeyMaker";
        return "Architect";
    }
}
