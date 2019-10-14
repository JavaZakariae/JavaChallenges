/**
 *
 *  Object initialisation is run for every object creation
 *  Static initialisation is run one time
 *
 *  Static initialisation of the super class
 *  Static initialisation of the child class
 *
 *  block initialisation of the super class(non static )
 *  constructor execution of the child class
 *  block initialisation of the child class(non static )
 *
 */
public class Challenge_14 {
    public static void main( String[] args ) {
        Simpson simpson = new Simpson("Bart", 8);
        System.out.println(simpson.name+" , " +simpson.age);
    }

    static abstract class Character{
        String name;
        int age=35;

        {
            System.out.println("super bloc initialisation");
        }

        static{
            System.out.println("D'oh");
        }
        Character(String name, int age){
            this.name = "Homer";
            this.age = this.age;
            System.out.println("c2");
        }
    }

    static class Simpson extends Character{
        {
            System.out.println("base bloc initialisation");
        }
        static{
            System.out.println("M'oh");
        }
        Simpson(String name, int age){
            super(name, age);
            System.out.println("c1");
        }

    }
}
