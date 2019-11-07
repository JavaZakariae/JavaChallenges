package challenge31_40;

/**
 *  unlike StringBuilder, String are immutable.
 */
public class Challenge_32 {
    public static void main( String[] args ) {
        var jedi = "masterYoda";
        changeString(jedi);
        System.out.println(jedi);
    }

    private static String changeString( String word ) {
        word.replace(word, "newMasterYoda");
        return word;
    }
}
