package Task6;

import org.junit.Test;

import java.util.ArrayList;

public class MainTask6 {
    public static void main(String[] args) {
        Furniture obj1 = new Furniture("Hfdss",2007,Color.BLUE);
        Furniture obj2 = new Furniture("Hfdss",2007,Color.BLUE);
        Furniture obj3 = new Furniture("Hfdss",2007,Color.BLUE);
        Furniture obj4 = new Furniture();

        ArrayList<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Furniture("Sofa",2007,Color.BLUE));
        furnitureList.add(new Furniture("Hfdss",Color.RED));
        furnitureList.add(new Furniture("Sofa",2007,Color.BLUE));
        furnitureList.add(new Furniture());


        Furniture.printAll(furnitureList);

        System.out.println(furnitureList.get(0).getObjcolor());


    }
}
