package introducaoEx.quest3;

import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        int fatorial = 1;

        System.out.println("Escreva um numero inteiro não negativo: ");
        num = entrada.nextInt();

        for(int i = num; i >= 1 ; i--) {
            fatorial *= i;
        }

        System.out.println("A fatorial desse número é: " + fatorial);
        entrada.close();
    }
}
