package challenge61_70;

public class Challenge_66 {
    public static void main( String[] args ) {
        Dracula dracula = new Hulu();
        System.out.println("dracula.name+dracula.getName() = " + dracula.name + dracula.getName());
        System.out.println("dracula.metamorphosis() = " + dracula.metamorphosis());
    }

    static class Dracula {
        String name = "Dracula";
        double forceLevel=777;

        public String getName() {return name;}
        static String metamorphosis(){return "vraag";}
    }

    static class Hulu extends Dracula{
        String name = "Hulu";

        static String metamorphosis(){return "aantwoord";}
        @Override
        public String getName() {return name;}
    }

}
