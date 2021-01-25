package homework5;


public class Animals {
    static int counter;
    private String type;
    private String name;
    private int maxRun;
    private int maxSwim;

    public Animals(String type, String name, int maxRun, int maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        counter++;
    }

    protected void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s %s run %d meters\r\n", type, name, distance);
        } else System.out.printf("%s %s could not run %d meters\r\n", type, name, distance);
    }

    protected void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.printf("%s %s swimmed %d meters\r\n", type, name, distance);
        } else System.out.printf("%s %s could not swim %d meters\r\n", type, name, distance);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

}
