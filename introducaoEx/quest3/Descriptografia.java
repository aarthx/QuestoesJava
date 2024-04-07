package introducaoEx.quest3;

import java.util.Scanner;

public class Descriptografia {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int digito1, digito2, digito3, digito4;
        int num, numAux;
        String numString, resultado;

        System.out.println("Digite o número para descriptografar: ");
        numString = entrada.nextLine();
        num = Integer.parseInt(numString);

        if(num < 0 || num > 9999) {
            System.out.println("Número inválido");
        } else {
            digito1 = num / 1000;
            num %= 1000;
            

            digito2 = num / 100;
            num %= 100;

            digito3 = num / 10;
            num %= 10;

            digito4 = num;

            numAux = digito2;
            digito2 = digito4;
            digito4 = numAux;

            numAux = digito1;
            digito1 = digito3;
            digito3 = numAux;

            if(digito1 < 7) {digito1 += 10;}
            if(digito2 < 7) {digito2 += 10;}
            if(digito3 < 7) {digito3 += 10;}
            if(digito4 < 7) {digito4 += 10;}

            digito1 -= 7;
            digito2 -= 7;
            digito3 -= 7;
            digito4 -= 7;

            num = 1000 * digito1 + 100 * digito2 + 10 * digito3 + digito4;

            resultado = String.format("%04d", num);

            System.out.println("O número descriptografado é: " + resultado);
        }

        
        entrada.close();
    }
}
