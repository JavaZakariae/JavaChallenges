package challenge41_50;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 */
public class Challenge_43 {

    public static void main( String[] args ) {

        Animal animalOne = new Animal("Diosaur", Set.of("chiken", "Ice cream"));
        Animal animalTwo = new Animal("Dog", Set.of("Bones", "cheese", "Soda"));
        List<String> collect = List.of(animalOne, animalTwo)
                                   .stream()
                                   .map(Animal::getFoods)
                                   //.map(Set::stream)
                                   .flatMap(setOfStrings -> setOfStrings.stream())
                                   // .flatMap(Set::stream)
                                   .limit(4)
                                   .filter(s -> s.matches(".*"))
                                   .collect(Collectors.toList());
        collect.forEach(System.out::println);


    }

    static class Animal{
        private String name;
        private Set<String> foods;

        public Animal( String name, Set<String> foods ) {
            this.name = name;
            this.foods = foods;
        }

        public String getName() {
            return name;
        }

        public Set<String> getFoods() {
            return foods;
        }
    }
}
