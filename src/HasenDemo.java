public class HasenDemo {
    public static void main(String[] args) {
        Hase harry = new Hase("Harry");
        Osterhase sigi = new Osterhase("Sigi");
        Weihnachtshase olaf = new Weihnachtshase("Olaf", "Jürgen");

        System.out.println("\n");
        harry.fressen();
        harry.hoppeln();
        harry.schlafen();
        harry.verteilen();
        System.out.println("\n");

        sigi.fressen();
        sigi.hoppeln();
        sigi.schlafen();
        sigi.verteilen();
        System.out.println("\n");

        olaf.fressen();
        olaf.hoppeln();
        olaf.schlafen();
        olaf.verteilen();

        Hase h1 = olaf;

        System.out.println("\n");
        h1.verteilen();
        System.out.println(olaf.getBestFriend());

        Hasenstall hoppelwiese = new Hasenstall();
        hoppelwiese.add(harry);
        hoppelwiese.add(sigi);
        hoppelwiese.add(olaf);

        System.out.println("\n");
        System.out.println("--- Verteilen von Hoppelwiese ---");
        hoppelwiese.verteilen();

        hoppelwiese.fuettern();
        Object o = olaf;

        h1.verteilen();
        System.out.println(o.toString());

        Weihnachtshase wh = (Weihnachtshase) h1;
        System.out.println(wh.getBestFriend());


    }


}
