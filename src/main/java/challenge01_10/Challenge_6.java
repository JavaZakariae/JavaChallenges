package challenge01_10;

/**
 *  Result: null
 *          null
 *          null
 */
public class Challenge_6 {
    public static void main( String[] args ) {
        Archer archer = new Challenge_6().new Archer();
        archer.attack("->");
        archer.attack(Double.valueOf(1.0));
        archer.attack(Float.valueOf(1));
        archer.attack(1.0);
    }

    class Archer<T>{
        T t;
        void attack(T t){
            System.out.println(this.t);
        }
    }

}
