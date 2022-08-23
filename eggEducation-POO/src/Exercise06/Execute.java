/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/
package Exercise06;

import javax.swing.*;

public class Execute {
    public static void main(String[] arg){
        Service obj1 = new Service();
        CoffeeMaker cm = obj1.constructor();

        int op = selectOption();
        switch (op){
            case 1:
                obj1.fillCoffee(cm);
                break;
            case 2:
                obj1.fillCup(cm);
                break;
            case 3:
                obj1.emptyCoffeeMaker(cm);
                break;
            default:
                obj1.addCoffee(cm);
                break;
        }
        JOptionPane.showMessageDialog(null, obj1);
    }
    public static int selectOption(){
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Select one of the following options:" + "\n" + "\n" +
                    "1. Fill the coffee maker." + "\n" +
                    "2. Fill a cup." + "\n" +
                    "3. Empty the coffee maker." + "\n" +
                    "4. Add coffee to the coffee maker."));
        } while(op < 1 || op > 4);
        return op;
    }
}
