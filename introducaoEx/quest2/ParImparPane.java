package introducaoEx.quest2;

import javax.swing.JOptionPane;

public class ParImparPane {
    
    public static void main(String[] args) {
        
        int num1;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));

        if(num1 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par!");
        } else {
            JOptionPane.showMessageDialog(null, "O número é impar!");
        }

    }

}
