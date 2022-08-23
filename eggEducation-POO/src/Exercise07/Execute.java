/**Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
 ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
 atributo, puede hacerlo. Los métodos que se implementarán son:
        • Un constructor por defecto.
        • Un constructor con todos los atributos como parámetro.
        • Métodos getters y setters de cada atributo.
        • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
            usuario y después se le asignan a sus respectivos atributos para llenar el objeto
            Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
            Si no es correcto se deberá mostrar un mensaje
        • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
            kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
            que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
            fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
            está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
            fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
            función devuelve un 1.
        • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
            un booleano.

 A continuación, en la clase main hacer lo siguiente:
 Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
 los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
 sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
 mayor de edad.
 Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
 cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
 también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package Exercise07;

import javax.swing.*;

public class Execute {
    public static void main(String[] arg){

        Service obj = new Service();
        Person person1 = obj.person();
        Person person2 = obj.person();
        Person person3 = obj.person();
        Person person4 = obj.person();


        int imc1 = obj.calculateIMC(person1);
        boolean isAnAdult1 = obj.isAnAdult(person1);

        int imc2 = obj.calculateIMC(person2);
        boolean isAnAdult2 = obj.isAnAdult(person2);

        int imc3 = obj.calculateIMC(person3);
        boolean isAnAdult3 = obj.isAnAdult(person3);

        int imc4 = obj.calculateIMC(person4);
        boolean isAnAdult4 = obj.isAnAdult(person4);

        average(imc1,imc2,imc3,imc4);
        average(isAnAdult1,isAnAdult2,isAnAdult3,isAnAdult4);
        JOptionPane.showMessageDialog(null,person1.toString());
        JOptionPane.showMessageDialog(null,person2.toString());
        JOptionPane.showMessageDialog(null,person3.toString());
        JOptionPane.showMessageDialog(null,person4.toString());
    }

    public static void average(int imc1, int imc2, int imc3, int imc4){
        float prom = (imc1 + imc2 + imc3 + imc4) >> 2;
        JOptionPane.showMessageDialog(null,"The IMC average is: "+prom);
    }

    public static void average(boolean isAnAdult1, boolean isAnAdult2, boolean isAnAdult3, boolean isAnAdult4){
        int v = 0, f = 0;
        if (isAnAdult1){
            v = v + 1;
        } else {
            f = f + 1;
        }
        if (isAnAdult2){
            v = v + 1;
        } else {
            f = f + 1;
        }
        if (isAnAdult3){
            v = v + 1;
        } else {
            f = f + 1;
        }
        if (isAnAdult4){
            v = v + 1;
        } else {
            f = f + 1;
        }
        int numAdult = (v / 4) * 100;
        int numYouths = (f / 4) * 100;
        JOptionPane.showMessageDialog(null,"average of adults: "+ numAdult + "%" + "\n" +
                                                        "average of youths: "+ numYouths + "%");
    }
}
