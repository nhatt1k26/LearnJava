package ZExercises.Exs1;

public class Worker extends Member{
    private int degree;

    public Worker(String name, int age, int gender, String address, int degree) {
        super(name, age, gender, address);
        this.degree = degree;
    }
}
