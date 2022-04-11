package Task4;
import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int birthDate;
    private String info;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getBirthDate(){
        return birthDate;
    }
    public void setBirthDate(int birthDate){
        this.birthDate = birthDate;
    }

    public Person(){

    }

    public Person(String name , int birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public void age(){
        System.out.println(this.name + " " + (2022 - this.birthDate) + " y.o.");
    }
    public void inputInfo(String name, int birthDate){
        this.setName(name);
        this.setBirthDate(birthDate);
    }
    public void outputInfo(){
        System.out.println("Name: "+this.name+
                "\nBirth date: "+this.birthDate+"\n");
    }

    public void changeName(){
        System.out.println("Old name: "+this.name);
        System.out.println("Enter new name:");
        this.name = scanner.next();
        System.out.println("New name: "+this.name);
    }



}
