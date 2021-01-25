package homework5;

public class Game {
    public static void main(String[] args) {
        Animals[] animals = {
          new Cats( "Kisa"),
          new Cats (" Fat Kisa"),
          new Dogs("Sharik", 500, 20),
          new Dogs("Sappi", 500, 20),
          new Dogs("Bubkil", 500, 20)
        };
        for (Animals a: animals){
            a.run(200);
            a.swim(10);
            a.run(500);
            a.swim(15);
            a.run(100);
        }

        System.out.println("There were " + Cats.counter + " Cats");
        System.out.println("There were " + Dogs.counter + " Dogs");
        System.out.println("There were " + Animals.counter + " Animals");
    }
}
