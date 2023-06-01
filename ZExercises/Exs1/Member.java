package ZExercises.Exs1;

public class Member {
    private String name;
    private int age;
    private int gender;
    private String address;

    public Member(String name, int age, int gender, String address) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "\nTen nhan vien:"+ name + "\n"+
                "Tuoi: " + age + "\n"+
                "Gioi tinh: " + gender + "\n"+
                "Dia chi: " + address+ "\n";
    }
}
