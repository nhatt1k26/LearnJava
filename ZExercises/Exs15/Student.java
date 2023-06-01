package ZExercises.Exs15;
import java.util.ArrayList;
import java.util.List;
public class Student {
    private String mssv;
    private String name;
    private String birth;
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

    public Student(String mssv, String name, String birth, int yearStart, float entranceScore, List<ResultStudy> resultStudies) {
        this.mssv = mssv;
        this.name = name;
        this.birth = birth;
        this.yearStart = yearStart;
        this.entranceScore = entranceScore;
        this.resultStudies = resultStudies;
    }
}
