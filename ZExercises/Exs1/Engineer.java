package ZExercises.Exs1;

class Engineer extends Member{
    private String faculty;

    public Engineer(String name, int age, int gender, String address, String faculty) {
        super(name, age, gender, address);
        this.faculty = faculty;
    }
}
