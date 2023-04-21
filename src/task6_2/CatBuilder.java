package task6_2;

import task6.Worker;

public class CatBuilder {
    private static CatBuilder instance = null;
    Cat obj;

    public CatBuilder() {
    }
    public static CatBuilder getInstance() {
        if (instance == null)
            instance = new CatBuilder();
        instance.obj = new Cat();

        return instance;
    }

    public CatBuilder setName(String name) {
        obj.setName(name);
        return this;
    }
    public CatBuilder setBreed(String breed) {
        obj.setBreed(breed);
        return this;
    }
    public CatBuilder setAge(int age) {
        obj.setAge(age);
        return this;
    }
    public CatBuilder setWeight(int weight) {
        obj.setWeight(weight);
        return this;
    }
    public CatBuilder setInGoodMood(boolean isInGoodMood) {
        obj.setInGoodMood(isInGoodMood);
        return this;
    }
    public CatBuilder setColor(String color) {
        obj.setColor(color);
        return this;
    }
    public Cat build(){
        return obj;
    }

}
