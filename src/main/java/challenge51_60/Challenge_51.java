package challenge51_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *  Comparator.comparing method
 *  Collections.sort(list, comparator)
 */
public class Challenge_51 {

    public static void main( String[] args ) {
        ArrayList<Jedi> arrayList = new ArrayList<>();
        arrayList.add(new Jedi("Anakin",10));
        arrayList.add(new Jedi("Luke",5));
        arrayList.add(new Jedi("Luke",6));
        arrayList.add(new Jedi("Obi Wan",7));

        Comparator<Jedi> comparator = Comparator.comparing(Jedi::getName)
                                                .thenComparing(( o1, o2 ) -> o2.age.compareTo(o1.getAge()));
        Collections.sort(arrayList, comparator);
        arrayList.forEach(jedi -> System.out.println(jedi.name+":"+jedi.age));
    }



    static class Jedi{
        String name;
        Integer age;

        public Jedi( String name, Integer age ) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }
}
