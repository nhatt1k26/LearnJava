package ZExercises.Exs3;

public class Contestant {
    private final int idNumber;
    private static int numberOfContestant = 0 ;
    private String name;
    private String address;
    private String priority;

    public int getIdNumber() {
        return idNumber;
    }

    public int getNumberOfContestant() {
        return numberOfContestant;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private String grade;

    public Contestant(String name, String address, String priority, String grade) {
        this.idNumber = increaseContestantNumber();
        this.name =  name;
        this.address = address;
        this.priority = priority;
        this.grade = grade;
    }

    private int increaseContestantNumber(){
        return ++numberOfContestant;
    }
    @Override

    public String toString(){
        return "SBD: "+idNumber+
                "\nHo ten: " +name+
                "\nDia chi: "+ address+
                "\nUu tien: "+ priority+
                "\nKhoi "+ grade;
    }
}
