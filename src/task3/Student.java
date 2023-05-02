package task3;

public class Student extends Person {
    private Integer groupId;
    private Double averageScore;

    public Student(String firstName, String lastName, Integer groupId, Double averageScore) {
        super(firstName, lastName);
        this.averageScore = averageScore;
        this.groupId = groupId;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return String.format("%s. Group: %d. Average score: %.2f", super.toString(), groupId, averageScore);
    }
}
