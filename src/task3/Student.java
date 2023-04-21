package task3;

public class Student {
    private String firstName;
    private String lastName;
    private Integer groupId;
    private Double averageScore;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public Student(String firstName, String lastName, Integer groupId, Double averageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupId = groupId;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return String.format("%s %s. Group: %d. Average score: %.2f", lastName, firstName, groupId, averageScore);
    }
}
