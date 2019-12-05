package challenge51_60;

import java.util.Arrays;

/**
 * public static int binarySearch(Object[] a, Object key)
 *  return the index of the searched key in the given array.
 *      otherwise return the -index -1 ; index value is the position where the element should be inserted.
 *  the given array should be sorted.
 *  the elements in the arrays should be comparable.
 *
 */
public class Challenge_56 {
    static String[] marvel = {"Spiderman","Venom","Carnage","Mysterio"};

    public static void main( String[] args ) {
        Arrays.sort(marvel);
        System.out.println(Arrays.binarySearch(marvel, "Xavier"));
        System.out.println(marvel[Arrays.binarySearch(marvel, "Carnage")]);
        System.out.println(Arrays.binarySearch(marvel, "Lizard"));
        System.out.println(Arrays.binarySearch(marvel, "Apocalypse"));
        System.out.println(Arrays.binarySearch(marvel, "Spiderman"));
    }
}
