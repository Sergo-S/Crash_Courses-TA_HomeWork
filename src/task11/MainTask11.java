package task11;

import task8.CalculatePay;

import java.util.ArrayList;
import java.util.Comparator;

public class MainTask11 {
    public static void main(String[] args) {

        ArrayList<Student> studentsArray = new ArrayList<>();

        studentsArray.add(new Student("Max",1));
        studentsArray.add(new Student("Chloe",2));
        studentsArray.add(new Student("Den",1));
        studentsArray.add(new Student("Joe",3));
        studentsArray.add(new Student("Ben",4));
        studentsArray.add(new Student("Jordan",2));

//        Student.rangeByName(studentsArray);
//        System.out.println("<-------------------->");
//        Student.rangeByCourse(studentsArray);
//        System.out.println("<-------------------->");
//        Student.printByCourse(studentsArray,2);
    }
}
