package introducaoEx.quest2;

import javax.swing.JOptionPane;

public class OperacoesPane {
    public static void main(String[] args) {

        int num1;
        int num2;


        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero"));

        JOptionPane.showMessageDialog(null, "A soma dos números é: " + (num1 + num2) + "\n A subtracao dos números é: " + (num1 - num2) + "\n A multiplicação dos números é: " + (num1 * num2) + "\n A divisão dos números é: " + ((double) num1 / num2));

    }

}