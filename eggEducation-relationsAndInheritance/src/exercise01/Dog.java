package exercise01;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private String size;

    public Dog(String name, String breed, int age, String size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size=" + size +
                '}';
    }
}
