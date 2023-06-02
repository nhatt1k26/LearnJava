package ZExercises.Exs15.entity;

import ZExercises.Exs13.entity.Employee;
import ZExercises.Exs13.exception.*;
import ZExercises.Exs13.utility.EmployeeUtility;
import ZExercises.Exs15.entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Faculty {
    private String facultyName;
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student newStudent){
        studentList.add(newStudent);
    }
    public Faculty(String facultyName, List<Student> studentList) {
        this.facultyName = facultyName;
        this.studentList = studentList;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
