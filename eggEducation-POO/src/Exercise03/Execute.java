/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
        a) Método constructor con todos los atributos pasados por parámetro.
        b) Metodo constructor sin los atributos pasados por parámetro.
        c) Métodos get y set.
        d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
            los atributos del objeto.
        e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
        f) Método restar(): calcular la resta de los números y devolver el resultado al main
        g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
            fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
            no, se hace la multiplicación y se devuelve el resultado al main
        h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
            una división por cero, el método devuelve 0 y se le informa al usuario el error se le.
            Si no, se hace la división y se devuelve el resultado al main.
*/
package Exercise03;

import javax.swing.*;

public class Execute {
    public static void main(String[] arg){
        Operation op = new Operation(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter number 1.")),
                        Double.parseDouble(JOptionPane.showInputDialog(null,"Enter number 2.")));
        double add = op.add(op.getNumber1(), op.getNumber2());
        double subtract = op.substract(op.getNumber1(), op.getNumber2());
        double multiplication = op.multiplication(op.getNumber1(), op.getNumber2());
        double division = op.division(op.getNumber1(), op.getNumber2());
        print(add,subtract,multiplication,division);
    }
    public static void print(double add, double subtract, double multiplication, double division){
        JOptionPane.showMessageDialog(null,"Addition: "+ add + "\n" + "Subtraction: "+ subtract + "\n" +
                                        "Multiplication: " + multiplication + "\n" + "Division: "+ division);
    }

}
