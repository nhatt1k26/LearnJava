package ZExercises.Exs13;

public class Experience extends Employee{
    private int expInYear;
    private String proSkill;

    public Experience(String id, String fullName, String birthday, String phone, String email, String employeeType, int expInYear, String proSkill) {

        super(id, fullName, birthday, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    public void showMe(){
        showInfo();
        System.out.println("Thong tin cua nhan vien"
        +"\nNam kinh nghiem: "+expInYear+
                "\nChuyen mon: " + proSkill);
    }
}
