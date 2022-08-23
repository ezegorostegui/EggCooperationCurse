package Exercise07;

import javax.swing.*;

public class Service {
    public Person person(){
        String gender;
        boolean flag = false;

        Person person = new Person();
        person.setName(JOptionPane.showInputDialog(null,"Insert a name."));
        person.setAge(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter an age (years)")));
        person.setHeight(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a height in cm.")));
        person.setWeight(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a weight in Kg.")));

        do {
            gender = JOptionPane.showInputDialog(null, "Enter a gender: M - F - X");
            gender = gender.toUpperCase();

            if (gender.equals("M") || gender.equals("F") || gender.equals("X")) {
                flag = true;
            } else {
                JOptionPane.showMessageDialog(null,"Incorrect option.");
            }
        } while(!flag);
        person.setGender(gender);
        return person;
    }
    public int calculateIMC(Person person){
        double imc = person().getWeight()/(Math.pow(person().getHeight(),2) / Math.pow(100,2));

        if(imc < 20){
            return -1;
        } else if (imc >= 20 && imc <= 25){
            return 0;
        } else {
            return 1;
        }
    }
    public boolean isAnAdult(Person person){
        boolean age = false;
        if(person().getAge() >= 18){
            age = true;
        }
        return age;
    }
}
