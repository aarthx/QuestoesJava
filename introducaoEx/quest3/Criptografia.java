package introducaoEx.quest3;

import java.util.Scanner;

public class Criptografia {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int digito1, digito2, digito3, digito4;
        int num, numAux;
        String numString, resultado;

        System.out.println("Digite um inteiro de 4 digitos: ");
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

            digito1 += 7;
            digito2 += 7;
            digito3 += 7;
            digito4 += 7;

            digito1 %= 10;
            digito2 %= 10;
            digito3 %= 10;
            digito4 %= 10;

            

            numAux = digito1;
            digito1 = digito3;
            digito3 = numAux;

            numAux = digito2;
            digito2 = digito4;
            digito4 = numAux;

            System.out.println(digito1);
            System.out.println(digito2);
            System.out.println(digito3);
            System.out.println(digito4);


            num = 1000 * (digito1) + 100 * digito2 + 10 * digito3 + digito4;

            resultado = String.format("%04d", num);

            System.out.println("Novo Numero criptografado: " + resultado);
            }
        entrada.close();
    }
}
