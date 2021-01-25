package homework5;


public class Cats extends Animals{
    static int counter;

    Cats(String name) {
        super("Cats", name, 200, 0);
        counter++;
    }

    @Override
    protected void swim(int distance) {
        System.out.println(getName() + " won't swim!");
    }
}
