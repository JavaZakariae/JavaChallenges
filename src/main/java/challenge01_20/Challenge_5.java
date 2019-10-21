package challenge01_20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *  In this challenge we have:
 *     + when creating collection using the of method, we create immutable collection, so
 *      for example: List<String> list = List.of(); we can't modify the list.
 *      as a result an exception is thrown.
 *
 *     + Set.of() and Set.copyOf() return an unmodifiable Set.
 *        Set.of("Joker","Riddler","Joker") will throw an exception as the arguments contains duplicate elements.
 */
public class Challenge_5{

    public static void main( String[] args ) {
        final Collection<Object> finalDcCharacters = new ArrayList<>();
        List<String> list = List.of();  //empty list
        Set<Object> set = Set.of();     //empty set

        try {
            list.add("Deadpool");        // all mutating methods throw UnsupportedOperationException
        }catch (UnsupportedOperationException e){
            System.out.println("no space fro Marvel hero here");
        }

        try {
            final List<Object> objects = set.stream().collect(Collectors.toList());
            boolean added = objects.add("Harley Quinn");
            System.out.println("added "+added);
            finalDcCharacters.addAll(new ArrayList<>(set));
        }catch (UnsupportedOperationException | IllegalArgumentException e){
            System.out.print("no space for villains");
            System.exit(0);
        }
        try {
            var villains = Set.copyOf(set);//this method return an unmodifiable Set
            finalDcCharacters.addAll(List.of(villains, Set.of("Joker","Riddler","Joker")));
        }catch (IllegalArgumentException e){
            System.out.println("Where are the villains?");
        }
        finalDcCharacters.forEach(System.out::println);
    }
}
