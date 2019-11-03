package challenge21_40;

/**
 *
 * the intern method == and equals method
 * 12568
 */
public class Challenge_30 {
    public static void main(String[] args) {
        String result = "";
        result+= "powerfullcode ".trim() == "powerfullcode" ? "0":"1";
        result+= "flexibleCode" == "flexibleCode" ? "2":"3";
        result+= new String("doYourBest")==new String("doYourBest") ? "4":"5";
        result+= new String("nobugProject").equals("nobugProject") ? "6":"7";
        result+= new String("breakYourLimits").intern()==new String("breakYourLimits").intern() ? "8":"9";
        System.out.println(result);
    }
}
