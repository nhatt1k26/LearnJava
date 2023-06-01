package ZExercises.Exs4;

public class MemberInfo {
    private final String numberID;
    private String name;
    private int age;
    private String occupation;

    public MemberInfo(String numberID, String name, int age, String occupation) {
        this.numberID = numberID;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String getNumberID() {
        return numberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
