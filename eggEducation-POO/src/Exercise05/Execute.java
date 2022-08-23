/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
    a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    b) Agregar los métodos getters y setters correspondientes
    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
        y se la sumará a saldo actual.
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
        restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
        saldo actual en 0.
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
        usuario no saque más del 20%.
    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
*/
package Exercise05;

import javax.swing.*;

public class Execute {
    public static void main(String[] arg){
        int op;
        double balance = 0;

        Service account = new Service();
        Account account1 = account.createObject();

        op = selectOption();
        switch (op){
            case 1:
                balance = balance + account.deposit();
                break;
            case 2:
                balance = balance - account.extraction();
                break;
            case 3:
                balance = balance - account.quickExtraction();
                break;
            case 4:
                account.consult(account.createObject().getBalance());
                break;
            default:
                account.data(account.createObject().getAccountNumber(), account.createObject().getDni(), account.createObject().getBalance());
                break;
        }
        JOptionPane.showMessageDialog(null,account1.toString());
        account1 = null;
    }
    public static int selectOption(){
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Select one of the following options:" + "\n" + "\n" +
                    "1. Make a deposit." + "\n" +
                    "2. Make an extraction." + "\n" +
                    "3. Make a quick extraction. (20%  of your balance)" + "\n" +
                    "4. Consult balance." + "\n" +
                    "5. Consult data."));
        } while(op < 1 || op > 4);
        return op;
    }
}
