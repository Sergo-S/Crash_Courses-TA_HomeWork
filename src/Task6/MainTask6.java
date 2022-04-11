package Task6;

import org.junit.Test;

import java.util.ArrayList;

public class MainTask6 {
    public static void main(String[] args) {
        ArrayList<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Furniture("Sofa",2007,Color.BLUE));
        furnitureList.add(new Furniture("Hfdss",Color.RED));
        furnitureList.add(new Furniture("Sofa",2007,Color.BLUE));
        furnitureList.add(new Furniture());


        Furniture.printAll(furnitureList);

        System.out.println(furnitureList.get(0).getObjcolor());


    }
}
