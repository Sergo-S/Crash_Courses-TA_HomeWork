package Task6;

import org.junit.Test;

import java.util.Objects;
import java.util.ArrayList;

enum Color{
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00"),
    BLACK("#000000"),
    WHITE("#FFFFFF"),
    UNDEFINED("??????");
    private String code;
    Color(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}

public class Furniture {
    private String name;
    private  int date;
    Color objcolor;
    private int age;

    public Furniture(){
        this("undefined",0, Color.UNDEFINED);
    }
    public Furniture(String name){
        this(name,0,Color.UNDEFINED);
    }
    public Furniture(int date){
        this("undefined",date,Color.UNDEFINED);
    }
    public Furniture(Color objcolor) {
        this ("undefined",0,objcolor);
    }
    public Furniture(String name,int date){
        this(name,date,Color.UNDEFINED);
    }
    public Furniture(int date,Color objcolor){
        this("undefined",date,objcolor);
    }
    public Furniture(String name,Color objcolor) {
        this (name,0,objcolor);
    }

    public Furniture(String name, int date, Color objcolor){
        this.name = name;
        this.date = date;
        this.objcolor = objcolor;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getDate(){
        return date;
    }
    public void setDate(int date){
        this.date = date;
    }
    public Color getObjcolor() {
        return objcolor;
    }
    public void setObjcolor(Color objcolor) {
        this.objcolor = objcolor;
    }

    public String getAge(){
        if(this.date==0) {
            return "(Age can't be calculated)";
        }
        else{
            return "(Age = "+(2022 - this.date)+")";
        }
    }

    static public void printAll(ArrayList furnitureList){
        for(Object iterator : furnitureList){
            System.out.println(iterator.toString());
        }
    }

    @Override
    public String toString() {
        if(this.date==0){
            return "Name: "+this.name+
                    "\nYear of manufacture: undefined"+ " " + this.getAge() +
                    "\nColor: "+this.objcolor+" (Code: "+this.objcolor.getCode()+")\n";


        }
        else {
            return "Name: " + this.name +
                    "\nYear of manufacture: " + this.date + " " + this.getAge() +
                    "\nColor: " + this.objcolor + " (Code: " + this.objcolor.getCode() + ")\n";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Furniture)) return false;
        Furniture furniture = (Furniture) o;
        return getDate() == furniture.getDate() && Objects.equals(getName(), furniture.getName()) && objcolor == furniture.objcolor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDate(), objcolor);
    }





}
