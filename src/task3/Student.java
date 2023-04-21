package task3;

public class Student {
    private String firstName;
    private String lastName;
    private Integer groupId;

    public Student(String firstName, String lastName, Integer gorupId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupId = gorupId;
    }

    @Override
    public String toString() {
        return String.format("%s %s. Group: %d", lastName, firstName, groupId);
    }
}
