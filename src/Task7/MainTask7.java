package Task7;

public class MainTask7 {
    public static void main(String[] args) {

        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("Eagle");
        birds[1] = new Swallow();
        birds[2] = new Penguin("Penguin");
        birds[3] = new Chicken("Chicken");

        birds[0].layEgg(2);
        birds[1].layEgg(5);
        birds[2].layEgg(1);
        birds[3].layEgg(1);

        Bird.printALl(birds);
    }
}
