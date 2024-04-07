package introducaoEx.quest2;

import javax.swing.JOptionPane;

public class NumerosEspacosPane {
    
    public static void main(String[] args) {
        
        int num, numAux, numImpresso;
        String result = "";

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));

        if(num <= 9999 || num > 99999) {
            JOptionPane.showMessageDialog(null, "Digite um número de 5 dígitos");
        } else {
            numAux = num;

            numImpresso = numAux / 10000;
            numAux %= 10000;
            result += numImpresso + "   ";

            numImpresso = numAux / 1000;
            numAux %= 1000;
            result += numImpresso + "   ";

            numImpresso = numAux / 100;
            numAux %= 100;
            result += numImpresso + "   ";

            numImpresso = numAux / 10;
            numAux %= 10;
            result += numImpresso + "   ";

            numImpresso = numAux;
            result += numImpresso;

            JOptionPane.showMessageDialog(null, result);
        }
        

        
    }
}
