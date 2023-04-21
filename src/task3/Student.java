package task3;

public class Student {
    private String firstName;
    private String lastName;
    private Integer gorupId;

    public Student(String firstName, String lastName, Integer gorupId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gorupId = gorupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gorupId=" + gorupId +
                '}';
    }
}
