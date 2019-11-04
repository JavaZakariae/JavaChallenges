package challenge31_40;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 */
public class Challenge_31 {

    public static void main( String[] args ) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hallo");
        arrayList.add("goed");
        arrayList.add("moest");
        arrayList.add("ik");
       arrayList.add("ging");

        List<String> secondArrayList = new CopyOnWriteArrayList<>();
        secondArrayList.add("Hallo");
        secondArrayList.add("goed");
        secondArrayList.add("moest");
        secondArrayList.add("ik");
        secondArrayList.add("ging");


        doProcess(arrayList);
        doProcess(secondArrayList);

    }

    /**
     *  this method will throw java.util.ConcurrentModificationException
     *
     */
    static void doProcess( List<String> list ) {
        for (String word:list){
            if (word.equals("ik")){
                list.remove(word);
            }
        }
    }
}
