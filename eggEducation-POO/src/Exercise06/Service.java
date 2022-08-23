package Exercise06;

import javax.swing.*;

public class Service {
    public CoffeeMaker constructor(){
        CoffeeMaker cm = new CoffeeMaker();
        cm.setMaxCapacity(Integer.parseInt(JOptionPane.showInputDialog(null,"Set the maximum coffee-maker capacity in ml.")));
        cm.setCurrentCapacity(Integer.parseInt(JOptionPane.showInputDialog(null,"Set the current capacity in ml.")));
        return cm;
    }

    public void fillCoffee(CoffeeMaker cm){
        int currentCapacity = cm.getMaxCapacity();
    }

    public void fillCup(CoffeeMaker cm){
        int cup = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter cup capacity in ml."));
        if(cup > cm.getMaxCapacity()){
            int left = cup - cm.getMaxCapacity();
            cup = cm.getMaxCapacity();
            JOptionPane.showMessageDialog(null,"The cup isn't fill. Left "+ left +" ml");
        } else {
            JOptionPane.showMessageDialog(null,"The cup is fill.");
        }
    }

    public void emptyCoffeeMaker(CoffeeMaker cm){
        int empty = 0;
        cm.setMaxCapacity(empty);
    }

    public void addCoffee(CoffeeMaker cm){
        int add = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter how much coffee would you add in ml."));
        add = add + cm.getCurrentCapacity();
        cm.setMaxCapacity(add);
    }
}
