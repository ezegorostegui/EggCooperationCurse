package guideExercises;

import java.util.ArrayList;

public class Execute {
    public static void main(String[] arg){
        Animal a = new Animal();
        Cat b = new Cat();
        Dog c = new Dog();

        ArrayList<Animal> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        for (Animal aux:list) {
            aux.makeNoise();
        }
    }
}
