package challenge21_30;

/**
 * default access modifier
 *              we access it from the same class and the same package.
 * protected access modifier
 *              we access it from the same class,
 *              the same package and from the subclasses even in another package.
 *
 * abstract class only for implementation purpose, so no way to instatiate the abstract class.
 *
 *
 */
public class Challenge_28 {
    static abstract class Simpson{
        void talk(){
            System.out.println("Simpson");
        }
        protected void prank(String prank){
            System.out.println(prank);
        }
    }

    static class Bart extends Simpson{
        String prank;
        public Bart( String prank ) {
            this.prank = prank;
        }

        protected void talk(){
            System.out.println("Eat my shorts!");
        }

        void prank(){
            super.prank(prank);
            System.out.println("Knock Homer down");
        }
    }

    static class Lisa extends Simpson{
        void talk(String toMe){
            System.out.println("I love Sex");
        }
    }

    public static void main( String[] args ) {
        new Lisa().talk("sex");
        Simpson simpson = new Bart("D'oh");
        simpson.talk();
        Lisa lisa = new Lisa();
        lisa.talk();
        ((Bart) simpson).prank();
    }
}
