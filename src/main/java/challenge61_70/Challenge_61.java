package challenge61_70;

import java.util.HashMap;
import java.util.Map;

/**
 *  HashMap's hashcode implementation
 *  HashMap's put operation.
 */
public class Challenge_61 {
    public static void main( String[] args ) {
        Map<Map<Object, String>, String> mainMap = new HashMap<>();

        Map<Object, String> subMap1 = new HashMap<>();
        subMap1.put(1, "A");

        Map<Object, String> subMap2 = new HashMap<>();
        subMap2.put(1, "A");

        Map<Object, String> subMap3 = new HashMap<>();
        subMap3.put(65, "\01");

        System.out.println("subMap1.hashCode() = " + subMap1.hashCode());
        System.out.println("subMap3.hashCode() = " + subMap3.hashCode());
        mainMap.put(subMap1, "crazyMap1");
        mainMap.put(subMap2, "crazyMap2");
        mainMap.put(subMap3, "crazyMap3");

        System.out.println(mainMap.size());


        System.out.println("mainMap.get(subMap1) = " + mainMap.get(subMap1));
        System.out.println("mainMap.get(subMap3) = " + mainMap.get(subMap3));


    }
}
