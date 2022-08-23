package exercise01;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int dni;
    private Dog dog;

    public Person(){}
    public Person(String name, String surname, int age, int dni, Dog dog) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dni = dni;
        this.dog = dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Person assignDog(Dog dog){
        Person person = new Person();
        person.setDog(dog);
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", dni=" + dni +
                ", dog=" + dog +
                '}';
    }
}
