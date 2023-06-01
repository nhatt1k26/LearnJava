package EGenerics;

public class Student {
    int mssv;
    String hoTen;

    public Student(int mssv, String hoTen) {
        this.mssv = mssv;
        this.hoTen = hoTen;
    }
    @Override
    public String toString(){
        return "Hoc sinh: "+ hoTen +", Mssv: "+ mssv;
    }
}
