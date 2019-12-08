package challenge21_30;

import java.io.*;

/**
 * https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html
 *
 * FileOutputStream  Creates a file output stream to write to the file with the specified name
 * FileInputStream  is meant for reading streams of raw bytes such as image data
 *
 * ObjectOutputStream   An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream
 * ObjectInputStream    An ObjectInputStream deserializes primitive data and objects previously written using an ObjectOutputStream.
 *
 * Serializable for writing to stream purpose
 * IOException  extends directly Exception class
 * transient    to indicate that a field should not be serialized.
 * volatile     http://tutorials.jenkov.com/java-concurrency/volatile.html
 */
public class Challenge_26 {
    public static void main( String[] args ) throws IOException, ClassNotFoundException {

        try(var fs = new FileOutputStream("SerTest.ser");
            var os = new ObjectOutputStream(fs))
        {
            var xmen = new Xmen();
            xmen.name = "Wolverine";
            xmen.power = "Healing and defensive powers";
            xmen.weapon = "claws";
            xmen.costumeColor="yellow";
            os.writeObject(xmen);
            //xmen.costumeColor="blue";
        }

        try (var fis = new FileInputStream("SerTest.ser");
             var ois = new ObjectInputStream(fis))
        {
            var deserializedXmen = (Xmen)ois.readObject();
            System.out.println(deserializedXmen.name);
            System.out.println(deserializedXmen.power);
            System.out.println(deserializedXmen.weapon);
            System.out.println(deserializedXmen.costumeColor);
        }
    }
}
class Xmen implements Serializable{
    private static final long serialVersionUID = 632L;
    String name;
    transient String power;
    volatile  String weapon;
    static String costumeColor;
}
