package inhExercise01;

public class Execute {
    public static void main(String[] arg){
        Dog dog1 = new Dog("Stich","carnivorous",15,"Doberman");
        dog1.eat();

        Dog dog2 = new Dog("Teddy","biscuits",10,"Chihuahua");
        dog2.eat();

        Cat cat = new Cat("Pelusa","croquet",15,"Siames");
        cat.eat();

        Horse horse = new Horse("Spark","grass",25,"fino");
        horse.eat();
    }
}
