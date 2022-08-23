package inhExercise01;

public abstract class Animal {
    protected String name;
    protected String food;
    protected Integer age;
    protected String breed;

    public Animal(String name, String food, int age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }

    public abstract void eat();
}
