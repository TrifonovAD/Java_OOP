package task6_2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = CatBuilder.getInstance().setName("Gavr").setAge(12). setBreed("Sphinx").setColor("Pink").build();
        System.out.println(cat1.toString());
    }
}
