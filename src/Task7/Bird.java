package Task7;

public abstract class Bird {
    protected String name;
    protected int feathers;
    protected int countLayedEggs;

    public abstract void fly();
    public void layEgg(int egg) {
        this.countLayedEggs = this.countLayedEggs + egg;
        System.out.println(this.name+" layed eggs("+egg+")");
    }
    public static void printALl(Bird[] birds) {
        System.out.println();
        for(Bird iterator : birds){
            System.out.println(iterator.toString());
            iterator.fly();
        }
    }

    @Override
    public String toString() {
        return this.name+":"+
                "\nFeathers = " + this.feathers +
                "\nEggs was layed: " + this.countLayedEggs;
    }
}

class FlyingBird extends Bird{
    @Override
    public void fly() {
        System.out.println("I can fly"+"\n");
    }

    public FlyingBird(){ this("undefined");}
    public FlyingBird(String name){
        this.name = name;
    }
}
class NonFlyingBird extends Bird{
    @Override
    public void fly() {
        System.out.println("I can't fly"+"\n");
    }

    public NonFlyingBird(){ this("undefined");}
    public NonFlyingBird(String name){
        this.name = name;
    }
}

class Eagle extends FlyingBird{
    {
        feathers = 7182;
    }
    public Eagle(){ super(); };
    public Eagle(String name){
        super(name);
    }
}

class Swallow extends FlyingBird{
    {
        feathers = 674;
    }
    public Swallow(){ super(); };
    public Swallow(String name){
        super(name);
    }
}

class Penguin extends NonFlyingBird{
    {
        feathers = 9374;
    }
    public Penguin(){ super(); };
    public Penguin(String name){
        super(name);
    }
}
class Chicken extends FlyingBird{
    {
        feathers = 1342;
    }
    public Chicken(){ super(); };
    public Chicken(String name){
        super(name);
    }
}