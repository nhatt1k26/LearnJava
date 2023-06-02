package ZExercises.Exs13.entity;

import ZExercises.Exs13.EmployeeAbstract;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee extends EmployeeAbstract {
    private String id;
    private String fullName;
    private LocalDate birthday;
    private String phone;
    private String email;
    private String employeeType;
    private List<Certificated> certificatedList = new ArrayList<>();

    public List<Certificated> getCertificatedList() {
        return certificatedList;
    }

    public void setCertificatedList(List<Certificated> certificatedList) {
        this.certificatedList = certificatedList;
    }

    public static int employeeCount=0;

    public Employee(String id, String fullName, LocalDate birthday, String phone, String email, String employeeType) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
    //Override
    public void showInfo(){
        System.out.println(this);
    }
    //Override
    public String toString(){
        return "Id: "+id+
                "\nName: "+fullName+
                "\nBirthday: " + birthday+
                "\nPhone :" + phone+
                "\nEmail: "+ email+
                "\nEmployee Type: "+ employeeType;
    }
}
