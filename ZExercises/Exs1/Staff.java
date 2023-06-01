package ZExercises.Exs1;

public class Staff extends Member{
    private String job;

    public Staff(String name, int age, int gender, String address, String job) {
        super(name, age, gender, address);
        this.job = job;
    }
}