package FCollection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id,String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student student){
        return this.getName().compareTo(student.getName());
    }
    public String getName(){
        return name;
    }
}


public class ComparableComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"haha"));
        students.add(new Student(2,"asdjh"));
        students.add(new Student(3,"asdjv"));
        students.add(new Student(4,"kjdks"));
        students.add(new Student(5,"gnchs"));
        students.add(new Student(6,"oejxn"));
        Collections.sort(students);


    }
}
