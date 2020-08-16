package others.youtube;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Life Beyond Java 8, by Trisha Gee / JetBrains Technology Day for Java (2020)
 * https://www.youtube.com/watch?v=gKestt55Q4M
 * @todo java 13 and above
 */
public class BeyondJava8 {

    public static void main( String[] args ) {
        //unmodifiableList();
        //unmodifiableMap();
        //collectToUnmodifiableList();
        //predicateNot();
        //newSwitchStatement(new Random().nextInt());
        //textBlocks();
        Person p1 = new Employee("zaki");
        instanceOfInJava14(p1);
    }

    private static void instanceOfInJava14(Person person) {

        if (person instanceof Employee)
        {
            Employee employee = ((Employee) person);
            System.out.println("employee.getEmployeeName() = " + employee.getEmployeeName());
        }
        //in Java 14, we can write the above code as follows

        if (person instanceof Employee employee)
        {
            System.out.println("employee.getEmployeeName() = " + employee.getEmployeeName());
        }
    }

    //java 13, for html, sql queries, json ......
    private static void textBlocks() {
        String multiLinesText =
        """
            Hello Brother, I'm using Java14;
        """;
        System.out.println("multiLinesText = " + multiLinesText);
    }

    // the new switch syntax
    private static void newSwitchStatement(int i) {
        String value = switch (i){
            case 0 -> "0";
            case 1, 2 -> "1";
            default -> "NOT in [0-2]";
        };
        System.out.println("value = " + value);
    }

    private static void predicateNot() {
        List.of(1,2,3,4,5).stream()
                .filter(Predicate.not(x->x>3)) //also using not(x->x>3)
                .forEach(System.out::println);
    }

    //collecting to an  unmodifiable List
    private static void collectToUnmodifiableList() {
        List<String> modifiableList = new ArrayList();
        modifiableList.add("A");modifiableList.add("B");modifiableList.add("C");
        List<String> unmodifiableList = modifiableList.stream()
                .collect(Collectors.toUnmodifiableList());
    }

    //creating an unmodifiableMap
    private static void unmodifiableMap() {
        final Map<String, Integer> entries = Map.ofEntries(
                Map.entry("A", 0),
                Map.entry("B", 1),
                Map.entry("C", 2)
        );
        entries.forEach(( s, i ) -> System.out.println(s+ " => "+ i));
    }

    //will throw an unsupportedOperationException
    public static void unmodifiableList(){
        //the old way
        List<String> strings = Arrays.asList("A", "B");
        List<String> stringList = Collections.unmodifiableList(strings);
        stringList.set(0, "C");
        //the new one
        List<String> stringList2 = List.of("A", "B");
        stringList2.set(0, "C");
    }
}


class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Employee extends Person{
    public Employee(String name) {
        super(name);
    }
    public String getEmployeeName(){
        return "Employee{" +
                "name='" + this.name + '\'' +
                '}';
    }

}
