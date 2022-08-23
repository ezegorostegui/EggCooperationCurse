package inhExercise01;

public final class Dog extends Animal{
    public Dog(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }

    @Override
    public void eat(){
        System.out.println(this.name + " eats " + this.food);
    }
}
