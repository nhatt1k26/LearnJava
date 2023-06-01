package ZExercises.Exs13;

public class Fresher extends Employee{
    private int graduationDate;
    private String graduationRank;
    private String eduaction;

    public Fresher(String id, String fullName, String birthday, String phone, String email, String employeeType, int graduationDate, String graduationRank, String eduaction) {
        super(id, fullName, birthday, phone, email, employeeType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.eduaction = eduaction;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEduaction() {
        return eduaction;
    }

    public void setEduaction(String eduaction) {
        this.eduaction = eduaction;
    }
    public void showMe(){
        showInfo();
        System.out.println(
                "Thoi gian tot nghiep: " + graduationDate+
                        "\nXep loai tot nghiep: "+ graduationRank+
                        "\nTruong tot nghiep: "+ eduaction
        );
    }
}
