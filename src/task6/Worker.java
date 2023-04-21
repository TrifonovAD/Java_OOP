package task6;

public class Worker {
    private String name;
    private int age;
    private int cabinet;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
