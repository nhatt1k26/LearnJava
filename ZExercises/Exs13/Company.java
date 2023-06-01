package ZExercises.Exs13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Company {
    List<Employee> employees = new ArrayList<>();
    List<Intern> interns = new ArrayList<>();
    List<Experience> experiences = new ArrayList<>();
    List<Fresher> freshers = new ArrayList<>();

    public Company() {
    }

    public void addEmployee(Employee newemployee){
        employees.add(newemployee);

        // instanceof and downcasting
        if (newemployee instanceof Intern)
            interns.add((Intern)newemployee);
        if (newemployee instanceof Experience)
            experiences.add((Experience)newemployee);
        if (newemployee instanceof Fresher)
            freshers.add((Fresher) newemployee);
    }

    public void showEmployeeList(List<Employee> myList){
        Stream.of(myList).forEach(System.out::println);
    }

    //Overload
    public void showEmployeeList(){
        showEmployeeList(employees);
    }
    public void showExperience(){
        Stream.of(experiences).forEach(System.out::println);
    }

    public void showIntern(){
        Stream.of(interns).forEach(System.out::println);
    }
    public void showFresher(){
        Stream.of(freshers).forEach(System.out::println);
    }

    public void deleteEmployee(String deleteId){
        employees = employees.stream().filter(s-> (s.getId().equals(deleteId))).collect(Collectors.toList());

    }



    public void updateEmployee(Employee newemployee){

    }

}
