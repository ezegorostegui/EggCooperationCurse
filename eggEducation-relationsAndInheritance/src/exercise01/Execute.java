/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
 * clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
 * atributos: nombre, apellido, edad, documento y Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
 * pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
 * la clase Persona, la información del Perro y de la Persona.
 */
package exercise01;

import javax.swing.*;

public class Execute {
    public static void main(String[] arg){
        Person p1 = new Person("Pepe","Martinez",40,12345678,null);
        Person p2 = new Person("Pedro","Gonzalez",20,98709876,null);
        Dog d1 = new Dog("Pancho","Dalmata",2,"pequenio");
        Dog d2 = new Dog("Lola","Beagle",1,"pequenio");

        p1 = p1.assignDog(d1);
        p2 = p2.assignDog(d2);

        JOptionPane.showMessageDialog(null,p1.toString());
        JOptionPane.showMessageDialog(null,p2.toString());
    }
}
