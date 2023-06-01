package ZExercises.Exs13;

public class Intern extends  Employee{
    private String majors;
    private String semester;
    private String universityName;

    public Intern(String id, String fullName, String birthday, String phone, String email, String employeeType, String majors, String semester, String universityName) {
        super(id, fullName, birthday, phone, email, employeeType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void showMe(){
        showInfo();
        System.out.println("Chuyen nganh: "+majors+
                "\nSemester: "+ semester+
                "\nUniversity Name: "+ universityName);
    }
}
