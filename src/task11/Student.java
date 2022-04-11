package task11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Student {
    private String name;
    private int course;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name,int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                "\nCourse: " + this.course+"\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCourse());
    }

    static void rangeByName(ArrayList<Student> studentsArray){
        studentsArray.sort(Comparator.comparing(Student::getName));
        for(Object iterator : studentsArray){
            System.out.println(iterator.toString());
        }
    }

    static void rangeByCourse(ArrayList<Student> studentsArray){
        studentsArray.sort(Comparator.comparing(Student::getCourse));
        for(Object iterator : studentsArray){
            System.out.println(iterator.toString());
        }
    }
    
    static void printByCourse(ArrayList<Student> studentsArray , int course){
        ArrayList<Student> studentsOnCourse = new ArrayList<>();
        for (Student student : studentsArray) {
            if (student.getCourse() == course) {
                studentsOnCourse.add(new Student(student.getName(), student.getCourse()));
            }
        }
        for(Object iterator : studentsOnCourse){
            System.out.println(iterator.toString());
        }
    }
    

    

}
