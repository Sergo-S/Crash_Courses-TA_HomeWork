package Task5;

import java.util.Objects;

enum Breed{
    HUSKY,
    LABRADOR,
    BULLDOG,
    SHEPHERD_DOG
}
public class Dog {

    private String name;
    private int age;
    Breed dogBreed;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Dog(String name, int age,Breed breed){
        this.name = name;
        this.age = age;
        dogBreed = breed;
    }

    static public void sameName(Dog[] dogs){
        for(int i = 0; i < dogs.length-1; i++){
            for(int j = i+1; j < dogs.length;j++){
                if(dogs[i].getName().equals(dogs[j].getName())){
                    System.out.println("dogs["+i+"]"+" and "+"dogs["+j+"] have same names");
                }
            }
        }
    }

    static public void theOldestDog(Dog[] dogs){
        int max = -9999;
        int imax = 0;
        for(int i=0; i<dogs.length; i++){
            if(dogs[i].getAge() > max){
                max = dogs[i].getAge();
                imax = i;
                i=0;
            }
        }
        System.out.println("The oldest dog: "+dogs[imax].getName());
    }

}
