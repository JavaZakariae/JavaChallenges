package challenge31_40;

import java.util.List;

/**
 *
 */
public class Challenge_39 {
    public static void main( String[] args ) {

        List<Jedi> jediList = List.of(new Jedi("Luke", 20),
                new Jedi("Obiman", 30), new Jedi("QinGon", 40));

        jediList.stream()
                .filter(jedi -> jedi.name.startsWith("Obi") || jedi.name.startsWith("Luke"))
                .filter(jedi -> jedi.name.startsWith("QinGon"))
                .map(Jedi::getAge)
                .filter(age->age>10)
                .forEach(System.out::println);
    }

    static class Jedi {
        private String name;
        private int age;

        public Jedi( String name, int age ) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}
