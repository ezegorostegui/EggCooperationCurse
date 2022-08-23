package Exercise05;

import javax.swing.*;

public class Service {
    public Account createObject(){
        Account account1 = new Account();
        return new Account(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter account number.")),
                    Integer.parseInt(JOptionPane.showInputDialog(null,"Enter DNI.")),
                    Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a balance.")),0);
    }
    public double deposit(){
        boolean flag = false;
        int op;
        double deposit = createObject().getBalance(), aux;

        do {
            aux = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your deposit."));
            deposit = aux + deposit;
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "Press 1 if you would like to do another deposit."
                        + "\n" + "Press 2 if you wouldn't."));
            } while(op != 1 && op != 2);
            if(op == 2){
                flag = true;
            }
        } while(!flag);
        JOptionPane.showMessageDialog(null,"Your balance is: $"+deposit);
        return deposit;
    }
    public double extraction(){
        boolean flag = false;
        int op;
        double extraction = createObject().getBalance(), aux;

        do {
            aux = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your extraction."));
            if(aux > createObject().getBalance()){
                JOptionPane.showMessageDialog(null,"insufficient funds. Your balance is $"+createObject());
                flag = true;
            } else {
                extraction = extraction - aux;
                do {
                    op = Integer.parseInt(JOptionPane.showInputDialog(null, "Press 1 if you would like to do another extraction."
                            + "\n" + "Press 2 if you wouldn't."));
                } while(op != 1 && op != 2);
                if(op == 2){
                    flag = true;
                }
            }
        } while(!flag);
        JOptionPane.showMessageDialog(null,"Your balance is: $"+extraction);
        return extraction;
    }
    public double quickExtraction(){
        double extraction = createObject().getBalance() * 0.2;
        JOptionPane.showMessageDialog(null,"Your balance is: $"+extraction);
        return extraction;
    }
    public void consult(int balance){
        JOptionPane.showMessageDialog(null,"Your balance is $"+balance);
    }
    public void data(int accountNumber, int dni, int balance){
        JOptionPane.showMessageDialog(null,"Account number: "+accountNumber+"\n"+
                "DNI: "+dni+"\n"+ "Balance: $"+balance);
    }
}
