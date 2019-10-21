package challenge01_20;

import java.util.List;

/**
 *
 */
public class Challenge_20 {

    public static void main( String[] args ) {
        List<Simpson> list = List.of(new Simpson("Homer", 35),
                new Simpson("Margie", 35),
                new Simpson("Bart", 10),
                new Simpson("Lisa", 8));

        list.stream()
                .filter(simpson -> simpson.getName().equals("Bart"))
                .filter(simpson -> simpson.getAge()>9)
                .findFirst();
    }

    //Homer Margie Bart 10
    private static class Simpson {
        private String name;
        private int age;

        public Simpson( String name, int age ) {
            this.age=age;
            this.name=name;
        }

        public String getName() {
            System.out.println(name);
            return name;
        }

        public int getAge() {
            System.out.println(age);
            return age;
        }
    }
}
