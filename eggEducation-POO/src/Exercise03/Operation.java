package Exercise03;

import javax.swing.*;

public class Operation {
    private double number1;
    private double number2;

    public Operation (double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public Operation(){

    }

    public double getNumber1() {
        return number1;
    }
    public void setNumber1(double number1) {
        this.number1 = number1;
    }
    public double getNumber2() {
        return number2;
    }
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void createOperation(double number1, double number2){
        this.number1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the first number."));
        this.number2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the second number."));
    }
    public double add(double number1, double number2){
        double add = number1 + number2;
        return add;
    }
    public double substract(double number1, double number2){
        double substract = number1 - number2;
        return substract;
    }
    public double multiplication(double number1, double number2){
        double multiplication;
        if(number1 == 0 || number2 == 0){
            multiplication = 0;
            JOptionPane.showMessageDialog(null,"There is an error. One number is zero.");
        } else {
            multiplication = number1 * number2;
        }
        return multiplication;
    }
    public double division(double number1, double number2){
        double division;
        if(number1 == 0 || number2 == 0){
            division = 0;
            JOptionPane.showMessageDialog(null,"There is an error. The divisor is zero.");
        } else {
            division = number1 / number2;
        }
        return division;
    }
}
