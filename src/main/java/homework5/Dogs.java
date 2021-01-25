package homework5;

public class Dogs extends Animals {
    static int counter;
    Dogs(String name, int maxRun, int maxSwim) {
        super("Dogs", name, maxRun, maxSwim);
        counter++;
    }
}
