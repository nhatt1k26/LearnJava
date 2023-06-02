package ZExercises.Exs15.entity;

public class ResultStudy  {
    private int semester;
    private float average;

    public ResultStudy(int semester, float average) {
        this.semester = semester;
        this.average = average;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
}