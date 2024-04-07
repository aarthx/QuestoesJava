package introducaoEx;

import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();

        System.out.println("A soma dos números é: " + (num1 + num2) );
        System.out.println("A subtracao dos números é: " + (num1 - num2) );
        System.out.println("A multiplicação dos números é: " + (num1 * num2) );
        System.out.println("A divisão dos números é: " + ((double) num1 / num2) );
        entrada.close();

    }

}