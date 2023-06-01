package ZExercises.Exs15;

public class InServiceStudent extends Student{
    private String TrainingLocation;

    public InServiceStudent(String trainingLocation) {
        TrainingLocation = trainingLocation;
    }

    public InServiceStudent() {
    }
    public InServiceStudent(InServiceStudent student){
        this.TrainingLocation = student.TrainingLocation;
    }

    public String getTrainingLocation() {
        return TrainingLocation;
    }

    public void setTrainingLocation(String trainingLocation) {
        TrainingLocation = trainingLocation;
    }
}
