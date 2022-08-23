/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.

 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
 * un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
 * está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
 * ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
 * la lista ordenada.
 */
package exercise01_02;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercise01 {
    public static void main(String[] arg){
        ArrayList <String> dog = new ArrayList<>();
        addDog(dog);
        removeDog(dog);
    }
    public static void addDog(ArrayList <String> dog){
        int option = 0;
        while(option == 0){
            dog.add(JOptionPane.showInputDialog(null, "Enter a breed of dog"));
            option = JOptionPane.showConfirmDialog(null,"Would you like add more breeds of dogs?","\n",JOptionPane.YES_NO_OPTION);
        }
        JOptionPane.showMessageDialog(null,"Breed of dogs:"+"\n"+dog);
    }
    public static void removeDog(ArrayList <String> dog){
        boolean flag = true;
        Iterator <String> select = dog.iterator();
        String aux = JOptionPane.showInputDialog(null, "Select a breed to search and remove it from the list.");
        while(select.hasNext()) {
            if(select.next().equals(aux)){
                dog.remove(aux);
                flag = !flag;
            }
        }
        if(flag) {
            JOptionPane.showMessageDialog(null, "This breed is not on the list.");
        }
        JOptionPane.showMessageDialog(null,"Breed of dogs:"+"\n"+dog);
    }


}