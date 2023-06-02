package ZExercises.Exs15.entity;

import java.time.LocalDate;
import java.util.List;

public class InServiceStudent extends Student {
    private String trainingLocation;

    public InServiceStudent(String trainingLocation) {
        trainingLocation = trainingLocation;
    }

    public InServiceStudent(Student student, String trainingLocation) {
        super(student);
        this.trainingLocation = trainingLocation;
    }

    public InServiceStudent(String mssv, String name, LocalDate birth, int yearStart, float entranceScore, List<ResultStudy> resultStudies, String trainingLocation) {
        super(mssv, name, birth, yearStart, entranceScore, resultStudies);
        this.trainingLocation = trainingLocation;
    }

    public InServiceStudent() {
    }
    public InServiceStudent(InServiceStudent student){
        super(student.getMssv(), student.getName(),student.getBirth() , student.getYearStart(), student.getEntranceScore(), student.getResultStudies());
        this.trainingLocation = student.trainingLocation;
    }

    public String getTrainingLocation() {
        return trainingLocation;
    }

    public void setTrainingLocation(String trainingLocation) {
        trainingLocation = trainingLocation;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
