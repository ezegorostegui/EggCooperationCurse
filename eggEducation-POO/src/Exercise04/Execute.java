/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
        Superficie = base * altura /// Perímetro = (base + altura) * 2.
*/
package Exercise04;

import javax.swing.*;

public class Execute {
    public static void main (String[] arg){
        Rectangle rectangle = new Rectangle(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the base of the rectangle.")),
                                Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the high of the rectangle.")));
        int area = rectangle.area(rectangle.getBase(), rectangle.getHigh());
        int perimeter = rectangle.perimeter(rectangle.getBase(), rectangle.getHigh());
        print(rectangle,area,perimeter);
    }
    public static void print(Rectangle rectangle,int area, int perimeter){
        JOptionPane.showMessageDialog(null,"Base = " + rectangle.getBase() +"\n"+"High= " + rectangle.getHigh() +"\n"+
                                        "Area= "+area+"\n"+ "Perimeter= "+ perimeter);
    }
}
