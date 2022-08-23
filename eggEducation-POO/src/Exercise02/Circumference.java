package Exercise02;

import javax.swing.*;

public class Circumference {
    private double radio;

    public Circumference(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double createCircumference(double radio){
        this.radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter radio of the circumference."));
        return radio;
    }
    public double calculateArea(){
        double area = 3.14 * radio * radio;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter = 2 * 3.14 * radio;
        return perimeter;
    }
}
