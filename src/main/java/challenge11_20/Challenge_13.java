package challenge11_20;

import java.util.ArrayList;

/**
 *  Integer i1 = new Integer(12);
 *  Integer i2 = new Integer(12);
 *    i1 == i2  --->  false
 *
 *  Integer i3 = 12;
 *  Integer i4 = 12;
 *    i3 == i4  --->  true
 *
 *  Integer i5 = 128;
 *  Integer i6 = 128;
 *    i5 == i6  --->  false
 *
 *  from java doc // range [-128, 127] must be interned (JLS7 5.1.7)
 */
public class Challenge_13 {
    public static void main( String[] args ) {

        final ArrayList<Integer> list = new ArrayList<>();
        list.add(22);list.add(12);
        list.add(14);list.add(128);

        Integer prestoAge = 14;
        Integer dungeonMasterAge = 128;

        list.removeIf(e ->   e == new Integer(12)
                           || e == dungeonMasterAge
                           || e == prestoAge
                           || e.equals(new Integer(22)));


        Integer i1 = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println(i1 == i2);

        Integer i3 = 12;
        Integer i4 = 12;
        System.out.println(i3 == i4);


        Integer i5 = new Integer(12);
        Integer i6 = 12;
        System.out.println(i5 == i6);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(14);
        Integer a = list1.get(0);
        Integer b = 14;

        System.out.println(a==b);


        Integer c = new Integer(14);
        Integer d = 14;
        System.out.println(c==d);
        System.out.println(list);

    }
}
