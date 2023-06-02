package ZExercises.Exs15.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String mssv;
    private String name;
    private LocalDate birth;
    private int yearStart;
    private float entranceScore;
    private List<ResultStudy> resultStudies = new ArrayList<>();

    public Student() {
    }
    public Student(Student student){
        this.mssv = student.mssv;
        this.name = student.name;
        this.birth = student.birth;
        this.yearStart = student.yearStart;
        this.entranceScore = student.entranceScore;
        this.resultStudies = new ArrayList<>(resultStudies);
    }

    public Student(String mssv, String name, LocalDate birth, int yearStart, float entranceScore, List<ResultStudy> resultStudies) {
        this.mssv = mssv;
        this.name = name;
        this.birth = birth;
        this.yearStart = yearStart;
        this.entranceScore = entranceScore;
        this.resultStudies = new ArrayList<>(resultStudies);
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public float getEntranceScore() {
        return entranceScore;
    }

    public void setEntranceScore(float entranceScore) {
        this.entranceScore = entranceScore;
    }

    public List<ResultStudy> getResultStudies() {
        return resultStudies;
    }
    public double getAverageScore(){
        double average = resultStudies.stream()
                .mapToDouble(ResultStudy::getAverage)
                .average()
                .orElse(0); // Giá trị mặc định nếu danh sách rỗng
        return average;
    }

    public double getHighestScore(){
        double average = resultStudies.stream()
                .mapToDouble(ResultStudy::getAverage)
                .max()
                .orElse(0); // Giá trị mặc định nếu danh sách rỗng
        return average;
    }

    public void setResultStudies(List<ResultStudy> resultStudies) {
        this.resultStudies = resultStudies;
    }
    @Override
    public String toString(){
        return "Mssv: " + mssv +
        "\n Name: " + name +
        "\n Birth: " + birth +
        "\n YearStart: " + yearStart +
        "\n EntranceScore: " + entranceScore ;
        //"\n ResultStudies"  resultStudies.stream().forEach(System.out::println);
    }
}
