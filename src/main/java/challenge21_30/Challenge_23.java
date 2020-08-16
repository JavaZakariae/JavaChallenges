package challenge21_30;

/**
 * From oracle doc
 *    public static <T> void copy(List<T> dest, List<? extends T> src) could be written as follows:
 *    public static <T, S extends T> void copy(List<T> dest, List<S> src)
 *
 *  Switch statement java 12, the break statement is mandatory when we are in a block statements.
 *
 *  int value = somevalue;
 *  var result = switch(value){
 *      case 1 -> "Hello";
 *      case 2,3 -> "2 or 3 Hello";
 *      case 4,5,6 -> {
 *                  System.out.println("4, 5 or 6 Hello");
 *                  break "4, 5 or 6 Hello";
 *      }
 *  }
 *
 *  IllegalStateException exception is a runtime exception->unchecked exception.
 */
public class Challenge_23 {
    enum WeekDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, NO_BEER_DAY}

    public static void main( String[] args ) {
        Challenge_23 challenge = new Challenge_23();
        Object homerBeersTuesday = challenge.getUsingSwitchCase(WeekDay.TUESDAY);
        Object homerBeersSaturday = challenge.getUsingSwitchCase(WeekDay.SATURDAY);
        Object homerBeersForNoBeerday = challenge.getUsingSwitchCase(WeekDay.NO_BEER_DAY);
        System.out.println(""+ homerBeersTuesday+ homerBeersSaturday+ homerBeersForNoBeerday);
    }

    private <R extends WeekDay, T > T getUsingSwitchCase(R weekDay) {
        var t = switch((WeekDay)weekDay){
            case MONDAY -> (T) Integer.valueOf(4);
//            case TUESDAY, WEDNESDAY, THURSDAY -> {
//                System.out.println("Every day is beer day for homer");
//                break  (Integer.valueOf(129) == 129 ? 5 : 7);
//            }
            case FRIDAY -> (T) Double.valueOf(4);
            case SATURDAY, SUNDAY -> (T) (Object) "6" == new String("6") ? 2 : 4;
            default -> new IllegalStateException("Non existent day.");
        };
        return (T) t;
    }
}
