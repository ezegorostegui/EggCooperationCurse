/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
*/
package Exercise02;

import javax.swing.*;

public class Execute {
    public static void main(String[] arg){
        Circumference c1 = new Circumference(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter radio.")));
        double area = c1.calculateArea();
        double perimeter = c1.calculatePerimeter();
        print(area,perimeter,c1);
    }

    public static void print(double area, double perimeter, Circumference c1){
        JOptionPane.showMessageDialog(null,"Radio= "+ c1.getRadio() +"\n"+
                                        "Area= "+ area +"\n"+ "Perimeter= "+ perimeter);
    }
}
