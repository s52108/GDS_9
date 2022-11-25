public class Hase {
    protected String name;

    public Hase(String name) {
        this.name = name;
    }

    final void schlafen() {
        System.out.println(name + " ist ein Hase und schläft.");
    }

    public void hoppeln() {
        System.out.println(name + " ist ein Hase und hoppelt.");
    }

    public void fressen() {
        System.out.println(name + " ist ein Hase und frisst.");
    }

    public void verteilen() {
        System.out.println(name + " ist ein Hase und verteilt nichts.");
    }
}
