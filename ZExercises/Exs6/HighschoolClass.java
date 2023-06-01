package ZExercises.Exs6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighschoolClass {
    List<Student> myClassList;

    public HighschoolClass(List<Student> myClassList) {
        this.myClassList = myClassList;
    }

    public void addNewStudent(Student newStudent){
        myClassList.add(newStudent);
    }

    public void displayStudentInfo(){
        Stream.of(myClassList).forEach(s-> System.out.println(s));
    }
    public void displayStudentInfo( List<Student> myList){
        Stream.of(myList).forEach(s-> System.out.println(s));
    }

    public void searchStudentByAge(int age){
        List<Student> resultList = myClassList.stream().filter(s -> s.getAge()==age).collect(Collectors.toList());
        displayStudentInfo(resultList);
    }
    public void searchStudentByAgeAndAddress(int age, String address){
        List<Student> resultList = myClassList.stream().filter(s -> s.getAge()==age && s.getAddress().equals(address)).collect(Collectors.toList());
        displayStudentInfo(resultList);
    }
}
