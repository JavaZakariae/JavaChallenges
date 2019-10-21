package challenge01_20;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 *
 */
public class Challenge_11 {
    public static void main( String[] args ) throws NoSuchFieldException {
        //print annotations used on the class level
        System.out.println(Arrays.asList(Jedi.class.getAnnotations()));

        final Annotation[] annotations = Jedi.class.getDeclaredField("attackType").getAnnotations();
        Arrays.asList(annotations)
                .stream()
                .forEach(annotation -> System.out.println(annotation.annotationType()));

        final Field[] declaredFields = Jedi.class.getDeclaredFields();
        Arrays.asList(declaredFields)
                .stream()
                .forEach(field ->{
                            System.out.print(field.getName()+" ");
                            System.out.println(field.getAnnotation(Column.class).name());
                });


        System.out.println(Jedi.class.getAnnotation(Table.class).name());
        System.out.println("Table.class.isAnnotation() = " + Table.class.isAnnotation());
        System.out.println(Jedi.class.getAnnotation(Column.class).name());
    }

    @Table(name = "jedi")
    static class Jedi{
        @Column(name = "attack")
        String attackType;

        public String getAttackType() {return attackType;}
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface Table{String name();}
    @Retention(RetentionPolicy.RUNTIME)
    @interface Column{String name();}

}
